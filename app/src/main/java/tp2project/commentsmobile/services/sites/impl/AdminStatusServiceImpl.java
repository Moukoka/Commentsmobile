package tp2project.commentsmobile.services.sites.impl;

import java.util.List;

import tp2project.commentsmobile.client.Controller;
import tp2project.commentsmobile.client.sites.AdminStatusController;
import tp2project.commentsmobile.domain.sites.AdminStatus;
import tp2project.commentsmobile.services.sites.AdminStatusService;

/**
 * Created by Quest on 2016/11/06.
 */

public class AdminStatusServiceImpl implements AdminStatusService {

    final Controller<AdminStatus,String> rest = new AdminStatusController();

    @Override
    public AdminStatus findById(String s) {
        return rest.get(s);
    }

    @Override
    public String save(AdminStatus entity) {
        return rest.post(entity);
    }

    @Override
    public String update(AdminStatus entity) {
        return rest.post(entity);
    }

    @Override
    public String delete(AdminStatus entity) {
        return rest.delete(entity);
    }

    @Override
    public List<AdminStatus> findAll() {
        return rest.getAll();
    }
}
