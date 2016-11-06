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
import tp2project.commentsmobile.domain.sites.AdminStatus;

/**
 * Created by Quest on 2016/11/06.
 */

public class AdminStatusController implements Controller<AdminStatus,String> {

    //Backend Url Comes Here
    final String BASE_URL = "https://no backend.yet";

    final HttpHeaders requestHeaders = ClientMethods.getHeaders();
    final RestTemplate restTemplate = ClientMethods.getRestTemplate();

    @Override
    public AdminStatus get(String id) {
        final String url = BASE_URL + "adminstatus/" + id.toString();
        HttpEntity<AdminStatus> requestEntity = new HttpEntity<>(requestHeaders);
        ResponseEntity<AdminStatus> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, AdminStatus.class);
        AdminStatus adminStatus = responseEntity.getBody();
        return adminStatus;
    }

    @Override
    public String post(AdminStatus entity) {
        final String url = BASE_URL+"adminstatus/create";
        HttpEntity<AdminStatus> requestEntity = new HttpEntity<>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(AdminStatus entity) {
        final String url = BASE_URL+"adminstatus/update/"+entity.getAdminStatusId().toString();
        HttpEntity<AdminStatus> requestEntity = new HttpEntity<AdminStatus>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String delete(AdminStatus entity) {
        final String url = BASE_URL+"adminstatus/delete/"+entity.getAdminStatusId().toString();
        HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public List<AdminStatus> getAll() {
        List<AdminStatus> adminStatuses = new ArrayList<>();
        final String url = BASE_URL+"adminstatuses/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<AdminStatus[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, AdminStatus[].class);
        AdminStatus[] results = responseEntity.getBody();

        for (AdminStatus adminStatus : results) {
            adminStatuses.add(adminStatus);
        }
        return adminStatuses;
    }
}
