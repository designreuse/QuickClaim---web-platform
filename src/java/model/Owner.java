package model;
// Generated May 7, 2017 10:50:54 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Owner generated by hbm2java
 */
public class Owner  implements java.io.Serializable {


     private String ownerId;
     private City city;
     private ImageUrl imageUrl;
     private OwnerStatus ownerStatus;
     private String firstName;
     private String lastName;
     private String mobile;
     private String password;
     private String address;
     private Set insuranceInfos = new HashSet(0);

    public Owner() {
    }

	
    public Owner(String ownerId, City city, ImageUrl imageUrl, OwnerStatus ownerStatus) {
        this.ownerId = ownerId;
        this.city = city;
        this.imageUrl = imageUrl;
        this.ownerStatus = ownerStatus;
    }
    public Owner(String ownerId, City city, ImageUrl imageUrl, OwnerStatus ownerStatus, String firstName, String lastName, String mobile, String password, String address, Set insuranceInfos) {
       this.ownerId = ownerId;
       this.city = city;
       this.imageUrl = imageUrl;
       this.ownerStatus = ownerStatus;
       this.firstName = firstName;
       this.lastName = lastName;
       this.mobile = mobile;
       this.password = password;
       this.address = address;
       this.insuranceInfos = insuranceInfos;
    }
   
    public String getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    public City getCity() {
        return this.city;
    }
    
    public void setCity(City city) {
        this.city = city;
    }
    public ImageUrl getImageUrl() {
        return this.imageUrl;
    }
    
    public void setImageUrl(ImageUrl imageUrl) {
        this.imageUrl = imageUrl;
    }
    public OwnerStatus getOwnerStatus() {
        return this.ownerStatus;
    }
    
    public void setOwnerStatus(OwnerStatus ownerStatus) {
        this.ownerStatus = ownerStatus;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public Set getInsuranceInfos() {
        return this.insuranceInfos;
    }
    
    public void setInsuranceInfos(Set insuranceInfos) {
        this.insuranceInfos = insuranceInfos;
    }




}


