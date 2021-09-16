package jakartaee9test01;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/person")
public class PersonResource {

	@GET
	@Path("/0")
	@Produces(MediaType.APPLICATION_XML)
	public Response getPerson0() {
		return Response
			      .status(Response.Status.OK)
			      .entity(new Person("person0", 49))
			      .build();
	}

	@GET
	@Path("/1")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPerson1() {
		return Response
			      .status(Response.Status.OK)
			      .entity(new Person("person1", 49))
			      .build();
	}
	
	@GET
	@Path("/2")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getPerson2() {
		return Response
			      .status(Response.Status.OK)
			      .entity(new Person("person2", 49))
			      .build();
	}
	
	@GET
	@Path("/3")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPerson3() {
		Person p = new Person("person3", 49);
		return p.toString();
	}
}
