package tp2project.commentsmobile.client.syslog;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import tp2project.commentsmobile.client.ClientMethods;
import tp2project.commentsmobile.client.Controller;
import tp2project.commentsmobile.domain.syslog.SystemLogEvents;

/**
 * Created by Quest on 2016/11/06.
 */

public class SystemLogEventsController implements Controller<SystemLogEvents,String> {

    //Backend Url Comes Here
    final String BASE_URL = "https://no backend.yet";

    final HttpHeaders requestHeaders = ClientMethods.getHeaders();
    final RestTemplate restTemplate = ClientMethods.getRestTemplate();

    @Override
    public SystemLogEvents get(String id) {
        final String url = BASE_URL + "systemlogevent/" + id.toString();
        HttpEntity<SystemLogEvents> requestEntity = new HttpEntity<>(requestHeaders);
        ResponseEntity<SystemLogEvents> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, SystemLogEvents.class);
        SystemLogEvents site = responseEntity.getBody();
        return site;
    }

    @Override
    public String post(SystemLogEvents entity) {
        final String url = BASE_URL+"systemlogevent/create";
        HttpEntity<SystemLogEvents> requestEntity = new HttpEntity<>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(SystemLogEvents entity) {
        final String url = BASE_URL+"systemlogevent/update/"+entity.getOrgCode().toString();
        HttpEntity<SystemLogEvents> requestEntity = new HttpEntity<SystemLogEvents>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String delete(SystemLogEvents entity) {
        final String url = BASE_URL+"systemlogevent/delete/"+entity.getOrgCode().toString();
        HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public List<SystemLogEvents> getAll() {
        List<SystemLogEvents> systemLogevents = new ArrayList<>();
        final String url = BASE_URL+"systemlogevents/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<SystemLogEvents[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, SystemLogEvents[].class);
        SystemLogEvents[] results = responseEntity.getBody();

        for (SystemLogEvents systemLogEvent : results) {
            systemLogevents.add(systemLogEvent);
        }
        return systemLogevents;
    }
}
