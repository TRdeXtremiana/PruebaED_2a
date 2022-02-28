package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testPersona() {
		Persona p = new Persona("12345678A", "Juan", "Serrano");
		assertEquals("12345678A", p.getDni());
		assertEquals("Juan", p.getNombre());
		assertEquals("Serrano", p.getApellido1());
	}

	@Test
	void testGetDni() {
		Persona p = new Persona("12345678A", "Juan", "Serrano");
		assertEquals("12345678A", p.getDni());
	}

	@Test
	void testSetDni() throws Exception {
		Persona p = new Persona("12345678B", "Juan", "Serrano");
		p.setDni("12345678A");
		assertEquals("12345678A", p.getDni());
	}

	@Test
	void testGetNombre() {
		Persona p = new Persona("12345678A", "Juan", "Serrano");
		assertEquals("Juan", p.getNombre());
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

}
