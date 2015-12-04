package ngdemo.repository.impl;

import java.util.ArrayList;
import java.util.List;

import ngdemo.domain.User;
import ngdemo.repository.contract.UserRepository;

public class UserMockRepository extends GenericMockRepository<User> implements UserRepository {

   private List<User> users;
   private int numberOfUsers;

   public UserMockRepository() {
      users = new ArrayList<User>();
      numberOfUsers = 10;

      for (int i = 1; i <= numberOfUsers; i++) {
         User user = new User(i, "Foo" + i, "Bar" + i);
         users.add(user);
      }
   }

   @Override
   public List<User> getAll() {
      return users;
   }

   @Override
   public User getById(int id) {
      int len = users.size();
      int index = -1;

      for (int i = 0; i < len; i++) {
         if (users.get(i).getId() == id) {
            index = i;
            break;
         }
      }

      if (index == -1) {
         return null;
      }
      return users.get(index);
   }

   public User getDefaultUser() {
      if (!users.isEmpty()) {
         return users.get(0);
      }
      return null;
   }

}
