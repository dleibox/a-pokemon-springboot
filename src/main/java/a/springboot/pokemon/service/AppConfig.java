package a.springboot.pokemon.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	public class Info {
		private String title;
		private String description;
		private String version;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		@Override
		public String toString() {
			return title + " | " + version + " | " + description;
		}
	}

	@Bean
	@ConfigurationProperties(prefix = "app")
	public Info info() {
		return new Info();
	}
}
