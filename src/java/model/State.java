package model;
// Generated May 7, 2017 10:50:54 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * State generated by hbm2java
 */
public class State  implements java.io.Serializable {


     private Integer stateId;
     private String state;
     private Set cities = new HashSet(0);

    public State() {
    }

    public State(String state, Set cities) {
       this.state = state;
       this.cities = cities;
    }
   
    public Integer getStateId() {
        return this.stateId;
    }
    
    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public Set getCities() {
        return this.cities;
    }
    
    public void setCities(Set cities) {
        this.cities = cities;
    }




}


