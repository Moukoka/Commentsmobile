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
import tp2project.commentsmobile.domain.comments.Abuse;


/**
 * Created by Bonga on 12/5/2016.
 */
public class AbuseController implements Controller<Abuse,String> {

    //Backend Url Comes Here
    final String BASE_URL = "https://no backend.yet";

    final HttpHeaders requestHeaders = ClientMethods.getHeaders();
    final RestTemplate restTemplate = ClientMethods.getRestTemplate();

    @Override
    public Abuse get(String id) {
        final String url = BASE_URL + "Abuse/" + id.toString();
        HttpEntity<Abuse> requestEntity = new HttpEntity<>(requestHeaders);
        ResponseEntity<Abuse> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Abuse.class);
        Abuse abuse = responseEntity.getBody();
        return abuse;
    }

    @Override
    public String post(Abuse entity) {
        final String url = BASE_URL+"abuse/create";
        HttpEntity<Abuse> requestEntity = new HttpEntity<>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(Abuse entity) {
        final String url = BASE_URL+"abuse/update/"+entity.getAbuseId().toString();
        HttpEntity<Abuse> requestEntity = new HttpEntity<Abuse>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String delete(Abuse entity) {
        final String url = BASE_URL+"abuse/delete/"+entity.getAbuseId().toString();
        HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public List<Abuse> getAll() {
        List<Abuse> admin  = new ArrayList<>();
        final String url = BASE_URL+"abusies/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<Abuse[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Abuse[].class);
        Abuse[] results = responseEntity.getBody();

        for (Abuse abuse : results) {
            admin.add(abuse);
        }
        return admin;
    }
}
