package tp2project.commentsmobile.domain.sites;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Quest on 2016/11/06.
 */

public class AdminStatus implements Serializable {
    String adminStatusId;
    String name;

    @JsonProperty("adminStatusId")
    public String getAdminStatusId() {
        return adminStatusId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public AdminStatus(Builder builder){
        this.adminStatusId = builder.adminStatusId;
        this.name = builder.name;
    }
    private AdminStatus(){}

    public static class Builder{
        String adminStatusId;
        String name;

        @JsonProperty("adminStatusId")
        public Builder getAdminStatus(String id){
            this.adminStatusId = id;
            return this;
        }

        @JsonProperty("name")
        public Builder getName(String name){
            this.name = name;
            return  this;
        }

        public Builder copy(AdminStatus adminStatus){
            this.adminStatusId = adminStatus.adminStatusId;
            this.name = adminStatus.name;
            return this;
        }

        public AdminStatus build(){return new AdminStatus(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminStatus that = (AdminStatus) o;

        return adminStatusId.equals(that.adminStatusId);

    }

    @Override
    public int hashCode() {
        return adminStatusId.hashCode();
    }
}
