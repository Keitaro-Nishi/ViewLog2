package viewlog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Controller
@SpringBootApplication
public class SecurityConfig {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SecurityConfig.class, args);
	}

	@RequestMapping({"/","/login"})
	String login() {
		return "login";
	}



	@EnableWebSecurity
	public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http
			.authorizeRequests()
			.antMatchers("/", "/login").permitAll()
			.antMatchers("/**").hasRole("USER")
			.antMatchers("/index/**").hasRole("ADMIN")
			.and()
			.formLogin()
			.loginPage("/login");
			http.formLogin()
			.defaultSuccessUrl("/Home", true)
			.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.logoutSuccessUrl("/")
			.deleteCookies("JSESSIONID")
			.invalidateHttpSession(true).permitAll();
		}

		@Autowired
		public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
			auth
			.inMemoryAuthentication()
			.withUser("user").password("pass").roles("USER");
		}

	}
}