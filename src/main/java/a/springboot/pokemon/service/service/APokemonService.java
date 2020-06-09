package a.springboot.pokemon.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import a.springboot.pokemon.service.dao.APokemonDao;
import a.springboot.pokemon.service.model.AbilityDetail;
import a.springboot.pokemon.service.model.PokemonDetail;
import a.springboot.pokemon.service.model.PokemonResponse;

@Service
public class APokemonService {

	@Autowired
	@Qualifier("repo")
	private APokemonDao repository;

	public PokemonResponse getAllPokemons() {
		return this.repository.selectAllPokemons();
	}

	public PokemonDetail getPokemonById(String id) {
		return this.repository.selectPokemonById(id);
	}

	public AbilityDetail getAbilityById(String id) {
		return this.repository.selectAbilityById(id);
	}
}
