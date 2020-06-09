package a.springboot.pokemon.service.model;

public class AbilityDetail {

	public static class PokemonEffect {
		private String effect;
		private NameUrl language;
		private String short_effect;

		public String getEffect() {
			return effect;
		}

		public void setEffect(String effect) {
			this.effect = effect;
		}

		public NameUrl getLanguage() {
			return language;
		}

		public void setLanguage(NameUrl language) {
			this.language = language;
		}

		public String getShort_effect() {
			return short_effect;
		}

		public void setShort_effect(String short_effect) {
			this.short_effect = short_effect;
		}
	}

	public static class PokemonFlavorText {
		private String flavor_text;
		private NameUrl language;
		private NameUrl version_group;

		public String getFlavor_text() {
			return flavor_text;
		}

		public void setFlavor_text(String flavor_text) {
			this.flavor_text = flavor_text;
		}

		public NameUrl getLanguage() {
			return language;
		}

		public void setLanguage(NameUrl language) {
			this.language = language;
		}

		public NameUrl getVersion_group() {
			return version_group;
		}

		public void setVersion_group(NameUrl version_group) {
			this.version_group = version_group;
		}
	}

	public static class PokemonLanguage {
		private NameUrl language;
		private String name;

		public NameUrl getLanguage() {
			return language;
		}

		public void setLanguage(NameUrl language) {
			this.language = language;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static class PokemonAbilityPokemon {
		private Boolean is_hidden;
		private NameUrl pokemon;
		private Integer slot;

		public Boolean getIs_hidden() {
			return is_hidden;
		}

		public void setIs_hidden(Boolean is_hidden) {
			this.is_hidden = is_hidden;
		}

		public NameUrl getPokemon() {
			return pokemon;
		}

		public void setPokemon(NameUrl pokemon) {
			this.pokemon = pokemon;
		}

		public Integer getSlot() {
			return slot;
		}

		public void setSlot(Integer slot) {
			this.slot = slot;
		}
	}

	private Object[] effect_changes;
	private PokemonEffect[] effect_entries;
	private PokemonFlavorText[] flavor_text_entries;
	private NameUrl generation;
	private Integer id;
	private Boolean is_main_series;
	private String name;
	private PokemonLanguage[] names;
	private PokemonAbilityPokemon[] pokemon;

	public Object[] getEffect_changes() {
		return effect_changes;
	}

	public void setEffect_changes(Object[] effect_changes) {
		this.effect_changes = effect_changes;
	}

	public PokemonEffect[] getEffect_entries() {
		return effect_entries;
	}

	public void setEffect_entries(PokemonEffect[] effect_entries) {
		this.effect_entries = effect_entries;
	}

	public PokemonFlavorText[] getFlavor_text_entries() {
		return flavor_text_entries;
	}

	public void setFlavor_text_entries(PokemonFlavorText[] flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}

	public NameUrl getGeneration() {
		return generation;
	}

	public void setGeneration(NameUrl generation) {
		this.generation = generation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getIs_main_series() {
		return is_main_series;
	}

	public void setIs_main_series(Boolean is_main_series) {
		this.is_main_series = is_main_series;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PokemonLanguage[] getNames() {
		return names;
	}

	public void setNames(PokemonLanguage[] names) {
		this.names = names;
	}

	public PokemonAbilityPokemon[] getPokemon() {
		return pokemon;
	}

	public void setPokemon(PokemonAbilityPokemon[] pokemon) {
		this.pokemon = pokemon;
	}
}
