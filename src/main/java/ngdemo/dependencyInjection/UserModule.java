package ngdemo.dependencyInjection;

import com.google.inject.AbstractModule;
import ngdemo.repository.contract.DummyRepository;
import ngdemo.repository.impl.DummyMockRepository;
import ngdemo.service.contract.DummyService;
import ngdemo.service.impl.DummyServiceImpl;

public class UserModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DummyRepository.class).to(DummyMockRepository.class);
        bind(DummyService.class).to(DummyServiceImpl.class);

//        bind(UserRepository.class).to(UserMockRepositoryImpl.class);
//        bind(UserService.class).to(UserServiceImpl.class);
    }
}
