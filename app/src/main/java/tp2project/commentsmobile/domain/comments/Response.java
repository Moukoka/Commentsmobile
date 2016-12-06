package tp2project.commentsmobile.domain.comments;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * Created by Bonga on 12/6/2016.
 */
public class Response implements Serializable {

    String commentId;
    String responseId;
    String response;
    String emailId;
    String ipaddress;
    DateTime date;


    @JsonProperty("commentId")
    public String getCommentIdSiteId() {
        return commentId;
    }

    @JsonProperty("responseId")
    public String getResponseId() {
        return responseId;
    }

    @JsonProperty("response")
    public String getResponse() {
        return response;
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

    public Response(Builder builder){
        this.commentId = builder.commentId;
        this.responseId = builder.responseId;
        this.response = builder.response;
        this.emailId = builder.emailId;
        this.ipaddress = builder.ipaddress;
        this.emailId = builder.emailId;
        this.date = builder.date;
    }
    private Response(){}

    public static class Builder{

        String commentId;
        String responseId;
        String response;
        String emailId;
        String ipaddress;
        DateTime date;

        @JsonProperty("commentId")
        public Builder getCommentId(String commentId){
            this.commentId = commentId;
            return this;
        }

        @JsonProperty("responseId")
        public Builder getResponseId(String responseId){
            this.responseId = responseId;
            return this;
        }

        @JsonProperty("response")
        public Builder getResponse (String response){
            this.response = response;
            return this;
        }


        @JsonProperty("emailId")
        public Builder getEmailId(String emailId){
            this.emailId = emailId;
            return this;
        }

        @JsonProperty("ipaddress")
        public Builder getIpaddress(String ipaddress){
            this.ipaddress = ipaddress;
            return this;
        }

        @JsonProperty("date")
        public Builder getDate(DateTime date){
            this.date = date;
            return this;
        }

        public Builder copy(Response response){
            this.commentId = response.commentId;
            this.responseId = response.responseId;
            this.response = response.response;
            this.emailId = response.emailId;
            this.ipaddress = response.ipaddress;
            this.emailId = response.emailId;
            this.date = response.date;

            return this;
        }

        public Response build(){return new Response(this);}
    }
}


