package tp2project.commentsmobile.domain.comments;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * Created by Bonga on 12/6/2016.
 */
public class Abuse implements Serializable {


    String siteId;
    String subjectId;
    String abuseId;
    String details;
    String commentIdOrResponseId;
    String emailId;
    DateTime date;


    @JsonProperty("siteId")
    public String geSiteId() {
        return siteId;
    }

    @JsonProperty("subjectId")
    public String getSubjectId() {
        return subjectId;
    }

    @JsonProperty("abuseId")
    public String getAbuseId() {
        return abuseId;
    }

    @JsonProperty("details")
    public String getDetails() {
        return details;
    }

    @JsonProperty("commentIdOrResponseId")
    public String getcommentIdOrResponseId() {
        return commentIdOrResponseId;
    }

    @JsonProperty("emailId")
    public String getEmailId() {
        return emailId;
    }

    @JsonProperty("date")
    public DateTime getDate() {
        return date;
    }

    public Abuse(Builder builder){
        this.siteId = builder.siteId;
        this.subjectId = builder.subjectId;
        this.abuseId = builder.abuseId;
        this.details = builder.details;
        this.commentIdOrResponseId = builder.commentIdOrResponseId;
        this.emailId = builder.emailId;
        this.date = builder.date;
    }
    private Abuse(){}

    public static class Builder{

        String siteId;
        String subjectId;
        String abuseId;
        String details;
        String commentIdOrResponseId;
        String emailId;
        DateTime date;


        @JsonProperty("siteId")
        public Builder getSiteId(String siteId){
            this.siteId = siteId;
            return this;
        }



        @JsonProperty("subjectId")
        public Builder getSubjectId(String subjectId){
            this.subjectId = subjectId;
            return this;
        }

        @JsonProperty("abuseId")
        public Builder getAbuseId(String abuseId){
            this.abuseId = abuseId;
            return this;
        }


        @JsonProperty("details")
        public Builder getDetails(String details){
            this.details = details;
            return this;
        }

        @JsonProperty("commentIdOrResponseId")
        public Builder getCommentIdOrResponseId(String commentIdOrResponseId){
            this.commentIdOrResponseId = commentIdOrResponseId;
            return this;
        }
        @JsonProperty("emailId")
        public Builder getEmailId(String emailId){
            this.emailId =  emailId;
            return this;
        }

        @JsonProperty("date")
        public Builder getDate(DateTime date){
            this.date = date;
            return this;
        }

        public Builder copy(Abuse abuse){
            this.siteId = abuse.siteId;
            this.subjectId = abuse.subjectId;
            this.abuseId = abuse.abuseId;
            this.details = abuse.details;
            this.commentIdOrResponseId = abuse.commentIdOrResponseId;
            this.emailId = abuse.emailId;
            this.date = abuse.date;

            return this;
        }

        public Abuse build(){return new Abuse(this);}
    }
}
