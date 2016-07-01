package org.programacionv.aerolinea.modelo;

import java.util.List;

import org.hibernate.validator.constraints.Email;

public class Pasajero {
	
	private int id;
	private String nombre;
	private String direccion;
	private String ciudad;
	private String nacionalidad;
	private String codigoPostal;
	private String telefono;
	private String celular;
	private Email correo;
	private List<Tarjeta> listaTarjetas;
	private List<Tarjeta> listaReservas;
	public Pasajero() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Email getCorreo() {
		return correo;
	}
	public void setCorreo(Email correo) {
		this.correo = correo;
	}
	public List<Tarjeta> getListaTarjetas() {
		return listaTarjetas;
	}
	public void setListaTarjetas(List<Tarjeta> listaTarjetas) {
		this.listaTarjetas = listaTarjetas;
	}
	public List<Tarjeta> getListaReservas() {
		return listaReservas;
	}
	public void setListaReservas(List<Tarjeta> listaReservas) {
		this.listaReservas = listaReservas;
	}
	
	
	
	
}
