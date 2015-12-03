package ngdemo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.inject.Inject;
import com.sun.jersey.api.core.InjectParam;

import ngdemo.domain.User;
import ngdemo.service.impl.DummyServiceImpl;

@Path("/dummy")
public class DummyRestService {
	
	private final DummyServiceImpl dummyService;
	
	@Inject
	public DummyRestService(@InjectParam DummyServiceImpl dummyService) {
		this.dummyService = dummyService;
	}
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getDefaultDummyInJSON() {
        return dummyService.getDefaultUser();
    }

//	  this method works without dependency injection. Trying to replace it with dependency injection	
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public User getDefaultDummyInJSON() {
//        UserService userService = new UserService();
//        return userService.getDefaultUser();
//    }
}
