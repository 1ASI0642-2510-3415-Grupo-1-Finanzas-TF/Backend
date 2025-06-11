package upc.edu.pe.bonoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BonoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BonoappApplication.class, args);
	}

}
