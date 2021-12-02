package co.edu.unab.unideportes.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unab.unideportes.models.ProductoModel;

public interface ProductoRepository extends MongoRepository<ProductoModel, String> {

	ArrayList<ProductoModel> findByNombre(String nombre);
	
	ArrayList<ProductoModel> findByCategoria(String categoria);
	
	ArrayList<ProductoModel> findByDisponibilidad(Boolean disponible);
	
	ArrayList<ProductoModel> findByPrecio(Double precio);
	
	//ArrayList<ProductoModel> findByPrecioGreaterThanEqual(Double precio);
}
