package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})
public class JdbcConfig {
	
	@Bean("ds")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds =new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("madara");
		return ds;
	}
	
	@Bean("jT")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(getDataSource());
		return jt;
	}
	
//	@Bean("sD")
//	public StudentDao getStudentDao()
//	{
//		StudentDaoImpl st = new StudentDaoImpl();
//		st.setJdbcTemplate(getTemplate());
//		return st;  
//	}
}
