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
import tp2project.commentsmobile.domain.comments.Comment;

/**
 * Created by Bonga on 12/6/2016.
 */
public class CommentController implements Controller <Comment,String> {

    //Backend Url Comes Here
    final String BASE_URL = "https://no backend.yet";

    final HttpHeaders requestHeaders = ClientMethods.getHeaders();
    final RestTemplate restTemplate = ClientMethods.getRestTemplate();

    @Override
    public Comment get(String id) {
        final String url = BASE_URL + "comment/" + id.toString();
        HttpEntity<Comment> requestEntity = new HttpEntity<>(requestHeaders);
        ResponseEntity<Comment> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Comment.class);
        Comment comment = responseEntity.getBody();
        return comment;
    }

    @Override
    public String post(Comment entity) {
        final String url = BASE_URL+"comment/create";
        HttpEntity<Comment> requestEntity = new HttpEntity<>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(Comment entity) {
        final String url = BASE_URL+"comment/update/"+entity.getComment().toString();
        HttpEntity<Comment> requestEntity = new HttpEntity<Comment>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String delete(Comment entity) {
        final String url = BASE_URL+"abuse/delete/"+entity.getComment().toString();
        HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public List<Comment> getAll() {
        List<Comment> admin  = new ArrayList<>();
        final String url = BASE_URL+"comments/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<Comment[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Comment[].class);
        Comment[] results = responseEntity.getBody();

        for (Comment comment : results) {
            admin.add(comment);
        }
        return admin;
    }
}
