package com.solr.app.SolrSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {
		"com.doj.app.config","com.doj.app.controller","com.doj.app.pojo","com.doj.app","com.doj.app.repository"
		})
public class SolrSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolrSpringBootApplication.class, args);
	}

}
