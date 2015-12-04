package ngdemo.service.impl;

import java.util.List;

import com.google.inject.Inject;
import com.sun.jersey.api.core.InjectParam;

import ngdemo.domain.User;
import ngdemo.repository.impl.UserMockRepository;
import ngdemo.service.contract.UserService;

public class UserServiceImpl implements UserService {

   private UserMockRepository repo;

   @Inject
   public UserServiceImpl(@InjectParam UserMockRepository repo) {
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

}
