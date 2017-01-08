package co.bergamota.dataaccess;

import co.bergamota.business.objects.Publicacao;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PublicacaoRepository
{
    public List<Publicacao> search(String q){
        String urlString = "http://10.40.146.42:8983/solr/vialog";
        SolrClient solr = new HttpSolrClient.Builder(urlString).build();

        SolrQuery query = new SolrQuery();
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