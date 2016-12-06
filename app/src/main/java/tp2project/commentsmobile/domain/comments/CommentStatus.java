package tp2project.commentsmobile.domain.comments;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * Created by Bonga on 12/6/2016.
 */
public class CommentStatus implements Serializable {

    String commentId;
    String status;
    DateTime date;


    @JsonProperty("commentId")
    public String getCommentId() {
        return commentId;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("date")
    public DateTime getDate() {
        return date;
    }

    public CommentStatus(Builder builder){
        this.commentId = builder.commentId;
        this.status = builder.status;
        this.date = builder.date;
    }
    private CommentStatus(){}

    public static class Builder{

        String commentId;
        String status;
        DateTime date;

        @JsonProperty("commentId")
        public Builder getCommentId(String commentId){
            this.commentId = commentId;
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

        public Builder copy(CommentStatus commentStatus){

            this.commentId = commentStatus.commentId;
            this.status = commentStatus.status;
            this.date = commentStatus.date;

            return this;
        }

        public CommentStatus build(){return new CommentStatus(this);}
    }
}
