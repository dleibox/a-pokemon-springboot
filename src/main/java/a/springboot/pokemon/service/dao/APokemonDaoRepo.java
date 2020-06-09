package a.springboot.pokemon.service.dao;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import a.springboot.pokemon.service.model.AbilityDetail;
import a.springboot.pokemon.service.model.PokemonDetail;
import a.springboot.pokemon.service.model.PokemonResponse;

@Repository("repo")
public class APokemonDaoRepo implements APokemonDao {

	private static final Logger log = LoggerFactory.getLogger(APokemonDaoRepo.class);

	@Autowired
	@Qualifier("source")
	private APokemonDao ds;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public PokemonResponse selectAllPokemons() {
		final String sql = "SELECT uuid,json FROM pokemon_response";
		PokemonResponse p = jdbcTemplate.query(sql, (resultSet, i) -> {
			try {
				return new ObjectMapper().readValue(resultSet.getString("json"), PokemonResponse.class);
			} catch (JsonMappingException e) {
//				e.printStackTrace();
				log.info("[ EX ] {}", e.toString());
			} catch (JsonProcessingException e) {
//				e.printStackTrace();
				log.info("[ EX ] {}", e.toString());
			}
			return null;
		}).stream().findFirst().orElse(null);

		log.info("[ Repo Response ] {}", p);

		if (p == null) {
			p = this.ds.selectAllPokemons();

			log.info("[ Source Response ] {}", p);
			try {
				String json = new ObjectMapper().writeValueAsString(p);
				log.info("[ Source Response ] {}", json.length());
				jdbcTemplate.update("INSERT INTO pokemon_response VALUES (?, ?)", UUID.randomUUID(), json);
			} catch (DataAccessException e) {
//				e.printStackTrace();
				log.info("[ EX ] {}", e.toString());
			} catch (JsonProcessingException e) {
//				e.printStackTrace();
				log.info("[ EX ] {}", e.toString());
			}
		}
		return p;
	}

	@Override
	public PokemonDetail selectPokemonById(String id) {
		final String sql = "SELECT uuid,id,name,json FROM pokemon WHERE id = ? OR name = ?";
		PokemonDetail o = null;
		try {
			int iid;
			try {
				iid = Integer.parseInt(id);
			} catch (NumberFormatException e) {
				log.info("[ EX ] {}", e.toString());
				iid = 0;
			}
			o = jdbcTemplate.queryForObject(sql, new Object[] { iid, id }, (resultSet, i) -> {
				try {
					return new ObjectMapper().readValue(resultSet.getString("json"), PokemonDetail.class);
				} catch (JsonMappingException e) {
//					e.printStackTrace();
					log.info("[ EX ] {}", e.toString());
				} catch (JsonProcessingException e) {
//					e.printStackTrace();
					log.info("[ EX ] {}", e.toString());
				}
				return null;
			});
		} catch (EmptyResultDataAccessException e) {
			log.info("[ EX ] {}", e.toString());
		} catch (DataIntegrityViolationException e) { // NumberFormatException
			log.info("[ EX ] {}", e.toString());
		}

		log.info("[ Repo Response ] {}", o);

		if (o == null) {
			o = this.ds.selectPokemonById(id);

			log.info("[ Source Response ] {}", o);
			try {
				String json = new ObjectMapper().writeValueAsString(o);
				log.info("[ Source Response ] {}", json.length());
				jdbcTemplate.update("INSERT INTO pokemon VALUES (?, ?, ?, ?)", UUID.randomUUID(), o.getId(),
						o.getName(), json);
			} catch (DataAccessException e) {
//				e.printStackTrace();
				log.info("[ EX ] {}", e.toString());
			} catch (JsonProcessingException e) {
//				e.printStackTrace();
				log.info("[ EX ] {}", e.toString());
			}
		}
		return o;
	}

	@Override
	public AbilityDetail selectAbilityById(String id) {
		final String sql = "SELECT uuid,id,name,json FROM ability WHERE id = ? OR name = ?";
		AbilityDetail o = null;
		try {
			int iid;
			try {
				iid = Integer.parseInt(id);
			} catch (NumberFormatException e) {
				log.info("[ EX ] {}", e.toString());
				iid = 0;
			}
			o = jdbcTemplate.queryForObject(sql, new Object[] { iid, id }, (resultSet, i) -> {
				try {
					return new ObjectMapper().readValue(resultSet.getString("json"), AbilityDetail.class);
				} catch (JsonMappingException e) {
//					e.printStackTrace();
					log.info("[ EX ] {}", e.toString());
				} catch (JsonProcessingException e) {
//					e.printStackTrace();
					log.info("[ EX ] {}", e.toString());
				}
				return null;
			});
		} catch (EmptyResultDataAccessException e) {
			log.info("[ EX ] {}", e.toString());
		} catch (DataIntegrityViolationException e) { // NumberFormatException
			log.info("[ EX ] {}", e.toString());
		}

		log.info("[ Repo Response ] {}", o);

		if (o == null) {
			o = this.ds.selectAbilityById(id);

			log.info("[ Source Response ] {}", o);
			try {
				String json = new ObjectMapper().writeValueAsString(o);
				log.info("[ Source Response ] {}", json.length());
				jdbcTemplate.update(
						"INSERT INTO ability VALUES (?, ?, ?, ?)", UUID.randomUUID(), o.getId(), o.getName(), json);
			} catch (DataAccessException e) {
//				e.printStackTrace();
				log.info("[ EX ] {}", e.toString());
			} catch (JsonProcessingException e) {
//				e.printStackTrace();
				log.info("[ EX ] {}", e.toString());
			}
		}
		return o;
	}

}
