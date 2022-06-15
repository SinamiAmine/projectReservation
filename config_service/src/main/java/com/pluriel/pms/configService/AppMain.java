package com.pluriel.pms.configService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.pluriel.pms.configService.services.EstablishmentService;
import com.pluriel.pms.data.entities.Establishment;

@SpringBootApplication
@ComponentScan(basePackages = { "com.pluriel.*" })
@EntityScan(basePackages = { "com.pluriel.*" })
@EnableJpaRepositories(basePackages = { "com.pluriel.*" })
public class AppMain implements CommandLineRunner {

	@Autowired
	EstablishmentService establishmentService;

	public static void main(String[] args) {
		SpringApplication.run(AppMain.class);

	}

	@Override
	public void run(String... args) throws Exception {
		Establishment build = Establishment.builder().name("Sofitel Tanger").build();
		Establishment build2 = Establishment.builder().name("Sofitel Merrakech").build();
		establishmentService.purge();
		establishmentService.add(build);
		establishmentService.add(build2);

	}

}
