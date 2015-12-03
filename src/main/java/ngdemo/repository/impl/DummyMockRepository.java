package ngdemo.repository.impl;

import ngdemo.domain.User;
import ngdemo.repository.contract.DummyRepository;

public class DummyMockRepository extends GenericMockRepository<User> implements DummyRepository {

/*
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
*/
	public User getDefaultUser() {
		User user = new User();
		user.setFirstName("Sadia");
		user.setLastName("DummyMockRepository");
		return user;
	}

}
