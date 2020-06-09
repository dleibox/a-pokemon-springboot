package a.springboot.pokemon.service;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class APokemonServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(APokemonServiceApplication.class);

	public static void main(String[] args) {
		log.info("-----------------------------------------");
		log.info("[ App ] main() starting !", Arrays.toString(args));
		log.info("-----------------------------------------");

		SpringApplication.run(APokemonServiceApplication.class, args);

		log.info("-----------------------------------------");
		log.info("[ App ] main() end !", Arrays.toString(args));
		log.info("-----------------------------------------");
	}

	public APokemonServiceApplication(AppContact contact) {
		log.info("[ App ] [ APokemonServiceApplication ] constructor");
		log.info("[ Contact ] {}", contact.getName());
		log.info("[ Contact ] {}", contact.getEmail());
		log.info("[ Contact ] {}", contact.getUrl());
	}

	@Bean
	public CommandLineRunner initApp(AppConfig config) {
		return (args) -> {
			log.info("[ AppConfig ] {}", config.info().getTitle());
			log.info("[ AppConfig ] {}", config.info().getVersion());
			log.info("[ AppConfig ] {}", config.info().getDescription());
		};
	}
}
