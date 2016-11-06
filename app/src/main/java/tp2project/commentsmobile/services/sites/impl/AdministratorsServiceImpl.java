package tp2project.commentsmobile.services.sites.impl;

import java.util.List;

import tp2project.commentsmobile.client.Controller;
import tp2project.commentsmobile.client.sites.AdministratorsController;
import tp2project.commentsmobile.domain.sites.Administrators;
import tp2project.commentsmobile.services.sites.AdministratorsService;

/**
 * Created by Quest on 2016/11/06.
 */

public class AdministratorsServiceImpl implements AdministratorsService {


    public final Controller<Administrators,String> rest = new AdministratorsController();

    @Override
    public Administrators findById(String s) {
        return rest.get(s);
    }

    @Override
    public String save(Administrators entity) {
        return rest.post(entity);
    }

    @Override
    public String update(Administrators entity) {
        return rest.post(entity);
    }

    @Override
    public String delete(Administrators entity) {
        return rest.delete(entity);
    }

    @Override
    public List<Administrators> findAll() {
        return rest.getAll();
    }
}
