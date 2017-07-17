package model;
// Generated May 7, 2017 10:50:54 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ClaimStatus generated by hbm2java
 */
public class ClaimStatus  implements java.io.Serializable {


     private Integer claimStatusId;
     private String claimStatus;
     private Set claims = new HashSet(0);

    public ClaimStatus() {
    }

    public ClaimStatus(String claimStatus, Set claims) {
       this.claimStatus = claimStatus;
       this.claims = claims;
    }
   
    public Integer getClaimStatusId() {
        return this.claimStatusId;
    }
    
    public void setClaimStatusId(Integer claimStatusId) {
        this.claimStatusId = claimStatusId;
    }
    public String getClaimStatus() {
        return this.claimStatus;
    }
    
    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }
    public Set getClaims() {
        return this.claims;
    }
    
    public void setClaims(Set claims) {
        this.claims = claims;
    }




}

