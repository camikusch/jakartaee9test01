package de.cam.test.jakartaee9test01;

//import io.swagger.v3.oas.annotations.OpenAPIDefinition;
//import io.swagger.v3.oas.annotations.info.Contact;
//import io.swagger.v3.oas.annotations.info.Info;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;


//@OpenAPIDefinition (info =
//@Info(
//          title = "the title",
//          version = "0.0",
//          description = "My API",
//          contact = @Contact(url = "http://gigantic-server.com", name = "Fred", email = "Fred@gigagantic-server.com")          
//  )
//)
@ApplicationPath("/api")
public class DemoApplication extends Application {

}
