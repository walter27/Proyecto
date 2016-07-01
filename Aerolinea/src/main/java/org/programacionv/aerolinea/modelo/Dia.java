package org.programacionv.aerolinea.modelo;

public class Dia {

	private int id;
	private Vuelo vueloLlegada;
	private Vuelo vueloSalida;
	private Hora hora;
	public Dia() {
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Vuelo getVueloLlegada() {
		return vueloLlegada;
	}
	public void setVueloLlegada(Vuelo vueloLlegada) {
		this.vueloLlegada = vueloLlegada;
	}
	public Vuelo getVueloSalida() {
		return vueloSalida;
	}
	public void setVueloSalida(Vuelo vueloSalida) {
		this.vueloSalida = vueloSalida;
	}
	public Hora getHora() {
		return hora;
	}
	public void setHora(Hora hora) {
		this.hora = hora;
	}
	
	
}
