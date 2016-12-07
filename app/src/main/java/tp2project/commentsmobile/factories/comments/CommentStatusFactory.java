
    package tp2project.commentsmobile.factories.comments;
    import org.joda.time.DateTime;
    import tp2project.commentsmobile.domain.comments.CommentStatus;
    /**
     * Created by Bonga on 12/7/2016.
     */
     public class CommentStatusFactory {


        public static CommentStatus getCommentStatus(String commentId, String status, DateTime date) {
            CommentStatus commentStatus = new CommentStatus.Builder()
                    .getCommentId(commentId)
                    .getStatus(status)
                    .getDate(date)
                    .build();
            return commentStatus;
        }
    }
