package org.project.Strive;

import org.project.Strive.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class StriveApplication {

	public static void main(String[] args) {
		SpringApplication.run(StriveApplication.class, args);
	}

}
