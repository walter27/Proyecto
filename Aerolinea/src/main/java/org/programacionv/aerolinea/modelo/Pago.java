package org.programacionv.aerolinea.modelo;

import java.sql.Date;
import java.util.List;

public class Pago {
	
	private int id;
	private String tipo;
	private Date fechaPago;
	private double precioPago;
	private Reserva reserva;
	private List<Tarjeta> listaTarjetas;
	public Pago() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}
	public double getPrecioPago() {
		return precioPago;
	}
	public void setPrecioPago(double precioPago) {
		this.precioPago = precioPago;
	}
	public Reserva getReserva() {
		return reserva;
	}
	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	public List<Tarjeta> getListaTarjetas() {
		return listaTarjetas;
	}
	public void setListaTarjetas(List<Tarjeta> listaTarjetas) {
		this.listaTarjetas = listaTarjetas;
	}
	
	
	
}
