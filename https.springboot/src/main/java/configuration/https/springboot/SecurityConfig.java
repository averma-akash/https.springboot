package configuration.https.springboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	SecurityFilterChain filterChain(HttpSecurity security) throws Exception {
		return security.requiresChannel(chanel -> chanel.anyRequest().requiresSecure())
				.authorizeRequests(authorize -> authorize.anyRequest().permitAll()).build();

	}

}
