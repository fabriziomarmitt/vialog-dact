package co.bergamota.dataaccess;

import co.bergamota.business.objects.Publicacao;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PublicacaoRepository
{

    String solrUrl;
    int solrMaxResults;

    public PublicacaoRepository(){
        Properties prop = new Properties();
        try {
            prop.load(this.getClass().getClassLoader().getResourceAsStream("application.properties"));
            solrUrl = prop.getProperty("solr.url");
            solrMaxResults = Integer.parseInt(prop.getProperty("solr.maxResults"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Publicacao> search(String q){
        SolrClient solr = new HttpSolrClient.Builder(solrUrl).build();

        SolrQuery query = new SolrQuery();
        query.setRows(solrMaxResults);
        query.setQuery(String.format("search:%s", q));
        try {
            QueryResponse response = solr.query(query);
            return response.getBeans(Publicacao.class);
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}