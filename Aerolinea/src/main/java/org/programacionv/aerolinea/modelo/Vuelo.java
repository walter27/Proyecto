package org.programacionv.aerolinea.modelo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VUELO")
public class Vuelo {

	private int id;
	private String numeroVuelo;
	private Aerolinea aerolinea;
	private List<Tarifa> listaTarifasIda;
	private List<Tarifa> listaTarifasOfertas;
	private List<Asiento> listaAsientos;
	private List<Dia> listaDiasSalida;
	private List<Dia> listaDiasLlegada;
	private Set<Reserva> listaReservas = new HashSet<Reserva>();
	private Set<Avion> listaAviones = new HashSet<Avion>();
	private List<Aeropuerto> listaEscalas;
	private Aeropuerto vueloOrigen;

	public Vuelo() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_VUEL_PK", columnDefinition = "NUMERIC (10,0)")
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

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "RESERVA_VUELO", joinColumns = @JoinColumn(name = "ID_VUEL_PK"), inverseJoinColumns = @JoinColumn(name = "ID_RESV_PK"))
	public Set<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(Set<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}

	@OneToMany(mappedBy = "vuelo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Asiento> getListaAsientos() {
		return listaAsientos;
	}

	public void setListaAsientos(List<Asiento> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}

	@OneToMany(mappedBy = "vueloIda", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Tarifa> getListaTarifasIda() {
		return listaTarifasIda;
	}

	public void setListaTarifasIda(List<Tarifa> listaTarifasIda) {
		this.listaTarifasIda = listaTarifasIda;
	}

	@OneToMany(mappedBy = "vueloOfertas", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Tarifa> getListaTarifasOfertas() {
		return listaTarifasOfertas;
	}

	public void setListaTarifasOfertas(List<Tarifa> listaTarifasOfertas) {
		this.listaTarifasOfertas = listaTarifasOfertas;
	}

	@ManyToOne
	@JoinColumn(name = "AEROLINEA_FK")
	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "AVION_VUELO", joinColumns = @JoinColumn(name = "ID_VUEL_PK"), inverseJoinColumns = @JoinColumn(name = "ID_AVN_PK"))
	public Set<Avion> getListaAviones() {
		return listaAviones;
	}

	public void setListaAviones(Set<Avion> listaAviones) {
		this.listaAviones = listaAviones;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_AERP_PK")
	public Aeropuerto getVueloOrigen() {
		return vueloOrigen;
	}

	public void setVueloOrigen(Aeropuerto vueloOrigen) {
		this.vueloOrigen = vueloOrigen;
	}

	@OneToMany(mappedBy = "vueloEscalas", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Aeropuerto> getListaEscalas() {
		return listaEscalas;
	}

	public void setListaEscalas(List<Aeropuerto> listaEscalas) {
		this.listaEscalas = listaEscalas;
	}

	@OneToMany(mappedBy = "vueloLlegada", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Dia> getListaDiasSalida() {
		return listaDiasSalida;
	}

	public void setListaDiasSalida(List<Dia> listaDiasSalida) {
		this.listaDiasSalida = listaDiasSalida;
	}

	@OneToMany(mappedBy = "vueloSalida", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Dia> getListaDiasLlegada() {
		return listaDiasLlegada;
	}

	public void setListaDiasLlegada(List<Dia> listaDiasLlegada) {
		this.listaDiasLlegada = listaDiasLlegada;
	}

}
