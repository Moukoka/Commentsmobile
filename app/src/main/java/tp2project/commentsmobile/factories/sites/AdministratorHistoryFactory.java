package tp2project.commentsmobile.factories.sites;

import org.joda.time.DateTime;

import tp2project.commentsmobile.domain.sites.AdministratorHistory;

/**
 * Created by Quest on 2016/11/06.
 */

public class AdministratorHistoryFactory {

    public static AdministratorHistory getAdministratorHistory(String siteId, String emailId, String adminStatusId, DateTime date){
        AdministratorHistory administratorHistory = new AdministratorHistory.Builder()
                .getSiteId(siteId)
                .getEmailId(emailId)
                .getAdminStatusId(adminStatusId)
                .getDate(date)
                .build();
        return administratorHistory;
    }
}
