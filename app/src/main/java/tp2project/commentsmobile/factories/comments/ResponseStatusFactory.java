package tp2project.commentsmobile.factories.comments;
import org.joda.time.DateTime;
import tp2project.commentsmobile.domain.comments.ResponseStatus;

/**
 * Created by Bonga on 12/7/2016.
 */
public class ResponseStatusFactory {

    public static ResponseStatus getResponseStatus(String responseId,String status,DateTime date){
        ResponseStatus responseStatus = new ResponseStatus.Builder()
                .getResponseId(responseId)
                .getStatus(status)
                .getDate(date)
                .build();
        return responseStatus;
    }
}
