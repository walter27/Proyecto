package org.programacionv.aerolinea.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "TARIFA")
public class Tarifa {

	private int id;
	private String clase;
	private Double impuesto;
	private Double precioTarifa;

	public Tarifa() {

	}

	//@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//@Column(name = "ID_TARF_PK", columnDefinition = "NUMERIC (10,0)")
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

}
