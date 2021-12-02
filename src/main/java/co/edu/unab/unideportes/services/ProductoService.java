package co.edu.unab.unideportes.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unab.unideportes.models.ProductoModel;
import co.edu.unab.unideportes.repositories.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	ProductoRepository productoRepository;
	
	public ArrayList<ProductoModel> obtenerPoductos(){
		return (ArrayList<ProductoModel>) this.productoRepository.findAll();
	}
	
	public ProductoModel guardarProducto(ProductoModel producto) {
		return this.productoRepository.save(producto);
	}
	
	public ProductoModel actualizarProducto(ProductoModel producto) {
		if(this.productoRepository.existsById(producto.getId())) {

			return this.productoRepository.save(producto);
		}
		return null;
	}
	
	public Optional<ProductoModel> obtenerPorId(String id) {
		return this.productoRepository.findById(id);
	}
	
	public Boolean eliminarProducto(String id) {
		if(this.productoRepository.existsById(id)) {
			 this.productoRepository.deleteById(id);
			 return true;
		}else {
			return false;
		}
	}
	
	public ArrayList<ProductoModel> obtenerPorNombre(String nombre){
		return this.productoRepository.findByNombre(nombre);
	}
	
	public ArrayList<ProductoModel> obtenerPorCategoria(String categoria){
		return this.productoRepository.findByCategoria(categoria);
	}
	
	public ArrayList<ProductoModel> obtenerPorPrecio(Double precio){
		return this.productoRepository.findByPrecio(precio);
	}
	
}
