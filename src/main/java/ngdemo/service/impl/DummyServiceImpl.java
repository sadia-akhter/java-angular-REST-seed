package ngdemo.service.impl;

import com.google.inject.Inject;
import com.sun.jersey.api.core.InjectParam;

import ngdemo.domain.User;
import ngdemo.repository.impl.DummyMockRepository;
import ngdemo.service.contract.DummyService;

public class DummyServiceImpl implements DummyService {
	
	private final DummyMockRepository dummyRepository;

	@Inject
	public DummyServiceImpl(@InjectParam DummyMockRepository dummyRepository) {
		this.dummyRepository = dummyRepository;
	}
	
	public User getDefaultUser() {
		return this.dummyRepository.getDefaultUser();
	}

}
