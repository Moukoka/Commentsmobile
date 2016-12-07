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
import tp2project.commentsmobile.domain.comments.ResponseStatus;

/**
 * Created by Bonga on 12/6/2016.
 */
public class ResponseStatusController implements Controller<ResponseStatus,String> {

    //Backend Url Comes Here
    final String BASE_URL = "https://no backend.yet";

    final HttpHeaders requestHeaders = ClientMethods.getHeaders();
    final RestTemplate restTemplate = ClientMethods.getRestTemplate();

    @Override
    public ResponseStatus get(String id) {
        final String url = BASE_URL + "ResponseStatus/" + id.toString();
        HttpEntity<ResponseStatus> requestEntity = new HttpEntity<>(requestHeaders);
        ResponseEntity<ResponseStatus> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, ResponseStatus.class);
        ResponseStatus responseStatus = responseEntity.getBody();
        return responseStatus;
    }

    @Override
    public String post(ResponseStatus entity) {
        final String url = BASE_URL+"abuse/create";
        HttpEntity<ResponseStatus> requestEntity = new HttpEntity<>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(ResponseStatus entity) {
        final String url = BASE_URL+"abuse/update/"+entity.getResponseId().toString();
        HttpEntity<ResponseStatus> requestEntity = new HttpEntity<ResponseStatus>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String delete(ResponseStatus entity) {
        final String url = BASE_URL+"abuse/delete/"+entity.getResponseId().toString();
        HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public List<ResponseStatus> getAll() {
        List<ResponseStatus> admin  = new ArrayList<>();
        final String url = BASE_URL+"abusies/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<ResponseStatus[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, ResponseStatus[].class);
        ResponseStatus[] results = responseEntity.getBody();

        for (ResponseStatus responseStatus : results) {
            admin.add(responseStatus);
        }
        return admin;
    }




    }