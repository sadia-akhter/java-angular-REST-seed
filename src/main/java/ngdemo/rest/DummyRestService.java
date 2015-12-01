package ngdemo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ngdemo.domain.User;
import ngdemo.service.UserService;

@Path("/dummy")
public class DummyRestService {
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getDefaultDummyInJSON() {
        UserService userService = new UserService();
        return userService.getDefaultUser();
    }

}
