package fab.shop.api.core.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserService {
	
	  @GetMapping(
			    value = "/product/{userId}",
			    produces = "application/json")
			  User getUser(@PathVariable int userId);

}
