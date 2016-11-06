package tp2project.commentsmobile.factories.sites;

import tp2project.commentsmobile.domain.sites.AdminStatus;

/**
 * Created by Quest on 2016/11/06.
 */

public class AdminStatusFactory {

    public static AdminStatus getAdminStatus(String id,String name){
        AdminStatus adminStatus = new AdminStatus.Builder()
                .getAdminStatus(id)
                .getName(name)
                .build();
        return adminStatus;
    }
}
