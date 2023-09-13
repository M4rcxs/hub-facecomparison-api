package com.br.hub.facecomparison;

import jakarta.ws.rs.core.Application;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = FacecomparisonApplicationTests.class)
@ActiveProfiles(value = "test")
class FacecomparisonApplicationTests {

	@Test
	void contextLoads() {
	}

}
