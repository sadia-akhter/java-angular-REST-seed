package ngdemo.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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

   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public List<User> getAllUsersInJSON() { // http://localhost:8080/mavenWebApp/rest/users/
      return this.userService.getAllUsers();
   }

   @GET
   @Path("{id}")
   @Produces(MediaType.APPLICATION_JSON)
   public User getUserByIdInJSON(@PathParam("id") int id) { // http://localhost:8080/mavenWebApp/rest/users/1
      return this.userService.getUserById(id);
   }

   @POST
   @Consumes(MediaType.APPLICATION_JSON)
   public void createUser(User user) {
      this.userService.createNewUser(user);
   }
   
   @PUT
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public void update(User user) {
      this.userService.updateUserById(user);
   }
   
   @DELETE
   @Path("{id}")
   @Produces(MediaType.APPLICATION_JSON)
   public void remove(@PathParam("id") int id) {
      this.userService.deleteUserById(id);
   }
}
