package a.springboot.pokemon.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import a.springboot.pokemon.service.model.AbilityDetail;
import a.springboot.pokemon.service.model.PokemonDetail;
import a.springboot.pokemon.service.model.PokemonResponse;
import a.springboot.pokemon.service.service.APokemonService;

@CrossOrigin
@RequestMapping("api/v1")
@RestController
public class APokemonController {

	private static final Logger log = LoggerFactory.getLogger(APokemonController.class);

	@Autowired
	private APokemonService service;

	@GetMapping("/pokemon")
	public ResponseEntity<PokemonResponse> getAllPokemons() {
		log.info("[ getAllPokemons ]");
		return new ResponseEntity<>(this.service.getAllPokemons(), HttpStatus.OK);
	}

	@GetMapping(path = "/pokemon/{id}")
	public ResponseEntity<PokemonDetail> getPokemonById(@PathVariable("id") String id) {
		log.info("[ getPokemonById ] {}", id);
		return new ResponseEntity<>(this.service.getPokemonById(id), HttpStatus.OK);
	}

	@GetMapping(path = "/ability/{id}")
	public ResponseEntity<AbilityDetail> getAbilityById(@PathVariable("id") String id) {
		log.info("[ getAbilityById ] {}", id);
		return new ResponseEntity<>(this.service.getAbilityById(id), HttpStatus.OK);
	}

}
