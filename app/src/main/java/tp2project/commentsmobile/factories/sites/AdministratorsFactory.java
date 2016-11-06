package tp2project.commentsmobile.factories.sites;

import tp2project.commentsmobile.domain.sites.Administrators;

/**
 * Created by Quest on 2016/11/06.
 */

public class AdministratorsFactory {

    public static Administrators getAdministrators(String siteId,String emailId){

        Administrators administrators = new Administrators.Builder()
                .getSiteId(siteId)
                .getEmailId(emailId)
                .build();
        return administrators;
    }
}
