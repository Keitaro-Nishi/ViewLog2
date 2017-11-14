package com.example;

/*
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
*/

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


//@Controller
//@SpringBootApplication

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/*
	@Value("${spring.datasource.url}")
	private String dbUrl;

	@Autowired
	@Qualifier("dataSource")
	private DataSource dataSource;

	private static final String USER_QUERY = "SELECT custid, password,role FROM userdata WHERE custid = ?";
	private static final String ROLE_QUERY = "SELECT custid, reserve FROM userdata WHERE custid = ?";

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
		.dataSource(dataSource)
		.usersByUsernameQuery(USER_QUERY)
		.authoritiesByUsernameQuery(ROLE_QUERY);
	}
	 */

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/login").hasAnyAuthority("ADMIN","USER")
		.antMatchers("/Home").permitAll()
		.antMatchers("/Account").hasAuthority("ADMIN")
		.antMatchers("/logout").hasAnyAuthority("ADMIN","USER")
		//.antMatchers("/User/**").hasAuthority("ADMIN")
		.and()
		.formLogin()
		.loginPage("/");
		http.formLogin()
		.defaultSuccessUrl("/Home", true)
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/")
		.deleteCookies("JSESSIONID")
		.invalidateHttpSession(true).permitAll()
		.and()
		.csrf()
		.disable();
	}

	//@Autowired
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("hoge").password("HOGE").roles("ADMIN");
	}

	/*
	@Bean
	@ConfigurationProperties("spring.datasource")
	public DataSource dataSource() throws SQLException {
		if (dbUrl == null || dbUrl.isEmpty()) {
			return new HikariDataSource();
		} else {
			HikariConfig config = new HikariConfig();
			config.setJdbcUrl(dbUrl);
			return new HikariDataSource(config);
		}
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	 */

}

