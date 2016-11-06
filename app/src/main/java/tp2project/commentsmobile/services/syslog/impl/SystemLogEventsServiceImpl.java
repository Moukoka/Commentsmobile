package tp2project.commentsmobile.services.syslog.impl;

import java.util.List;

import tp2project.commentsmobile.client.Controller;
import tp2project.commentsmobile.client.syslog.SystemLogEventsController;
import tp2project.commentsmobile.domain.syslog.SystemLogEvents;
import tp2project.commentsmobile.services.syslog.SystemLogEventsService;

/**
 * Created by Quest on 2016/11/06.
 */

public class SystemLogEventsServiceImpl implements SystemLogEventsService {

    public final Controller<SystemLogEvents,String> rest = new SystemLogEventsController();

    @Override
    public SystemLogEvents findById(String s) {
        return rest.get(s);
    }

    @Override
    public String save(SystemLogEvents entity) {
        return rest.post(entity);
    }

    @Override
    public String update(SystemLogEvents entity) {
        return rest.post(entity);
    }

    @Override
    public String delete(SystemLogEvents entity) {
        return rest.delete(entity);
    }

    @Override
    public List<SystemLogEvents> findAll() {
        return rest.getAll();
    }
}
