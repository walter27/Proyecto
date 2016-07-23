package org.programacionv.aerolinea.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Entity
//@Table(name = "VUELO")
public class Vuelo {

	private int id;
	private String numeroVuelo;
	private Aerolinea aerolinea;
	private Avion avion;
	private List<Tarifa> listaTarifas;
	private List<Asiento> listaAsientos;
	private List<Dia> listaDias;
	private List<Reserva> listaReserva;
	private List<Aeropuerto> listaEscalas;
	private Aeropuerto vueloDestino;
	private Aeropuerto vueloOrigen;

	public Vuelo() {

	}

	//@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//@Column(name = "ID_VUELf_PK", columnDefinition = "NUMERIC (10,0)")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumeroVuelo() {
		return numeroVuelo;
	}

	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	//@ManyToOne
	//@JoinColumn(name = "AEROLINEA_FK")
	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public List<Tarifa> getListaTarifas() {
		return listaTarifas;
	}

	public void setListaTarifas(List<Tarifa> listaTarifas) {
		this.listaTarifas = listaTarifas;
	}

	public List<Asiento> getListaAsientos() {
		return listaAsientos;
	}

	public void setListaAsientos(List<Asiento> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}

	public List<Dia> getListaDias() {
		return listaDias;
	}

	public void setListaDias(List<Dia> listaDias) {
		this.listaDias = listaDias;
	}

	public List<Reserva> getListaReserva() {
		return listaReserva;
	}

	public void setListaReserva(List<Reserva> listaReserva) {
		this.listaReserva = listaReserva;
	}

	public List<Aeropuerto> getListaEscalas() {
		return listaEscalas;
	}

	public void setListaEscalas(List<Aeropuerto> listaEscalas) {
		this.listaEscalas = listaEscalas;
	}

	public Aeropuerto getVueloDestino() {
		return vueloDestino;
	}

	public void setVueloDestino(Aeropuerto vueloDestino) {
		this.vueloDestino = vueloDestino;
	}

	public Aeropuerto getVueloOrigen() {
		return vueloOrigen;
	}

	public void setVueloOrigen(Aeropuerto vueloOrigen) {
		this.vueloOrigen = vueloOrigen;
	}

}
