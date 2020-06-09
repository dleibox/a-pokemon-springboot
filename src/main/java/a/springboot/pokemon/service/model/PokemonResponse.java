package a.springboot.pokemon.service.model;

public class PokemonResponse {
	private Integer count;
	private String next;
	private String previous;
	private NameUrl[] results;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public NameUrl[] getResults() {
		return results;
	}

	public void setResults(NameUrl[] results) {
		this.results = results;
	}
}
