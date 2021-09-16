package jakartaee9test01;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/post")
public class PostResource {

	@POST
	@Path("/0")
	//@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)
	public Response sendPost0() {
		return Response
			      .status(Response.Status.OK)
			      .entity(new Post())
			      .build();

	}
	
	@POST
	@Path("/1")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)
	public Response sendPost1() {
		return Response
			      .status(Response.Status.OK)
			      .entity(new Post())
			      .build();

	}
}
