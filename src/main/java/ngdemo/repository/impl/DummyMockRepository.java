package ngdemo.repository.impl;

import ngdemo.domain.User;
import ngdemo.repository.contract.DummyRepository;

public class DummyMockRepository extends GenericMockRepository<User> implements DummyRepository {

   public User getDefaultUser() {
      User user = new User();
      user.setFirstName("Sadia");
      user.setLastName("DummyMockRepository");
      return user;
   }

}
