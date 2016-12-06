package tp2project.commentsmobile.domain.comments;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * Created by Bonga on 12/6/2016.
 */
public class ResponseStatus implements Serializable {

    String responseId;
    String status;
    DateTime date;

    @JsonProperty("responseId")
    public String getResponseId() {
        return responseId;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("date")
    public DateTime getDate() {
        return date;
    }

    public ResponseStatus(Builder builder){
        this.responseId = builder.responseId;
        this.status = builder.status;
        this.date = builder.date;
    }
    private ResponseStatus(){}

    public static class Builder{

        String responseId;
        String status;
        DateTime date;

        @JsonProperty("responseId")
        public Builder getResponseId(String responseId){
            this.responseId = responseId;
            return this;
        }

        @JsonProperty("status")
        public Builder getStatus(String status){
            this.status = status;
            return this;
        }

        @JsonProperty("date")
        public Builder getDate(DateTime date){
            this.date = date;
            return this;
        }

        public Builder copy(ResponseStatus responseStatus){

            this.responseId = responseStatus.responseId;
            this.status = responseStatus.status;
            this.date = responseStatus.date;

            return this;
        }

        public ResponseStatus build(){return new ResponseStatus(this);}
    }
}
