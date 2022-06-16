package com.pluriel.pms.data;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceSetup {
	@Bean
	public DataSource getDataSource ()
	{
	DataSourceBuilder dsBuilder = DataSourceBuilder.create ();
	dsBuilder.url ("jdbc:postgresql://localhost:5432/pms_dev?currentSchema=dev");
	dsBuilder.username ("postgres");
	dsBuilder.password ("123456789");
	return (DataSource) dsBuilder.build ();
	}
}
