package ngdemo.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

    private String firstName;
    private String lastName;

    
    public User() {
   	 firstName = "Not Specified";
   	 lastName = "Not Specified";
    }
    
    public User(String firstName, String lastName) {
   	 if(firstName == null || firstName == "") {
   		 this.firstName = "Not Specified";
   	 } else {
   		 this.firstName = firstName;
   	 }
   	 
   	 if(lastName == null || lastName == "") {
   		 this.lastName = "Not Specified";
   	 } else {
   		 this.lastName = lastName;
   	 }

    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
