package ngdemo.service.impl;

import java.util.List;

import com.google.inject.Inject;
import com.sun.jersey.api.core.InjectParam;

import ngdemo.domain.User;
import ngdemo.repository.impl.DataManipulation;
import ngdemo.service.contract.UserService;

public class UserServiceImpl implements UserService {

   private DataManipulation repo;

   @Inject
   public UserServiceImpl(@InjectParam DataManipulation repo) {
      this.repo = repo;
   }

   public User getDefaultUser() {
      return repo.getDefaultUser();
   }

   public List<User> getAllUsers() {
      return repo.getAll();
   }

   public User getUserById(int id) {
      return repo.getById(id);
   }

   public void updateUserById(User user) {
      repo.updateUserById(user);
   }
   
   public void createNewUser(User user) {
      repo.createNewUser(user);
   }
   
   public void deleteUserById(int id) {
      repo.deleteUser(id);
   }
}
