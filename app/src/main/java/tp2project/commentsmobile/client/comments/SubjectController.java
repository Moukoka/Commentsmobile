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
import tp2project.commentsmobile.domain.comments.Subject;

/**
 * Created by Bonga on 12/6/2016.
 */
public class SubjectController implements Controller<Subject,String> {

    //Backend Url Comes Here
    final String BASE_URL = "https://no backend.yet";

    final HttpHeaders requestHeaders = ClientMethods.getHeaders();
    final RestTemplate restTemplate = ClientMethods.getRestTemplate();

    @Override
    public Subject get(String id) {
        final String url = BASE_URL + "Subject/" + id.toString();
        HttpEntity<Subject> requestEntity = new HttpEntity<>(requestHeaders);
        ResponseEntity<Subject> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Subject.class);
        Subject subject = responseEntity.getBody();
        return subject;
    }

    @Override
    public String post(Subject entity) {
        final String url = BASE_URL+"Subject/create";
        HttpEntity<Subject> requestEntity = new HttpEntity<>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(Subject entity) {
        final String url = BASE_URL+"abuse/update/"+entity.getSubjectId().toString();
        HttpEntity<Subject> requestEntity = new HttpEntity<Subject>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String delete(Subject entity) {
        final String url = BASE_URL+"abuse/delete/"+entity.getSubjectId().toString();
        HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public List<Subject> getAll() {
        List<Subject> admin  = new ArrayList<>();
        final String url = BASE_URL+"Subjects/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<Subject[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Subject[].class);
        Subject[] results = responseEntity.getBody();

        for (Subject subject : results) {
            admin.add(subject);
        }
        return admin;
    }
}
