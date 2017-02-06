package com.gost.configuration;

import com.gost.dao.HibernateSessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.naming.NamingException;

@Configuration
@ComponentScan("com.gost")
@EnableWebMvc
@EnableTransactionManagement
public class ApplicationConfiguration {
}
