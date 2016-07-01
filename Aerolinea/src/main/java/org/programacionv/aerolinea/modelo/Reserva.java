package org.programacionv.aerolinea.modelo;

import java.util.List;

public class Reserva {

	private int id;
	private String clave;
	private String costoFinal;
	private List<Pago> listaPagos;
	private List<Pasajero> listaPasajeros;
	public Reserva() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getCostoFinal() {
		return costoFinal;
	}
	public void setCostoFinal(String costoFinal) {
		this.costoFinal = costoFinal;
	}
	public List<Pago> getListaPagos() {
		return listaPagos;
	}
	public void setListaPagos(List<Pago> listaPagos) {
		this.listaPagos = listaPagos;
	}
	public List<Pasajero> getListaPasajeros() {
		return listaPasajeros;
	}
	public void setListaPasajeros(List<Pasajero> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}
	
	
	
	
}
