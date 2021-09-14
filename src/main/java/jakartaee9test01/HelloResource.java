package jakartaee9test01;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class HelloResource {

	@GET
	public String sayHello() {
		return "Hallo Welt!";
	}
}
