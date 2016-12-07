package tp2project.commentsmobile.factories.comments;
import org.joda.time.DateTime;
import tp2project.commentsmobile.domain.comments.Response;

/**
 * Created by Bonga on 12/7/2016.
 */
public class ResponseFactory {

    public static Response getResponse(String commentId,String responseId, String response,String emailId,String ipaddress, DateTime date){
        Response respons = new Response.Builder()
                .getCommentId(commentId)
                .getResponseId(responseId)
                .getResponse(response)
                .getEmailId(emailId)
                .getIpaddress(ipaddress)
                .getDate(date)
                .build();
        return respons;
    }
}
