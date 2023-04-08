package com.example.demo;

import com.example.demo.entity.Contrat;
import com.example.demo.service.IContratService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.stream.Stream;

@SpringBootApplication
@EnableMongoRepositories()
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	ApplicationRunner start (IContratService iContratService){
		return args -> {
			Stream.of(new Contrat(1,"Contrat luxemboug",48,120000,false,"France","Vermeg"),
					new Contrat(2,"Contrat new york",60,200000,true,"USA","UCCO")).forEach(
					contrat -> {
						iContratService.addContrat(contrat);
					}
			);
			iContratService.getAllContrat().forEach(System.out::println);
		};
	}

}
