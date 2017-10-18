package com.example;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;


public class MyUserDetailsService implements UserDetailsService {
    private final Map<String, UserDetails> usersList;

    public MyUserDetailsService() {
        Collection<GrantedAuthority> authorityList;
        final SimpleGrantedAuthority supervisorAuthority = new SimpleGrantedAuthority("supervisor");
        final SimpleGrantedAuthority userAuthority = new SimpleGrantedAuthority("user");
        usersList = new TreeMap<String, UserDetails>();

        authorityList = new ArrayList<GrantedAuthority>();
        authorityList.add(supervisorAuthority);
        authorityList.add(userAuthority);
        usersList.put("admin", new User("admin", "admin", authorityList));

        authorityList = new ArrayList<GrantedAuthority>();
        authorityList.add(userAuthority);
        usersList.put("peter", new User("peter", "password123", authorityList));

        //probably don't use this in production
        for(Map.Entry<String, UserDetails> user : usersList.entrySet()){
            logger.info(user.getValue().toString());
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username)throws UsernameNotFoundException {
        UserDetails ud = usersList.get(username);
        if (ud != null) {
            logger.info("loadUserByUsername: found match, returning "
                    + ud.getUsername() + ":" + ud.getPassword() + ":"
                    + ud.getAuthorities().toString());
            return new User(ud.getUsername(), ud.getPassword(),
                    ud.getAuthorities());
        }

        logger.info("loadUserByUsername: did not find match, throwing UsernameNotFoundException");
        throw new UsernameNotFoundException(username);
    }
}