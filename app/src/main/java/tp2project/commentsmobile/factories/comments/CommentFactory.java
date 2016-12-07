package tp2project.commentsmobile.factories.comments;
import org.joda.time.DateTime;
import tp2project.commentsmobile.domain.comments.Comment;

/**
 * Created by Bonga on 12/7/2016.
 */
public class CommentFactory {

    public static Comment getComment(String siteId,String subjectId, String commentId,String comment,String emailId,String ipaddress, DateTime date){
        Comment comm = new Comment.Builder()
                .getSiteId(siteId)
                .getSubjectId(subjectId)
                .getCommentId(commentId)
                .getComment(comment)
                .getEmailId(emailId)
                .getIpaddress(ipaddress)
                .getDate(date)
                .build();
        return comm;
    }
}
