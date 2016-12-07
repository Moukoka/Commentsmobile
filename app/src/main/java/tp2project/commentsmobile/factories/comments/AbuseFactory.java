package tp2project.commentsmobile.factories.comments;
import org.joda.time.DateTime;
import tp2project.commentsmobile.domain.comments.Abuse;
/**
 * Created by Bonga on 12/7/2016.
 */
public class AbuseFactory {


    public static Abuse getAbuse(String siteId,  String subjectId, String abuseId,String details,String commentIdOrResponseId,String emailId , DateTime date){
        Abuse abuse = new Abuse.Builder()
                .getSiteId(siteId)
                .getSubjectId(subjectId)
                .getAbuseId(abuseId)
                .getDetails(details)
                .getCommentIdOrResponseId(commentIdOrResponseId)
                .getEmailId(emailId)
                .getDate(date)
                .build();
        return abuse;
    }
}
