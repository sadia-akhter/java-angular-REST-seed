package ngdemo.service.contract;

import java.util.List;
import ngdemo.domain.User;

public interface UserService {
   public User getDefaultUser();
   public List<User> getAllUsers();
   public User getUserById(int id);
}
