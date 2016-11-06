package tp2project.commentsmobile.domain.sites;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Quest on 2016/11/06.
 */

public class Administrators implements Serializable {

    String siteId;
    String emailId;

    @JsonProperty("siteId")
    public String getSiteId() {
        return siteId;
    }

    @JsonProperty("emailId")
    public String getEmailId() {
        return emailId;
    }

    public Administrators(Builder builder){
        this.siteId = builder.siteId;
        this.emailId = builder.emailId;
    }
    private Administrators(){}

    public static class Builder{

        String siteId;
        String emailId;

        @JsonProperty("siteId")
        public Builder getSiteId(String siteId){
            this.siteId = siteId;
            return this;
        }

        @JsonProperty("emailId")
        public Builder getEmailId(String emailId){
            this.emailId = emailId;
            return this;
        }

        public Builder copy(Administrators administrators){
            this.siteId = administrators.siteId;
            this.emailId = administrators.emailId;
            return this;
        }

        public Administrators build(){return  new Administrators(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Administrators that = (Administrators) o;

        return siteId.equals(that.siteId);

    }

    @Override
    public int hashCode() {
        return siteId.hashCode();
    }
}
