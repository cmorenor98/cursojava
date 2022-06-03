package org.indra.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JavaTimeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testLocalDate() {
		LocalTime fechaArg = LocalTime.now(ZoneId.of("America/Argentina/Salta")).truncatedTo(ChronoUnit.SECONDS);
		LocalTime fechaEsp = LocalTime.now(ZoneId.of("Europe/Madrid")).truncatedTo(ChronoUnit.SECONDS);
		// Faltan cosas
	}

}
