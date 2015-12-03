package ngdemo.repository.contract;

import java.util.List;

public interface Repository<T> {
	List<T> getAll();
	T getById(int id);
}
