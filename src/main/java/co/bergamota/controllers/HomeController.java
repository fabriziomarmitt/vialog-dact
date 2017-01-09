package co.bergamota.controllers;

import co.bergamota.dataaccess.PublicacaoRepository;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Scanner;

@Controller
@EnableAutoConfiguration
@RequestMapping(value = {"/","/home"})
public class HomeController {
    final static int BUFFER = 2048;

    PublicacaoRepository publicacaoRepository;

    public HomeController(){
        publicacaoRepository = new PublicacaoRepository();
    }

    @RequestMapping( value = {"/", "/index"})
    public String indexAction (ModelMap model) {
        model.addAttribute("name", "world");
        return "home/index";
    }

    @RequestMapping("/download/comprovante/{cte}")
    public void downloadComprovante(@PathVariable("cte") String cte, HttpServletResponse response) throws IOException{
        getFile(cte, "./%s.jpg", response);
    }


    @RequestMapping("/download/xml/{cte}")
    public void downloadXml(@PathVariable("cte") String cte, HttpServletResponse response) throws IOException{
        getFile(cte, "./%s-cte.xml", response);
    }

    @Value("${tar.directory.location}")
    String tarDirectoryLocation;

    @Value("${tarDescription.directory.location}")
    String tarDescriptionDirectoryLocation;

    private void getFile(String cte, String searchFormat, HttpServletResponse response) throws IOException {
        File f = new File(tarDescriptionDirectoryLocation);
        File[] files = f.listFiles((dir, name) -> name.endsWith("tar.gz.txt"));
        File currentFile = null;
        try {
            for(File file : files){
                Scanner scanner = null;
                scanner = new Scanner(file);
                if(scanner.findWithinHorizon(String.format(searchFormat, cte), 0) != null){
                    currentFile = file;
                    break;
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(currentFile == null || (currentFile != null && ! currentFile.exists())){
            response.setStatus(500);
            response.getWriter().print("{ mensage:'error' }");
        }else {
            try {
                String tarName = String.format("%s/%s", tarDirectoryLocation, currentFile.getName().replace(".txt", ""));
                FileInputStream fin = new FileInputStream(tarName);
                BufferedInputStream in = new BufferedInputStream(fin);
                GzipCompressorInputStream gzIn = new GzipCompressorInputStream(in);
                TarArchiveInputStream tarIn = new TarArchiveInputStream(gzIn);
                TarArchiveEntry entry = null;
                while ((entry = (TarArchiveEntry) tarIn.getNextEntry()) != null) {
                    if (!entry.getName().endsWith(String.format(searchFormat, cte))) {
                        continue;
                    }
                    int count;
                    byte data[] = new byte[BUFFER];
                    while ((count = tarIn.read(data, 0, BUFFER)) != -1) {
                        response.getOutputStream().write(data, 0, count);
                    }
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
