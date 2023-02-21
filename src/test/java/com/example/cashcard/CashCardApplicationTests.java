package com.example.cashcard;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
//class CashCardApplicationTests {
//
//	@Test
//	public void myFirstTest() {
//		assertThat(1).isEqualTo(1);
//	}
//
//}

// Annotation to start Spring Boot application and make it available for the test
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CashCardApplicationTests {
	// Injecting a test helper to create HTTP requests (for local)
	@Autowired
	TestRestTemplate restTemplate;


//	@Test
//	void shouldReturnCashCardWhenDataIsSaved() {
//		// Making a request GET and will return ResponseEntity
//		ResponseEntity<String> response = restTemplate.getForEntity("/cashcards/99", String.class);
//
//		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
//	}
	@Test
	void shouldReturnCashCardWhenDataIsSaved() {
		ResponseEntity<String> response = restTemplate.getForEntity("/cashcards/99", String.class);

		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

		DocumentContext documentContext = JsonPath.parse(response.getBody());
		Number id = documentContext.read("$.id");
		assertThat(id).isNotNull();

	}
}