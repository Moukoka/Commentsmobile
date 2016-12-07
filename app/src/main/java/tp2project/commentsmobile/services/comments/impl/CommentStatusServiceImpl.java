package tp2project.commentsmobile.services.comments.impl;
import java.util.List;
import tp2project.commentsmobile.client.Controller;
import tp2project.commentsmobile.client.comments.CommentStatusController;
import tp2project.commentsmobile.domain.comments.CommentStatus;
import tp2project.commentsmobile.services.comments.CommentStatusService;

/**
 * Created by Bonga on 12/7/2016.
 */
public class CommentStatusServiceImpl implements CommentStatusService {

    public final Controller<CommentStatus,String> rest = new CommentStatusController();

    @Override
    public CommentStatus findById(String s) {
        return rest.get(s);
    }

    @Override
    public String save(CommentStatus entity) {
        return rest.post(entity);
    }

    @Override
    public String update(CommentStatus entity) {
        return rest.post(entity);
    }

    @Override
    public String delete(CommentStatus entity) {
        return rest.delete(entity);
    }

    @Override
    public List<CommentStatus> findAll() {
        return rest.getAll();
    }
}
