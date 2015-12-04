package ngdemo.repository.contract;

import ngdemo.domain.User;

public interface UserRepository extends Repository<User> {
   User getDefaultUser();
}