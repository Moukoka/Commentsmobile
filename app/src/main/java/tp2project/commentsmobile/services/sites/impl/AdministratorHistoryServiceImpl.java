package tp2project.commentsmobile.services.sites.impl;

import java.util.List;

import tp2project.commentsmobile.client.Controller;
import tp2project.commentsmobile.client.sites.AdministratorHistoryController;
import tp2project.commentsmobile.domain.sites.AdministratorHistory;
import tp2project.commentsmobile.services.sites.AdministratorHistoryService;

/**
 * Created by Quest on 2016/11/06.
 */

public class AdministratorHistoryServiceImpl implements AdministratorHistoryService {

    public final Controller<AdministratorHistory,String> rest = new AdministratorHistoryController();

    @Override
    public AdministratorHistory findById(String s) {
        return rest.get(s);
    }

    @Override
    public String save(AdministratorHistory entity) {
        return rest.post(entity);
    }

    @Override
    public String update(AdministratorHistory entity) {
        return rest.post(entity);
    }

    @Override
    public String delete(AdministratorHistory entity) {
        return rest.delete(entity);
    }

    @Override
    public List<AdministratorHistory> findAll() {
        return rest.getAll();
    }
}
