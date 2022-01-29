package com.Configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories
@ComponentScan({"com"})
@PropertySource(value = {"classpath:application.properties"})
public class HibernateConfiguration {
	
	@Autowired
	private Environment env;
	
	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	@Bean(name="entityManagerFactory")
	public LocalSessionFactoryBean seesionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setHibernateProperties(HibernateProperties());
		sessionFactory.setPackagesToScan(new String[] {"com.model"});
		System.out.println("DB Connected");
		return sessionFactory;
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dm = new DriverManagerDataSource();
		
		dm.setDriverClassName(env.getRequiredProperty("spring.datasource.driver-class-name"));
		dm.setUrl(env.getRequiredProperty("spring.datasource.url"));
		return dm;
	}
	
	public Properties HibernateProperties() {
		Properties p = new Properties();
		
		p.put("hibernate.dialect", env.getRequiredProperty("spring.jpa.properties.hibernate.dialect"));
		p.put("hibernate.show_sql", env.getRequiredProperty("spring.jpa.show-sql"));
		p.put("hibernate.format.sql", true);
		p.put("hibernate.hbm22l.auto", env.getRequiredProperty("spring.jpa.hibernate.ddl-auto"));
		p.put("hibernate.connection.username", env.getRequiredProperty("spring.datasource.username"));
		p.put("hibernate.connection.password", env.getRequiredProperty("spring.datasource.password"));
		return p;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sf) {
		HibernateTransactionManager tr = new HibernateTransactionManager();
		tr.setSessionFactory(sf);
		return tr;
	}
}
