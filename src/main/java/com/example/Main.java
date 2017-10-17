package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.authentication.encoding.BasePasswordEncoder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

@Controller
@SpringBootApplication
public class Main {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Main.class, args);
	}

	@RequestMapping({"/","/login"})
	String login() {
		return "login";
	}

	@RequestMapping("/Home")
	String Home() {
		return "Home";
	}

	@RequestMapping("/signup")
	String signup() {
		return "signup";
	}

	@RequestMapping("/Account")
	String Account() {
		return "Account";
	}

	@RequestMapping("/Account/index")
	String index() {
		return "index";
	}

	@RequestMapping("/logview")
	String logview() {
		return "logview";
	}

	@RequestMapping("/home.jsp")
	String home() {
		return "home";
	}
	/*
	 * ログインユーザ　取得したいYO
	 *
	@RequestMapping("index")
	public static String getUsername() {
		Authentication authentication = SecurityContextHolder.getContext()
				.getAuthentication(); // (1)
		if (authentication != null) {
			Object principal = authentication.getPrincipal(); // (2)
			if (principal instanceof UserDetails) {
				return ((UserDetails) principal).getReserve(); // (3)
			}
			return (String) principal.toString();
		}
		return null;
	}
	*/
}

