package org.programacionv.aerolinea.modelo;

import java.util.List;

public class Vuelo {

	private int id;
	private String numeroVuelo;
	private Aerolinea aerolinea;
	private List<Avion> listaAviones;
	private Aeropuerto destino;
	private Aeropuerto origen;
	private List<Aeropuerto>listaAeropuertos;
	private List<Tarifa>listaTarifas;
	private List<Tarifa>listaOfertas;
	private List<Asiento>listaAsientos;
	private List<Dia>listaDiasLlegada;
	private List<Dia>listaDiasSalida;
	private List<Reserva>listaReserva;
	
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

	public List<Avion> getListaAviones() {
		return listaAviones;
	}

	public void setListaAviones(List<Avion> listaAviones) {
		this.listaAviones = listaAviones;
	}

	public Aeropuerto getDestino() {
		return destino;
	}

	public void setDestino(Aeropuerto destino) {
		this.destino = destino;
	}

	public Aeropuerto getOrigen() {
		return origen;
	}

	public void setOrigen(Aeropuerto origen) {
		this.origen = origen;
	}

	public List<Aeropuerto> getListaAeropuertos() {
		return listaAeropuertos;
	}

	public void setListaAeropuertos(List<Aeropuerto> listaAeropuertos) {
		this.listaAeropuertos = listaAeropuertos;
	}

	public List<Tarifa> getListaTarifas() {
		return listaTarifas;
	}

	public void setListaTarifas(List<Tarifa> listaTarifas) {
		this.listaTarifas = listaTarifas;
	}

	public List<Tarifa> getListaOfertas() {
		return listaOfertas;
	}

	public void setListaOfertas(List<Tarifa> listaOfertas) {
		this.listaOfertas = listaOfertas;
	}

	public List<Asiento> getListaAsientos() {
		return listaAsientos;
	}

	public void setListaAsientos(List<Asiento> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}

	public List<Dia> getListaDiasLlegada() {
		return listaDiasLlegada;
	}

	public void setListaDiasLlegada(List<Dia> listaDiasLlegada) {
		this.listaDiasLlegada = listaDiasLlegada;
	}

	public List<Dia> getListaDiasSalida() {
		return listaDiasSalida;
	}

	public void setListaDiasSalida(List<Dia> listaDiasSalida) {
		this.listaDiasSalida = listaDiasSalida;
	}

	public List<Reserva> getListaReserva() {
		return listaReserva;
	}

	public void setListaReserva(List<Reserva> listaReserva) {
		this.listaReserva = listaReserva;
	}
	
	
	

}
