package ngdemo.dependencyInjection;

import com.google.inject.AbstractModule;
import ngdemo.repository.contract.DummyRepository;
import ngdemo.repository.contract.UserRepository;
import ngdemo.repository.impl.DummyMockRepository;
import ngdemo.repository.impl.UserMockRepository;
import ngdemo.service.contract.DummyService;
import ngdemo.service.contract.UserService;
import ngdemo.service.impl.DummyServiceImpl;
import ngdemo.service.impl.UserServiceImpl;

public class UserModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DummyRepository.class).to(DummyMockRepository.class);
        bind(DummyService.class).to(DummyServiceImpl.class);

        bind(UserRepository.class).to(UserMockRepository.class);
        bind(UserService.class).to(UserServiceImpl.class);
    }
}
