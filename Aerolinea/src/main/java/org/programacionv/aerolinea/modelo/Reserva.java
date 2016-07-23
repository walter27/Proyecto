package org.programacionv.aerolinea.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "RESERVA")
public class Reserva {

	private int id;
	private String clave;
	private String costoFinal;
	private Pago pago;
	private Pasajero pasajero;

	public Reserva() {

	}

	//@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//@Column(name = "ID_RESV_PK", columnDefinition = "NUMERIC (10,0)")
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

}
