package a.springboot.pokemon.service.exception;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	public static class ErrorDetails {
		private Date timestamp;
		private String message;
		private String details;

		public ErrorDetails(Date timestamp, String message, String details) {
			this.timestamp = timestamp;
			this.message = message;
			this.details = details;
		}

		public Date getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(Date timestamp) {
			this.timestamp = timestamp;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getDetails() {
			return details;
		}

		public void setDetails(String details) {
			this.details = details;
		}
	}

	@ExceptionHandler(WebClientResponseException.class)
	public ResponseEntity<?> globleWebClientExcpetionHandler(WebClientResponseException ex) {
		log.error("[ EX ] Error from WebClient - Status {}, Body {}", ex.getRawStatusCode(),
				ex.getResponseBodyAsString());
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), ex.getResponseBodyAsString());
		return ResponseEntity.status(ex.getRawStatusCode()).body(errorDetails);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> globleExcpetionHandler(Exception ex, WebRequest request) {
		log.error("[ EX ] Generic Error {}; {}", ex.getMessage(), request.getDescription(true));
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
