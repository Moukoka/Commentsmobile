package tp2project.commentsmobile.client.comments;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;
import tp2project.commentsmobile.client.ClientMethods;
import tp2project.commentsmobile.client.Controller;
import tp2project.commentsmobile.domain.comments.Response;

/**
 * Created by Bonga on 12/6/2016.
 */
public class ResponseController implements Controller<Response,String> {

    //Backend Url Comes Here
    final String BASE_URL = "https://no backend.yet";

    final HttpHeaders requestHeaders = ClientMethods.getHeaders();
    final RestTemplate restTemplate = ClientMethods.getRestTemplate();

    @Override
    public Response get(String id) {
        final String url = BASE_URL + "Response/" + id.toString();
        HttpEntity<Response> requestEntity = new HttpEntity<>(requestHeaders);
        ResponseEntity<Response> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Response.class);
        Response response = responseEntity.getBody();
        return response;
    }

    @Override
    public String post(Response entity) {
        final String url = BASE_URL+"abuse/create";
        HttpEntity<Response> requestEntity = new HttpEntity<>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(Response entity) {
        final String url = BASE_URL+"abuse/update/"+entity.getResponse().toString();
        HttpEntity<Response> requestEntity = new HttpEntity<Response>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String delete(Response entity) {
        final String url = BASE_URL+"response/delete/"+entity.getResponse().toString();
        HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public List<Response> getAll() {
        List<Response> admin  = new ArrayList<>();
        final String url = BASE_URL+"responses/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<Response[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Response[].class);
        Response[] results = responseEntity.getBody();

        for (Response response : results) {
            admin.add(response);
        }
        return admin;
    }
}
