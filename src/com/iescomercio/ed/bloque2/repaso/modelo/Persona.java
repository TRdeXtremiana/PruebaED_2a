package com.iescomercio.ed.bloque2.repaso.modelo;

public class Persona {

	private String dni;
	private String nombre;
	private String apellido1;

	public Persona() {
	}

	/**
	 * Crea una nueva persona a partir de los parametros dni, nombre y apellido, los
	 * 3 son Strings
	 * 
	 * @param dni
	 * @param nombre
	 * @param apellido1
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}

	/**
	 * Devuelve el DNI de la persona que introduzcamos
	 * 
	 * @return
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Nos permite sobreescribir el DNI de una persona, el ultimo caracter de la
	 * identificacion debe ser una letra
	 * 
	 * @param dni
	 * @throws Exception
	 */
	public void setDni(String dni) throws Exception {
		// comprobacion de si el ultimo caracter es una letra
		if (Character.isLetter(dni.charAt(dni.length()))) {
			this.dni = dni;
		} else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}

	/**
	 * Devuelve el nombre de la persona buscada
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Permite modificar el nombre de una persona introduciendo por parametro el
	 * nombre que queremos cambiar
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el apellido de una persona. No es necesario ningun parametro de
	 * entrada
	 * 
	 * @return
	 */
	public String getApellido1() {
		return apellido1;
	}

	/*
	 * Documentar y crear test unitario
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
