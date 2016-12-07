package tp2project.commentsmobile.factories.comments;
import org.joda.time.DateTime;
import tp2project.commentsmobile.domain.comments.Subject;

/**
 * Created by Bonga on 12/7/2016.
 */
public class SubjectFactory {


    public static Subject getSubject(String siteId,  String subjectId, String name,String url,DateTime date){
        Subject subject = new Subject.Builder()
                .getSiteId(siteId)
                .getSubjectId(subjectId)
                .getName(name)
                .getUrl(url)
                .getDate(date)
                .build();
        return subject;
    }
}
