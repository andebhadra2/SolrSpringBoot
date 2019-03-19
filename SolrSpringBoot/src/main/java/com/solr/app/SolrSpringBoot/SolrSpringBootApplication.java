package com.solr.app.SolrSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {
		"com.solr.app.*"
		})
public class SolrSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolrSpringBootApplication.class, args);
	}

}
