package org.programacionv.aerolinea.modelo;

import java.util.List;

public class Vuelo {

	private int id;
	private String numeroVuelo;
	private Aerolinea aerolinea;
	private Avion avion;
	private List<Tarifa>listaTarifas;
	private List<Asiento>listaAsientos;
	private List<Dia>listaDias;
	private List<Reserva>listaReserva;
	private List<Vuelo>listaEscalas;
	private Vuelo vueloDestino;
	private Vuelo vueloOrigen;
	
	public Vuelo() {
		
	}

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

	public List<Vuelo> getListaEscalas() {
		return listaEscalas;
	}

	public void setListaEscalas(List<Vuelo> listaEscalas) {
		this.listaEscalas = listaEscalas;
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

		

}
