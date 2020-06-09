package a.springboot.pokemon.service.model;

public class PokemonDetail {

	public static class PokemonAbility {
		public NameUrl getAbility() {
			return ability;
		}

		public void setAbility(NameUrl ability) {
			this.ability = ability;
		}

		public Boolean getIs_hidden() {
			return is_hidden;
		}

		public void setIs_hidden(Boolean is_hidden) {
			this.is_hidden = is_hidden;
		}

		public Integer getSlot() {
			return slot;
		}

		public void setSlot(Integer slot) {
			this.slot = slot;
		}

		private NameUrl ability;
		private Boolean is_hidden;
		private Integer slot;
	}

	public static class PokemonGameIndex {
		public Integer getGame_index() {
			return game_index;
		}

		public void setGame_index(Integer game_index) {
			this.game_index = game_index;
		}

		public NameUrl getVersion() {
			return version;
		}

		public void setVersion(NameUrl version) {
			this.version = version;
		}

		private Integer game_index;
		private NameUrl version;
	}

	public static class PokemonStat {
		public Integer getBase_stat() {
			return base_stat;
		}

		public void setBase_stat(Integer base_stat) {
			this.base_stat = base_stat;
		}

		public Integer getEffort() {
			return effort;
		}

		public void setEffort(Integer effort) {
			this.effort = effort;
		}

		public NameUrl getStat() {
			return stat;
		}

		public void setStat(NameUrl stat) {
			this.stat = stat;
		}

		private Integer base_stat;
		private Integer effort;
		private NameUrl stat;
	}

	public static class PokemonType {
		public Integer getSlot() {
			return slot;
		}

		public void setSlot(Integer slot) {
			this.slot = slot;
		}

		public NameUrl getType() {
			return type;
		}

		public void setType(NameUrl type) {
			this.type = type;
		}

		private Integer slot;
		private NameUrl type;
	}

	public static class PokemonSprite {
		public String getBack_default() {
			return back_default;
		}

		public void setBack_default(String back_default) {
			this.back_default = back_default;
		}

		public String getBack_female() {
			return back_female;
		}

		public void setBack_female(String back_female) {
			this.back_female = back_female;
		}

		public String getBack_shiny() {
			return back_shiny;
		}

		public void setBack_shiny(String back_shiny) {
			this.back_shiny = back_shiny;
		}

		public String getBack_shiny_female() {
			return back_shiny_female;
		}

		public void setBack_shiny_female(String back_shiny_female) {
			this.back_shiny_female = back_shiny_female;
		}

		public String getFront_default() {
			return front_default;
		}

		public void setFront_default(String front_default) {
			this.front_default = front_default;
		}

		public String getFront_female() {
			return front_female;
		}

		public void setFront_female(String front_female) {
			this.front_female = front_female;
		}

		public String getFront_shiny() {
			return front_shiny;
		}

		public void setFront_shiny(String front_shiny) {
			this.front_shiny = front_shiny;
		}

		public String getFront_shiny_female() {
			return front_shiny_female;
		}

		public void setFront_shiny_female(String front_shiny_female) {
			this.front_shiny_female = front_shiny_female;
		}

		private String back_default;
		private String back_female;
		private String back_shiny;
		private String back_shiny_female;
		private String front_default;
		private String front_female;
		private String front_shiny;
		private String front_shiny_female;
	}

	private PokemonAbility[] abilities;
	private Integer base_experience;
	private NameUrl[] forms;
	private PokemonGameIndex[] game_indices;
	private Integer height;
	private Object[] held_items;
	private Integer id;
	private Boolean is_default;
	private String location_area_encounters;
	private Object[] moves;

	private String name;
	private Integer order;
	private NameUrl species;
	private PokemonSprite sprites;
	private PokemonStat[] stats;
	private PokemonType[] types;
	private Integer weight;

	public PokemonAbility[] getAbilities() {
		return abilities;
	}

	public void setAbilities(PokemonAbility[] abilities) {
		this.abilities = abilities;
	}

	public Integer getBase_experience() {
		return base_experience;
	}

	public void setBase_experience(Integer base_experience) {
		this.base_experience = base_experience;
	}

	public NameUrl[] getForms() {
		return forms;
	}

	public void setForms(NameUrl[] forms) {
		this.forms = forms;
	}

	public PokemonGameIndex[] getGame_indices() {
		return game_indices;
	}

	public void setGame_indices(PokemonGameIndex[] game_indices) {
		this.game_indices = game_indices;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Object[] getHeld_items() {
		return held_items;
	}

	public void setHeld_items(Object[] held_items) {
		this.held_items = held_items;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getIs_default() {
		return is_default;
	}

	public void setIs_default(Boolean is_default) {
		this.is_default = is_default;
	}

	public String getLocation_area_encounters() {
		return location_area_encounters;
	}

	public void setLocation_area_encounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
	}

	public Object[] getMoves() {
		return moves;
	}

	public void setMoves(Object[] moves) {
		this.moves = moves;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public NameUrl getSpecies() {
		return species;
	}

	public void setSpecies(NameUrl species) {
		this.species = species;
	}

	public PokemonSprite getSprites() {
		return sprites;
	}

	public void setSprites(PokemonSprite sprites) {
		this.sprites = sprites;
	}

	public PokemonStat[] getStats() {
		return stats;
	}

	public void setStats(PokemonStat[] stats) {
		this.stats = stats;
	}

	public PokemonType[] getTypes() {
		return types;
	}

	public void setTypes(PokemonType[] types) {
		this.types = types;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}
}
