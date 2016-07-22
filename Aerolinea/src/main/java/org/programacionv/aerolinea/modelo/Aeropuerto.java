package org.programacionv.aerolinea.modelo;

import java.util.List;

public class Aeropuerto {

	private int id;
	private String nombre;
	private String ciudad;
	private String pais;
	
	public Aeropuerto() {
		
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
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Vuelo getVueloDestino() {
		return vueloDestino;
	}
	public void setVueloDestino(Vuelo vueloDestino) {
		this.vueloDestino = vueloDestino;
	}
	public Vuelo getVueloOrigen() {
		return vueloOrigen;
	}
	public void setVueloOrigen(Vuelo vueloOrigen) {
		this.vueloOrigen = vueloOrigen;
	}
	public List<Vuelo> getListaEscalas() {
		return listaEscalas;
	}
	public void setListaEscalas(List<Vuelo> listaEscalas) {
		this.listaEscalas = listaEscalas;
	}
	
	
}
