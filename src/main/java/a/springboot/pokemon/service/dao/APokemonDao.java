package a.springboot.pokemon.service.dao;

import a.springboot.pokemon.service.model.AbilityDetail;
import a.springboot.pokemon.service.model.PokemonDetail;
import a.springboot.pokemon.service.model.PokemonResponse;

public interface APokemonDao {
	PokemonResponse selectAllPokemons();
	PokemonDetail selectPokemonById(String id);
	AbilityDetail selectAbilityById(String id);
}
