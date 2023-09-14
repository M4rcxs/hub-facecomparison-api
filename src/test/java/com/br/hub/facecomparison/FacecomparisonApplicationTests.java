package com.br.hub.facecomparison;

import com.br.hub.facecomparison.config.SpringApp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = SpringApp.class)
@ActiveProfiles(value = "test")
class SpringAppTest {

	@BeforeAll
	static void setupProperties() {
		System.setProperty("aws.region", "us-east-1");
		System.setProperty("aws.accessKeyId", "localstack");
		System.setProperty("aws.secretAccessKey", "localstack");
	}

	@Test
	void contextLoads() {
	}

}