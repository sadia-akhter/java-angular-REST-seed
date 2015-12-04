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
		
		for(int i = 1; i <= numberOfUsers; i++) {
			User user = new User("Foo" + i, "Bar" + i);
			users.add(user);
		}
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getDefaultUser() {
		if (!users.isEmpty()){
			return users.get(0);
		}
		return null;		
	}

}
