package tp2project.commentsmobile.services.sites.impl;

import java.util.List;

import tp2project.commentsmobile.client.Controller;
import tp2project.commentsmobile.client.sites.SiteController;
import tp2project.commentsmobile.domain.sites.Site;
import tp2project.commentsmobile.services.sites.SiteService;

/**
 * Created by Quest on 2016/11/05.
 */

public class SiteServiceImpl implements SiteService{

    final Controller<Site,String> rest = new SiteController();

    @Override
    public Site findById(String aLong) {
        return rest.get(aLong);
    }

    @Override
    public String save(Site entity) {
        return rest.post(entity);
    }

    @Override
    public String update(Site entity) {
        return rest.put(entity);
    }

    @Override
    public String delete(Site entity) {
        return rest.delete(entity);
    }

    @Override
    public List<Site> findAll() {
        return rest.getAll();
    }
}
