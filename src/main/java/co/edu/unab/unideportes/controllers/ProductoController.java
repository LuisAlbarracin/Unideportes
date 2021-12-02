package co.edu.unab.unideportes.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.unideportes.models.ProductoModel;
import co.edu.unab.unideportes.services.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	ProductoService productoService;
	
	@GetMapping()
	public ArrayList<ProductoModel> obtenerProductos(){
		return this.productoService.obtenerPoductos();
	}
	
	@PostMapping()
	public ProductoModel guardarProducto(@RequestBody ProductoModel producto) {
		return this.productoService.guardarProducto(producto);
	}
	
	@DeleteMapping(path = "{id}")
	public String eliminarProductoPorId(@PathVariable("id") String id) {
		if(this.productoService.eliminarProducto(id)) {
			return "Se elimino correctamente el producto: " +id;
		}
		return "Error al eliminar el producto: " +id;
	}
	
	@GetMapping(path = "/{id}")
	public Optional<ProductoModel> obtenerProductoPorId(@PathVariable("id") String id){
		return this.productoService.obtenerPorId(id);
	}
	
	@PutMapping()
	public String actualizarProducto(@RequestBody ProductoModel producto) {
		if (this.productoService.actualizarProducto(producto)==null) {
			return "Error al actualizar.";
		}
		
		return "Actualización Exitosa !!!";
	}
	
	@GetMapping(path = "/nombre/{nombre}")
	public ArrayList<ProductoModel> obtenerProductoPorNombre(@PathVariable("nombre") String nombre){
		return this.productoService.obtenerPorNombre(nombre);
	}
	
	@GetMapping(path = "/categoria/{categoria}")
	public ArrayList<ProductoModel> obtenerProductoPorCategoria(@PathVariable("categoria") String categoria){
		return this.productoService.obtenerPorCategoria(categoria);
	}
	
	@GetMapping(path = "/precio/{precio}")
	public ArrayList<ProductoModel> obtenerProductoPorPrecio(@PathVariable("precio") Double precio){
		return this.productoService.obtenerPorPrecio(precio);
	}
	
}
