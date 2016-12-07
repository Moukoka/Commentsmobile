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
import tp2project.commentsmobile.domain.comments.CommentStatus;

/**
 * Created by Bonga on 12/6/2016.
 */
public class CommentStatusController implements Controller<CommentStatus,String> {

    //Backend Url Comes Here
    final String BASE_URL = "https://no backend.yet";

    final HttpHeaders requestHeaders = ClientMethods.getHeaders();
    final RestTemplate restTemplate = ClientMethods.getRestTemplate();

    @Override
    public CommentStatus get(String id) {
        final String url = BASE_URL + "CommentStatus/" + id.toString();
        HttpEntity<CommentStatus> requestEntity = new HttpEntity<>(requestHeaders);
        ResponseEntity<CommentStatus> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, CommentStatus.class);
        CommentStatus commentStatus = responseEntity.getBody();
        return commentStatus;
    }

    @Override
    public String post(CommentStatus entity) {
        final String url = BASE_URL+"abuse/create";
        HttpEntity<CommentStatus> requestEntity = new HttpEntity<>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(CommentStatus entity) {
        final String url = BASE_URL+"CommentStatus/update/"+entity.getCommentId().toString();
        HttpEntity<CommentStatus> requestEntity = new HttpEntity<CommentStatus>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String delete(CommentStatus entity) {
        final String url = BASE_URL+"CommentStatus/delete/"+entity.getCommentId().toString();
        HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public List<CommentStatus> getAll() {
        List<CommentStatus> admin  = new ArrayList<>();
        final String url = BASE_URL+"abusies/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<CommentStatus[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, CommentStatus[].class);
        CommentStatus[] results = responseEntity.getBody();

        for (CommentStatus commentStatus : results) {
            admin.add(commentStatus);
        }
        return admin;
    }
}

