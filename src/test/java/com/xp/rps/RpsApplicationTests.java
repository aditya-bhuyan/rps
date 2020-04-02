package com.xp.rps;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RpsApplicationTests {


	@Autowired
	TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	void scissorsVsPaper() {
		ResponseEntity<String> response = restTemplate.postForEntity("/play",new PlayRequest("scissors","paper"),String.class);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Player 1 Wins",response.getBody());

	}
	@Test
	void paperVsScissors() {
		ResponseEntity<String> response = restTemplate.postForEntity("/play",new PlayRequest("paper","scissors"),String.class);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Player 2 Wins",response.getBody());

	}

	@Test
	void scissorsVsScissors() {
		ResponseEntity<String> response = restTemplate.postForEntity("/play",new PlayRequest("scissors","scissors"),String.class);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Game Drawn",response.getBody());

	}

	@Test
	void rockVsPaper() {
		ResponseEntity<String> response = restTemplate.postForEntity("/play",new PlayRequest("rock","paper"),String.class);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Player 1 Wins",response.getBody());

	}
	@Test
	void paperVsRock() {
		ResponseEntity<String> response = restTemplate.postForEntity("/play",new PlayRequest("paper","rock"),String.class);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Player 2 Wins",response.getBody());

	}

	@Test
	void paperVsPaper() {
		ResponseEntity<String> response = restTemplate.postForEntity("/play",new PlayRequest("paper","paper"),String.class);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Game Drawn",response.getBody());

	}


	@Test
	void rockVsScissors() {
		ResponseEntity<String> response = restTemplate.postForEntity("/play",new PlayRequest("rock","scissors"),String.class);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Player 1 Wins",response.getBody());

	}
	@Test
	void scissorsVsRock() {
		ResponseEntity<String> response = restTemplate.postForEntity("/play",new PlayRequest("scissors","rock"),String.class);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Player 2 Wins",response.getBody());

	}

	@Test
	void rockVsRock() {
		ResponseEntity<String> response = restTemplate.postForEntity("/play",new PlayRequest("rock","rock"),String.class);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Game Drawn",response.getBody());

	}


}
