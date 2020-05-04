package com.example.demo.modelo.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Producto {
	
	@Size(max = 12, min = 12)
	@NotEmpty
	String codigo;
	
	@Size(min=1 , max=100)
	String nombreProducto;
	
	@Size(min=1, max=100)
	String marca;
	
	@Size(min=1, max=500)
	String descripcion;
	
	@Digits(integer=10, fraction=0)
	int existencias;
	
	
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo =codigo;
	}
	
	
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto =nombreProducto;
	}
	
	
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca =marca;
	}
	
	
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion =descripcion;
	}
	

	public int getExistencias() {
		return existencias;
	}
	
	public void setExistencias(int existencias) {
		this.existencias =existencias;
	}
	
	
}