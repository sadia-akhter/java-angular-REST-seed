package ngdemo.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

   private int id; // id = 0 represents invalid/default user
   private String firstName;
   private String lastName;

   public User(int id, String firstName, String lastName) {
      if (firstName == null || firstName == "") {
         this.firstName = "Not Specified";
      } else {
         this.firstName = firstName;
      }

      if (lastName == null || lastName == "") {
         this.lastName = "Not Specified";
      } else {
         this.lastName = lastName;
      }

      if (id < 0) {
         this.id = 0;
      } else {
         this.id = id;
      }
   }

   public User() {
      firstName = "Not Specified";
      lastName = "Not Specified";
      id = 0;
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

   public int getId() {
      return id;
   }
   
   @Override
   public String toString() {
      return "Name: " + firstName + " " + lastName + "\nID: " + id;
   }
}
