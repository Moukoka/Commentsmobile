package tp2project.commentsmobile.services.comments.impl;
import java.util.List;
import tp2project.commentsmobile.client.Controller;
import tp2project.commentsmobile.client.comments.SubjectController;
import tp2project.commentsmobile.domain.comments.Subject;
import tp2project.commentsmobile.services.comments.SubjectService;

/**
 * Created by Bonga on 12/7/2016.
 */
public class SubjectServiceImpl implements SubjectService {

    public final Controller<Subject,String> rest = new SubjectController();

    @Override
    public Subject findById(String s) {
        return rest.get(s);
    }

    @Override
    public String save(Subject entity) {
        return rest.post(entity);
    }

    @Override
    public String update(Subject entity) {
        return rest.post(entity);
    }

    @Override
    public String delete(Subject entity) {
        return rest.delete(entity);
    }

    @Override
    public List<Subject> findAll() {
        return rest.getAll();
    }
}
