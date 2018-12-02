package snmaddula.components.msauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * OAuth2 Authorization Server Application.
 * 
 * @author snmaddula
 *
 */
@SpringBootApplication
@EnableAuthorizationServer
public class MsAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAuthServerApplication.class, args);
	}
}
