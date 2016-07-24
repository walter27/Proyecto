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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "RESERVA")
public class Reserva {

	private int id;
	private String clave;
	private String costoFinal;
	private List<Pago> listaPagos;
	private Pasajero pasajero;
	private Set<Vuelo> listaVuelos = new HashSet<Vuelo>();

	public Reserva() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_RESV_PK", columnDefinition = "NUMERIC (10,0)")
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

	@OneToMany(mappedBy = "reserva", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Pago> getListaPagos() {
		return listaPagos;
	}

	public void setListaPagos(List<Pago> listaPagos) {
		this.listaPagos = listaPagos;
	}

	@ManyToOne
	@JoinColumn(name = "PASAJERO_FK", referencedColumnName = "ID_PSJ_PK")
	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	@ManyToMany(mappedBy = "listaReservas")
	public Set<Vuelo> getListaVuelos() {
		return listaVuelos;
	}

	public void setListaVuelos(Set<Vuelo> listaVuelos) {
		this.listaVuelos = listaVuelos;
	}

}
