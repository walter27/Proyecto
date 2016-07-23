package org.programacionv.aerolinea.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "DIA")
public class Dia {

	private int id;
	private Vuelo vueloLlegada;
	private Vuelo vueloSalida;
	private Hora hora;

	public Dia() {

	}

	//@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//@Column(name = "ID_DIA_PK", columnDefinition = "NUMERIC (10,0)")
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
