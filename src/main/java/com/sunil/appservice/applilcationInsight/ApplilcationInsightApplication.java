package com.sunil.appservice.applilcationInsight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan(basePackages = "com.sunil.appservice.applilcationInsight")
public class ApplilcationInsightApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApplilcationInsightApplication.class, args);
	}
}
