package ngdemo.repository.contract;

import ngdemo.domain.User;

public interface DummyRepository extends Repository<User> {
	User getDefaultUser();
}
