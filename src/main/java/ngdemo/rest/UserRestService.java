package ngdemo.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.inject.Inject;
import com.sun.jersey.api.core.InjectParam;

import ngdemo.domain.User;
import ngdemo.service.impl.UserServiceImpl;

@Path("/users")
public class UserRestService {

	private final UserServiceImpl userService;
	
	@Inject
	public UserRestService(@InjectParam UserServiceImpl userService) {
		this.userService = userService;
	}
	
// to get a single user	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public User getDefaultUserInJSON() {
//		return userService.getDefaultUser();
//	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsersInJSON() {
		return userService.getAllUsers();
	}
	
}
