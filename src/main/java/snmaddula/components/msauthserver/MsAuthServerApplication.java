package snmaddula.components.msauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;

/**
 * OAuth2 Authorization Server Application.
 * 
 * @author snmaddula
 *
 */
@SpringBootApplication
@EnableGlobalAuthentication
public class MsAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAuthServerApplication.class, args);
	}
}
