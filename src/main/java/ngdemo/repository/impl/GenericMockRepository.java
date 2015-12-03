package ngdemo.repository.impl;

import java.util.List;

import ngdemo.repository.contract.Repository;

public abstract class GenericMockRepository<T> implements Repository<T> {

	public List<T> getAll() {
		return null;
	}

	public T getById(int id) {
		return null;
	}

}
