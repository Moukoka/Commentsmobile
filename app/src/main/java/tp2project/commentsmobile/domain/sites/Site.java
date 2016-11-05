package tp2project.commentsmobile.domain.sites;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 * Created by Tebogo/Quest on 2016/11/05.
 */

public class Site implements Serializable {
    String siteId;
    String name;
    String url;

    @JsonProperty("siteId")
    public String getSiteId() {
        return siteId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    private Site(){

    }

    public Site(Builder builder){
        this.siteId = builder.siteId;
        this.name = builder.name;
        this.url = builder.url;
    }

    public static class Builder{

        String siteId;
        String name;
        String url;

        @JsonProperty("siteId")
        public Builder getSiteId(String id){
            this.siteId = id;
            return this;
        }
        @JsonProperty("name")
        public Builder getName(String name){
            this.name = name;
            return this;
        }
        @JsonProperty("url")
        public Builder getUrl(String url){
            this.url = url;
            return this;
        }

        public Builder copy(Site site){
            this.siteId = site.siteId;
            this.name = site.name;
            this.url = site.url;
            return this;
        }
        public Site build(){return new Site(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Site site = (Site) o;
        return siteId.equals(site.siteId);

    }

    @Override
    public int hashCode() {
        return siteId.hashCode();
    }
}
