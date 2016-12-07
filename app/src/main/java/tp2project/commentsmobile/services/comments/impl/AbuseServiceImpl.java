package tp2project.commentsmobile.services.comments.impl;
import java.util.List;
import tp2project.commentsmobile.client.Controller;
import tp2project.commentsmobile.client.comments.AbuseController;
import tp2project.commentsmobile.domain.comments.Abuse;
import tp2project.commentsmobile.services.comments.AbuseService;

/**
 * Created by Bonga on 12/7/2016.
 */
public class AbuseServiceImpl implements AbuseService {


    public final Controller<Abuse,String> rest = new AbuseController();

    @Override
    public Abuse findById(String s) {
        return rest.get(s);
    }

    @Override
    public String save(Abuse entity) {
        return rest.post(entity);
    }

    @Override
    public String update(Abuse entity) {
        return rest.post(entity);
    }

    @Override
    public String delete(Abuse entity) {
        return rest.delete(entity);
    }

    @Override
    public List<Abuse> findAll() {
        return rest.getAll();
    }
}
