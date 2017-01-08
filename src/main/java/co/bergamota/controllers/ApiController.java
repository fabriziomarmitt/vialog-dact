package co.bergamota.controllers;

import co.bergamota.business.objects.Publicacao;
import co.bergamota.dataaccess.PublicacaoRepository;
import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class ApiController {

    PublicacaoRepository publicacaoRepository;

    public ApiController(){
        publicacaoRepository = new PublicacaoRepository();
    }

    @RequestMapping( "/publicacoes/search")
    public ArrayList<Publicacao> searchPublicacoes(@RequestParam(value = "search") String search) {
        return Lists.newArrayList(publicacaoRepository.search(search));
    }


}