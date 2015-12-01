package ngdemo.service;

import ngdemo.domain.User;

public class UserService implements DummyService {

    public User getDefaultUser() {
        User user = new User();
        user.setFirstName("JonFromREST");
        user.setLastName("DoeFromREST");
        return user;
    }
}
