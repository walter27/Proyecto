package org.programacionv.aerolinea.modelo;

public class Tarifa {

	private int id;
	private String clase;
	private Double impuesto;
	private Double precioTarifa;
	private Vuelo vuelo;
	private Vuelo vueloOferta;
	public Tarifa() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public Double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(Double impuesto) {
		this.impuesto = impuesto;
	}
	public Double getPrecioTarifa() {
		return precioTarifa;
	}
	public void setPrecioTarifa(Double precioTarifa) {
		this.precioTarifa = precioTarifa;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	public Vuelo getVueloOferta() {
		return vueloOferta;
	}
	public void setVueloOferta(Vuelo vueloOferta) {
		this.vueloOferta = vueloOferta;
	}

	
}
