package model;
// Generated May 7, 2017 10:50:54 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * OwnerStatus generated by hbm2java
 */
public class OwnerStatus  implements java.io.Serializable {


     private Integer ownerStatusId;
     private String ownerStatus;
     private Set owners = new HashSet(0);

    public OwnerStatus() {
    }

    public OwnerStatus(String ownerStatus, Set owners) {
       this.ownerStatus = ownerStatus;
       this.owners = owners;
    }
   
    public Integer getOwnerStatusId() {
        return this.ownerStatusId;
    }
    
    public void setOwnerStatusId(Integer ownerStatusId) {
        this.ownerStatusId = ownerStatusId;
    }
    public String getOwnerStatus() {
        return this.ownerStatus;
    }
    
    public void setOwnerStatus(String ownerStatus) {
        this.ownerStatus = ownerStatus;
    }
    public Set getOwners() {
        return this.owners;
    }
    
    public void setOwners(Set owners) {
        this.owners = owners;
    }




}

