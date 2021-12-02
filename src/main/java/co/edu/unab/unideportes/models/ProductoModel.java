package co.edu.unab.unideportes.models;

import org.springframework.data.annotation.Id;


/*
 * 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;*/

/**
 * @author Vicente Albarracin
 *
 */
public class ProductoModel {

	@Id
	private String id;
	
	private String categoria;
	
	private String nombre;
	
	private String descripcion;
	
	private Double precio;
	
	private Boolean disponibilidad;
	
	private Integer cantidad;

	
	
	
	public ProductoModel(String id, String categoria, String nombre, String descripcion, Double precio,
			Boolean disponibilidad, Integer cantidad) {
		this.id = id;
		this.categoria = categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
		this.cantidad = cantidad;
	}

	public ProductoModel() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
}
