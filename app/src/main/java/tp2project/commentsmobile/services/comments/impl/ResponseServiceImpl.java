package tp2project.commentsmobile.services.comments.impl;
import java.util.List;
import tp2project.commentsmobile.client.Controller;
import tp2project.commentsmobile.client.comments.ResponseController;
import tp2project.commentsmobile.domain.comments.Response;
import tp2project.commentsmobile.services.comments.ResponseService;

/**
 * Created by Bonga on 12/7/2016.
 */
public class ResponseServiceImpl implements ResponseService {

    public final Controller<Response,String> rest = new ResponseController();

    @Override
    public Response findById(String s) {
        return rest.get(s);
    }

    @Override
    public String save(Response entity) {
        return rest.post(entity);
    }

    @Override
    public String update(Response entity) {
        return rest.post(entity);
    }

    @Override
    public String delete(Response entity) {
        return rest.delete(entity);
    }

    @Override
    public List<Response> findAll() {
        return rest.getAll();
    }
}
