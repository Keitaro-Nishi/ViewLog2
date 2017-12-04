package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.ui.Model;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

import com.example.demo.UserService;
/*
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
*/
@Controller
@SpringBootApplication
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
    @Autowired
    private UserService userService;
/*
	@Value("${spring.datasource.url}")
	private String dbUrl;
	@Autowired
	@Qualifier("dataSource")
	private DataSource dataSource;
	
	private static final String USER_QUERY = "SELECT userid, password, auth FROM userdata WHERE userid = ?";
	private static final String ROLE_QUERY = "SELECT userid, effect FROM userdata WHERE userid = ?";
	
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
		.antMatchers("/login").permitAll()
		.antMatchers("/").hasAnyAuthority("ADMIN","USER")
		.antMatchers("/Home").hasAnyAuthority("ADMIN","USER")
		.antMatchers("/signup").hasAnyAuthority("ADMIN","USER")
		.antMatchers("/Account").hasAuthority("ADMIN")
		.antMatchers("/logout").hasAnyAuthority("ADMIN","USER")
		//.antMatchers("/User/**").hasAuthority("ADMIN")
		.and()
		.formLogin()
		//.loginPage("/login")
		;
		http.formLogin()
		.defaultSuccessUrl("/signup", true)
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/")
		.deleteCookies("JSESSIONID")
		.invalidateHttpSession(true).permitAll()
		.and()
		.csrf()
		.disable();
	}
	
}
