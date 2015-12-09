package ngdemo.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import ngdemo.domain.User;

public class Database {
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   static final String DB_URL = "jdbc:mysql://localhost/users";
   private static final String USER = "root";
   private static final String PASS = "system";

   public static Connection getConnection() throws Exception {
      Connection conn = null;
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      return conn;
  }

   public static List<User> selectAllFromUsers(Connection conn) throws Exception {
      List<User> users = new ArrayList<User>();
      
      String query = "SELECT * FROM users";
      PreparedStatement prepareStmt = conn.prepareStatement(query);
      ResultSet rs = prepareStmt.executeQuery();
      
      while(rs.next()) {
       int id = rs.getInt("user_id");
       String first = rs.getString("firstname");
       String last = rs.getString("lastname");
       
       User user = new User(id, first, last);
       users.add(user);
      } 
      
      return users;
   }
   
   public static User selectUserById(Connection conn, int id) throws Exception {
      User user = null;
      String query = "select * from users where user_id = ?";
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setInt(1, id);
      
      ResultSet rs = preparedStmt.executeQuery();
      if (rs.next()) {
         int userid = rs.getInt("user_id");
         String userFirstname = rs.getString("firstname");
         String userLastname = rs.getString("lastname");
         user = new User(userid, userFirstname, userLastname);
      }
      return user;     
   }
   
   public static void updateUserById(Connection conn, User user) throws Exception {
      String query = "update users set firstname = ?, lastname = ? where user_id = ?";
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString(1, user.getFirstName());
      preparedStmt.setString(2, user.getLastName());
      preparedStmt.setInt(3, user.getId());
      preparedStmt.executeUpdate();       
   }
   
   public static void insertNewUser(Connection conn, User user) throws Exception {
      String query = "insert into users (firstname, lastname) values (? , ?)";
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString(1, user.getFirstName());
      preparedStmt.setString(2, user.getLastName());
      preparedStmt.executeUpdate();
   }
   
   public static void deleteUser(Connection conn, int id) throws Exception {
      String query = "delete from users where user_id = ?";
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setInt(1, id);
      preparedStmt.executeUpdate();
   }

   
   public static void closeConnection(Connection conn) {
      try {
         conn.close();
      } catch (SQLException e) {

      }
   }
   
   
}
