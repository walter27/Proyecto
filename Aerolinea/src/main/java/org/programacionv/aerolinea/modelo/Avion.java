package org.programacionv.aerolinea.modelo;

import java.util.List;

public class Avion {

	private int id;
	private String compañia;
	private String tipo;
	private int numPasajeros;
	private Aerolinea aerolinea;
	private List<Vuelo>listaVuelos;
	public Avion() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNumPasajeros() {
		return numPasajeros;
	}
	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	public Aerolinea getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	public List<Vuelo> getListaVuelos() {
		return listaVuelos;
	}
	public void setListaVuelos(List<Vuelo> listaVuelos) {
		this.listaVuelos = listaVuelos;
	}
	
	
	
	
}
