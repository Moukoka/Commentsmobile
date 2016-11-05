package tp2project.commentsmobile.client.sites;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;
import tp2project.commentsmobile.client.ClientMethods;
import tp2project.commentsmobile.client.Controller;
import tp2project.commentsmobile.domain.sites.Site;

/**
 * Created by Quest on 2016/11/05.
 */

public class SiteController implements Controller<Site,String>{

    //Backend Url Comes Here
    final String BASE_URL = "https://no backend.yet";

    final HttpHeaders requestHeaders = ClientMethods.getHeaders();
    final RestTemplate restTemplate = ClientMethods.getRestTemplate();

    @Override
    public Site get(String id) {
        final String url = BASE_URL + "site/" + id.toString();
        HttpEntity<Site> requestEntity = new HttpEntity<>(requestHeaders);
        ResponseEntity<Site> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Site.class);
        Site site = responseEntity.getBody();
        return site;
    }

    @Override
    public String post(Site entity) {
        final String url = BASE_URL+"site/create";
        HttpEntity<Site> requestEntity = new HttpEntity<>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(Site entity) {
        final String url = BASE_URL+"site/update/"+entity.getSiteId().toString();
        HttpEntity<Site> requestEntity = new HttpEntity<Site>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String delete(Site entity) {
        final String url = BASE_URL+"site/delete/"+entity.getSiteId().toString();
        HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public List<Site> getAll() {
        List<Site> sites = new ArrayList<>();
        final String url = BASE_URL+"sites/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<Site[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Site[].class);
        Site[] results = responseEntity.getBody();

        for (Site site : results) {
            sites.add(site);
        }
        return sites;
    }
}
