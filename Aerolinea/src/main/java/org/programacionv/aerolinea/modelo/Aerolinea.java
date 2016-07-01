package org.programacionv.aerolinea.modelo;

import java.util.List;

public class Aerolinea {

	private int id;
	private String nombre;
	private Vuelo vuelo;
	private List<Avion>listaAviones;
	public Aerolinea() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	public List<Avion> getListaAviones() {
		return listaAviones;
	}
	public void setListaAviones(List<Avion> listaAviones) {
		this.listaAviones = listaAviones;
	}
	
	//Clases nuevas
}
