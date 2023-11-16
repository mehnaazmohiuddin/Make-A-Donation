package com.mehnaaz.makeadonation;

import com.mehnaaz.makeadonation.configs.MakeADonationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(MakeADonationProperties.class)
@SpringBootApplication
public class MakeADonationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MakeADonationApplication.class, args);
	}

}
