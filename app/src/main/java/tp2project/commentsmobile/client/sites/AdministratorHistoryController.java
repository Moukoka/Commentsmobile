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
import tp2project.commentsmobile.domain.sites.AdministratorHistory;

/**
 * Created by Quest on 2016/11/06.
 */

public class AdministratorHistoryController implements Controller<AdministratorHistory,String> {

    //Backend Url Comes Here
    final String BASE_URL = "https://no backend.yet";

    final HttpHeaders requestHeaders = ClientMethods.getHeaders();
    final RestTemplate restTemplate = ClientMethods.getRestTemplate();

    @Override
    public AdministratorHistory get(String id) {
        final String url = BASE_URL + "administratorHistory/" + id.toString();
        HttpEntity<AdministratorHistory> requestEntity = new HttpEntity<>(requestHeaders);
        ResponseEntity<AdministratorHistory> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, AdministratorHistory.class);
        AdministratorHistory administrators = responseEntity.getBody();
        return administrators;
    }

    @Override
    public String post(AdministratorHistory entity) {
        final String url = BASE_URL+"administratorHistory/create";
        HttpEntity<AdministratorHistory> requestEntity = new HttpEntity<>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(AdministratorHistory entity) {
        final String url = BASE_URL+"administratorHistory/update/"+entity.getSiteId().toString();
        HttpEntity<AdministratorHistory> requestEntity = new HttpEntity<AdministratorHistory>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String delete(AdministratorHistory entity) {
        final String url = BASE_URL+"administratorHistory/delete/"+entity.getSiteId().toString();
        HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public List<AdministratorHistory> getAll() {
        List<AdministratorHistory> admin = new ArrayList<>();
        final String url = BASE_URL+"administratorHistories/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<AdministratorHistory[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, AdministratorHistory[].class);
        AdministratorHistory[] results = responseEntity.getBody();

        for (AdministratorHistory administrators : results) {
            admin.add(administrators);
        }
        return admin;
    }
}
