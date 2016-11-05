package tp2project.commentsmobile.factories.sites;

import tp2project.commentsmobile.domain.sites.Site;

/**
 * Created by Quest on 2016/11/05.
 */

public class SiteFactory {

    public static Site getSite(String siteId,String name,String url){
        Site site = new Site.Builder()
                .getSiteId(siteId)
                .getName(name)
                .getUrl(url)
                .build();
         return site;
    }
}
