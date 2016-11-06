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
import tp2project.commentsmobile.domain.sites.Administrators;

/**
 * Created by Quest on 2016/11/06.
 */

public class AdministratorsController implements Controller<Administrators,String> {

    //Backend Url Comes Here
    final String BASE_URL = "https://no backend.yet";

    final HttpHeaders requestHeaders = ClientMethods.getHeaders();
    final RestTemplate restTemplate = ClientMethods.getRestTemplate();

    @Override
    public Administrators get(String id) {
        final String url = BASE_URL + "administrator/" + id.toString();
        HttpEntity<Administrators> requestEntity = new HttpEntity<>(requestHeaders);
        ResponseEntity<Administrators> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Administrators.class);
        Administrators administrators = responseEntity.getBody();
        return administrators;
    }

    @Override
    public String post(Administrators entity) {
        final String url = BASE_URL+"administrator/create";
        HttpEntity<Administrators> requestEntity = new HttpEntity<>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(Administrators entity) {
        final String url = BASE_URL+"administrator/update/"+entity.getSiteId().toString();
        HttpEntity<Administrators> requestEntity = new HttpEntity<Administrators>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String delete(Administrators entity) {
        final String url = BASE_URL+"administrator/delete/"+entity.getSiteId().toString();
        HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public List<Administrators> getAll() {
        List<Administrators> admin = new ArrayList<>();
        final String url = BASE_URL+"administrators/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<Administrators[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Administrators[].class);
        Administrators[] results = responseEntity.getBody();

        for (Administrators administrators : results) {
            admin.add(administrators);
        }
        return admin;
    }
}
