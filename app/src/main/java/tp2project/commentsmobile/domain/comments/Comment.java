package tp2project.commentsmobile.domain.comments;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * Created by Bonga on 12/6/2016.
 */
public class Comment implements Serializable {

    String siteId;
    String subjectId;
    String commentId;
    String comment;
    String emailId;
    String ipaddress;
    DateTime date;

    @JsonProperty("siteId")
    public String geSiteId() {
        return siteId;
    }

    @JsonProperty("subjectId")
    public String getSubjectId() {
        return subjectId;
    }

    @JsonProperty("commentId")
    public String getCommentId() {
        return commentId;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("emailId")
    public String getEmailId() {
        return emailId;
    }

    @JsonProperty("ipaddress")
    public String getIpaddress() {
        return ipaddress;
    }

    @JsonProperty("date")
    public DateTime getDate() {
        return date;
    }

    public Comment(Builder builder){
        this.siteId = builder.siteId;
        this.subjectId = builder.subjectId;
        this.commentId = builder.commentId;
        this.comment = builder.comment;
        this.emailId = builder.emailId;
        this.ipaddress = builder.ipaddress;
        this.date = builder.date;
    }
    private Comment(){}

    public static class Builder{

        String siteId;
        String subjectId;
        String commentId;
        String comment;
        String emailId;
        String ipaddress;
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

        @JsonProperty("commentId")
        public Builder getCommentId(String commentId){
            this.commentId = commentId;
            return this;
        }


        @JsonProperty("comment")
        public Builder getComment(String comment){
            this.comment = comment;
            return this;
        }

        @JsonProperty("commentIdOrResponseId")
        public Builder getCommentIdOrResponseId(String commentIdOrResponseId){
            this.ipaddress = ipaddress;
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

        public Builder copy(Comment comment){
            this.siteId = comment.siteId;
            this.subjectId = comment.subjectId;
            this.commentId = comment.commentId;
            this.comment = comment.comment;
            this.emailId = comment.emailId;
            this.ipaddress = comment.ipaddress;
            this.date = comment.date;

            return this;
        }

        public Comment build(){return new Comment(this);}
    }
}
