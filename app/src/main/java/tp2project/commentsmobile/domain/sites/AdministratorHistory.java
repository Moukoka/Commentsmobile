package tp2project.commentsmobile.domain.sites;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * Created by Quest on 2016/11/06.
 */

public class AdministratorHistory implements Serializable {

    String siteId;
    String emailId;
    String adminStatusId;
    DateTime date;

    @JsonProperty("siteId")
    public String getSiteId() {
        return siteId;
    }

    @JsonProperty("emailId")
    public String getEmailId() {
        return emailId;
    }

    @JsonProperty("adminStatusId")
    public String getAdminStatusId() {
        return adminStatusId;
    }

    @JsonProperty("date")
    public DateTime getDate() {
        return date;
    }

    public AdministratorHistory(Builder builder){
        this.siteId = builder.siteId;
        this.emailId = builder.emailId;
        this.adminStatusId = builder.adminStatusId;
        this.date = builder.date;
    }
    private AdministratorHistory(){}

    public static class Builder{

        String siteId;
        String emailId;
        String adminStatusId;
        DateTime date;

        @JsonProperty("siteId")
        public Builder getSiteId(String siteId){
            this.siteId = siteId;
            return this;
        }
        @JsonProperty("emailId")
        public Builder getEmailId(String emailId){
            this.emailId =  emailId;
            return this;
        }
        @JsonProperty("adminStatusId")
        public Builder getAdminStatusId(String adminStatusId){
            this.adminStatusId = adminStatusId;
            return this;
        }
        @JsonProperty("date")
        public Builder getDate(DateTime date){
            this.date = date;
            return this;
        }

        public Builder copy(AdministratorHistory administratorHistory){
            this.siteId = administratorHistory.siteId;
            this.emailId = administratorHistory.emailId;
            this.adminStatusId = administratorHistory.adminStatusId;
            this.date = administratorHistory.date;
            return this;
        }

        public AdministratorHistory build(){return new AdministratorHistory(this);}
    }
}
