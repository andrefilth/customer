package com.br.pan.client;

import static com.br.pan.client.constants.Constants.CONTEXT_PATH;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.reactive.server.WebTestClient;


@AutoConfigureWebTestClient(timeout = "36000")
@ActiveProfiles("test")
@TestPropertySource(properties = {"spring.main.allow-bean-definition-overriding=true"})
public class HealthEndpointTest {
	
	@Autowired
	private WebTestClient webClient;
	
	@Test
	void helthCheckTest() throws Exception {
		
		webClient.get()
			.uri(CONTEXT_PATH + "/health")
			.exchange()
			.expectStatus().isOk()
			.expectBody()
			.jsonPath("$.status").isEqualTo("OK");
	}
}
