package a.springboot.pokemon.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private APokemonService service;

	@GetMapping("/pokemon")
	public PokemonResponse getAllPokemons() {
		return this.service.getAllPokemons();
	}
	
	@GetMapping(path = "/pokemon/{id}")
	public PokemonDetail getPokemonById(@PathVariable("id") String id) {
		return this.service.getPokemonById(id);
	}

	@GetMapping(path = "/ability/{id}")
	public AbilityDetail getAbilityById(@PathVariable("id") String id) {
		return this.service.getAbilityById(id);
	}
}
