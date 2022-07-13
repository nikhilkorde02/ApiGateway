package com.springboot.apiGateway.ApiGateway;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApiGatewayApplicationTests {

//	private WebTestClient client;
//
//	@BeforeEach
//	public void setup(){
//		client = WebTestClient.bindToServer().baseUrl("http://localhost:" + 8304).build();
//	}
//
//	@Test
//	public void pathRouteDb(){
//		client.get().uri("/rest/db/Nikhil").exchange().expectStatus().isOk();
//	}
//
//	@Test
//	public void pathRouteStock(){
//		client.get().uri("/rest/stock/Nikhil").exchange().expectStatus().isOk();
//	}
//


}
