package com.sandytech.sql_query_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SqlQueryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlQueryServiceApplication.class, args);
	}

}
