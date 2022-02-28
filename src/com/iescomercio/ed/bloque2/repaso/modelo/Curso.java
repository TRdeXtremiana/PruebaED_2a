package com.iescomercio.ed.bloque2.repaso.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private List<Persona> listaAlumnos;

	/**
	 * Elimina un alumno de la lista listaAlumnos. Requiere el String dni del
	 * alumno. Contiene una excepcion que aparecera cuando el dni no tenga 9
	 * caracteres.
	 * 
	 * @param dni
	 * @throws Exception
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if (dni.length() == 9) {// comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); // solo hace falta el dni
		} else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}

	/**
	 * Aniade un alumno a la lista listaAlumnos. Recibe el parametro de la persona
	 * que se unira a la lista.
	 * 
	 * @param p
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}

	/**
	 * Comprueba si la lista listaAlumno contiene el dni de una persona que tiene
	 * ese dni. Este metodo devolvera verdadero en caso de contener el dni
	 * introducido, en caso contrario devolvera falso
	 * 
	 * @param dni
	 * @return
	 */
	public Boolean estaRegistrado(String dni) {
		int i = 0;
		Boolean encontrado = false;
		while (!encontrado && i < listaAlumnos.size()) {
			if (listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	/**
	 * Crea una nueva lista que representa un nuevo curso, este metodo no necesita
	 * ningun parametro de entrada
	 */
	public Curso() {
		listaAlumnos = new ArrayList<Persona>();
	}

	/*
	 * Documentar y crear test unitario
	 */
	public Integer numeroAlumnos() {
		return listaAlumnos.size();
	}

	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
