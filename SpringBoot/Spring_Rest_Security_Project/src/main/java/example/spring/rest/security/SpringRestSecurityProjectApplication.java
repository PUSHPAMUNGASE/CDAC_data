package example.spring.rest.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
@EnableWebSecurity //Enabling the security Customization defined by SecurityFilterChain

public class SpringRestSecurityProjectApplication {
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
@Bean
public SecurityFilterChain getSecurityFilterChain(HttpSecurity http)throws Exception{
	http.authorizeHttpRequests(
			auth->{
				auth.requestMatchers("/doGreet").permitAll();
				auth.requestMatchers("/doAdminWork").
				hasAnyRole("ADMIN").
			requestMatchers("/doRegularWork").hasAnyRole("ADMIN","REGULAR").anyRequest().authenticated();
				
			});
			http.csrf(csrf->csrf.disable());
			http.formLogin(Customizer.withDefaults());
			http.httpBasic(Customizer.withDefaults());
			
	
	return http.build();
}

@Bean
public UserDetailsService getUserDetailsService() {
	UserDetails adminUser=User.withUsername("pushpa").password(encoder().encode("reset123")).roles("ADMIN").build();
	UserDetails regularUser=User.withUsername("tim").password(encoder().encode("reset1234")).roles("REGULAR").build();
	UserDetailsService userDetailsServiceRef= new InMemoryUserDetailsManager(adminUser,regularUser);
	return userDetailsServiceRef;
}




	public static void main(String[] args) {
		SpringApplication.run(SpringRestSecurityProjectApplication.class, args);
		System.out.println("Server is running on PORT 7575");
	}

}
