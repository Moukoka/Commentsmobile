package tp2project.commentsmobile.domain.comments;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * Created by Bonga on 12/6/2016.
 */
public class Subject implements Serializable {

    String siteId;
    String subjectId;
    String name;
    String url;
    DateTime date;

    @JsonProperty("siteId")
    public String geSiteId() {
        return siteId;
    }

    @JsonProperty("subjectId")
    public String getSubjectId() {
        return subjectId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }


    @JsonProperty("date")
    public DateTime getDate() {
        return date;
    }

    public Subject(Builder builder){
        this.siteId = builder.siteId;
        this.subjectId = builder.subjectId;
        this.name = builder.name;
        this.url = builder.url;
        this.date = builder.date;
    }
    private Subject(){}

    public static class Builder{

        String siteId;
        String subjectId;
        String name;
        String url;
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

        @JsonProperty("date")
        public Builder getDate(DateTime date){
            this.date = date;
            return this;
        }

        public Builder copy(Subject subject){
            this.siteId = subject.siteId;
            this.subjectId = subject.subjectId;
            this.name = subject.name;
            this.url = subject.url;
            this.date = subject.date;

            return this;
        }

        public Subject build(){return new Subject(this);}
    }
}
