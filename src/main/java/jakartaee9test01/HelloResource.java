package jakartaee9test01;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

	private int counter = 0;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	 @Operation(description = "XAXAXAXA")
		public String sayHello() {
		return "Hallo Welt!";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{name}")
	public String doGreeting(@PathParam("name") String name, @QueryParam("language") String language) {
		return "Hallo, " + name + (language == null ? "with no language specified" : "with language: " + language);
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/count")
	public String countUp() {
		counter=counter+1;
		return "Counter: "+counter;
	}
	
	
}
