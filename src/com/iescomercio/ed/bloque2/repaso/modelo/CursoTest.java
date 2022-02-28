package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CursoTest {
	public Curso c;

	@BeforeEach
	void beforeEach() {
		c = new Curso();
		c.aniadirAlumno(new Persona("23456789A", "J", "S"));
		c.aniadirAlumno(new Persona("25", "D", "E"));
		c.aniadirAlumno(new Persona("9876543211", "P", "G"));
	}

	@Test
	void testEliminarAlumno() {
		c = new Curso();
		c.aniadirAlumno(new Persona("23456789A", "", ""));
		c.aniadirAlumno(new Persona("25", "", ""));
		c.aniadirAlumno(new Persona("9876543211", "", ""));

		try {
			int numBefore = c.numeroAlumnos();
			c.eliminarAlumno("23456789A");
			int numAfter = c.numeroAlumnos();
			assertEquals(numBefore - 1, numAfter);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

	@Test
	void testEliminarAlumnoError() {
		assertThrows(Exception.class, () -> c.eliminarAlumno("1"));

	}

	@Test
	void testAniadirAlumno() {
		fail("Not yet implemented");
	}

	@Test
	void testEstaRegistrado() {
		fail("Not yet implemented");
	}

	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

}
