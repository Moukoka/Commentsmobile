package tp2project.commentsmobile.services.comments.impl;
import java.util.List;
import tp2project.commentsmobile.client.Controller;
import tp2project.commentsmobile.client.comments.ResponseStatusController;
import tp2project.commentsmobile.domain.comments.ResponseStatus;
import tp2project.commentsmobile.services.comments.ResponseStatusService;

/**
 * Created by Bonga on 12/7/2016.
 */
public class ResponseStatusImpl implements ResponseStatusService {

    public final Controller<ResponseStatus,String> rest = new ResponseStatusController();

    @Override
    public ResponseStatus findById(String s) {
        return rest.get(s);
    }

    @Override
    public String save(ResponseStatus entity) {
        return rest.post(entity);
    }

    @Override
    public String update(ResponseStatus entity) {
        return rest.post(entity);
    }

    @Override
    public String delete(ResponseStatus entity) {
        return rest.delete(entity);
    }

    @Override
    public List<ResponseStatus> findAll() {
        return rest.getAll();
    }
}
