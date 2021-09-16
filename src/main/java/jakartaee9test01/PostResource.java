package jakartaee9test01;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.CacheControl;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/post")
public class PostResource {

	@POST
	@Path("/0")
	// @Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_XML)
	public Response sendPost0() {
		return Response.status(Response.Status.OK).entity(new Post()).build();

	}

	@POST
	@Path("/1")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)
	public Response sendPost1() {
		return Response.status(Response.Status.OK).entity(new Post()).build();

	}

	@GET
	@Path("/2")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public Response sendPost2() {
		BufferedImage bufferedImage;
		bufferedImage = loadImage("dudu.png");
		return Response.status(Response.Status.OK).entity(toByteArray(bufferedImage, "png")).header("Content-type", "image/png").cacheControl(new CacheControl()).build();

	}

	public BufferedImage loadImage(String fileName) {
		BufferedImage buff = null;
		try {
			buff = ImageIO.read(new File("/tmp/dudu.png"));
			// buff = ImageIO.read(getClass().getResourceAsStream(fileName));
		} catch (IOException e) {
			System.err.println("########################################################");
			e.printStackTrace();
			return null;
		}
		return buff;
	}

	public static byte[] toByteArray(BufferedImage bi, String format) {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(bi, format, baos);
			byte[] bytes = baos.toByteArray();
			return bytes;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
