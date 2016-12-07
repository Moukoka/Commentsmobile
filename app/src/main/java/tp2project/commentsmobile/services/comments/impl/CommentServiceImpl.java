package tp2project.commentsmobile.services.comments.impl;
import java.util.List;
import tp2project.commentsmobile.client.Controller;
import tp2project.commentsmobile.client.comments.CommentController;
import tp2project.commentsmobile.domain.comments.Comment;
import tp2project.commentsmobile.services.comments.CommentService;

/**
 * Created by Bonga on 12/7/2016.
 */
public class CommentServiceImpl implements CommentService {

    public final Controller<Comment,String> rest = new CommentController();

    @Override
    public Comment findById(String s) {
        return rest.get(s);
    }

    @Override
    public String save(Comment entity) {
        return rest.post(entity);
    }

    @Override
    public String update(Comment entity) {
        return rest.post(entity);
    }

    @Override
    public String delete(Comment entity) {
        return rest.delete(entity);
    }

    @Override
    public List<Comment> findAll() {
        return rest.getAll();
    }
}
