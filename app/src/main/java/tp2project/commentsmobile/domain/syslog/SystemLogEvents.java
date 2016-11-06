package tp2project.commentsmobile.domain.syslog;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.joda.time.DateTime;

import java.io.Serializable;

import tp2project.commentsmobile.domain.sites.AdminStatus;

/**
 * Created by Quest on 2016/11/06.
 */

public class SystemLogEvents implements Serializable {

    String orgCode;
    String id;
    String eventName;
    String eventType;
    String message;
    DateTime date;

    @JsonProperty("orgCode")
    public String getOrgCode() {
        return orgCode;
    }
    @JsonProperty("id")
    public String getId() {
        return id;
    }
    @JsonProperty("eventName")
    public String getEventName() {
        return eventName;
    }
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }
    @JsonProperty("date")
    public DateTime getDate() {
        return date;
    }
    @JsonProperty("eventType")
    public String getEventType() {
        return eventType;
    }
    public SystemLogEvents(Builder builder){
        this.orgCode = builder.orgCode;
        this.id = builder.id;
        this.eventType = builder.eventType;
        this.eventName = builder.eventName;
        this.message = builder.message;
        this.date = builder.date;
    }
    private SystemLogEvents(){}

    public static class Builder{

        String orgCode;
        String id;
        String eventName;
        String eventType;
        String message;
        DateTime date;

        @JsonProperty("orgCode")
        public Builder getOrgCode(String orgCode){
            this.orgCode = orgCode;
            return this;
        }
        @JsonProperty("id")
        public Builder getId(String id){
            this.id = id;
            return this;
        }
        @JsonProperty("eventName")
        public  Builder getEventName(String eventName){
            this.eventName = eventName;
            return this;
        }

        @JsonProperty("eventType")
        public Builder getEventType(String eventType){
            this.eventType = eventType;
            return this;
        }
        @JsonProperty("message")
        public Builder getMessage(String message){
            this.message = message;
            return this;
        }
        @JsonProperty("date")
        public Builder getDate(DateTime date){
            this.date = date;
            return this;
        }

        public Builder copy(SystemLogEvents systemLogEvents){
            this.orgCode = systemLogEvents.orgCode;
            this.id = systemLogEvents.id;
            this.eventType = systemLogEvents.eventType;
            this.eventName = systemLogEvents.eventName;
            this.message = systemLogEvents.message;
            this.date = systemLogEvents.date;
            return this;
        }

        public SystemLogEvents build(){return new SystemLogEvents(this);}

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemLogEvents that = (SystemLogEvents) o;
        return orgCode.equals(that.orgCode);
    }

    @Override
    public int hashCode() {
        return orgCode.hashCode();
    }
}
