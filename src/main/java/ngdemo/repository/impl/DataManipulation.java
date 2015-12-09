package ngdemo.repository.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import ngdemo.domain.User;
import ngdemo.repository.contract.UserRepository;

public class DataManipulation extends GenericMockRepository<User> implements UserRepository {

   public List<User> getAll() {
      List<User> users = new ArrayList<User>();
      
      try {
         Connection conn = Database.getConnection();
         users = Database.selectAllFromUsers(conn);
         Database.closeConnection(conn);
      } catch (Exception e) {
         e.printStackTrace();
      }

      return users;
   }

   public User getDefaultUser() {
      return new User(-1, "NotSpecified", "NotSpecified");
   }

   public User getById(int id) {
      User user = null;
      try {
         Connection conn = Database.getConnection();
         user = Database.selectUserById(conn, id);
         Database.closeConnection(conn);
      } catch (Exception e) {
         e.printStackTrace();
      }
      return user;
   }
   
   public void updateUserById(User user) {
      try {
         Connection conn = Database.getConnection();
         Database.updateUserById(conn, user);
         Database.closeConnection(conn);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   
   public void createNewUser(User user) {
      try {
         Connection conn = Database.getConnection();
         Database.insertNewUser(conn, user);
         Database.closeConnection(conn);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   
   public void deleteUser(int id) {
      try {
         Connection conn = Database.getConnection();
         Database.deleteUser(conn, id);
         Database.closeConnection(conn);
      } catch (Exception e) {
         e.printStackTrace();
      }
      
   }

}
