package com.juan.ex3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.ex3.dto.Productos;
import com.juan.ex3.service.ProductosServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductosController {

	@Autowired
	ProductosServiceImpl productosServiceImpl;
	@GetMapping("/productos")
	public List<Productos> listarProductos() {
		return productosServiceImpl.listarProductos();
	}
	@PostMapping("/productos")
	public Productos guardarProductos(Productos Productos) {
		return productosServiceImpl.guardarProductos(Productos);
	}
	@GetMapping("/productos/{id}")
	public Productos ProductosPorId(@PathVariable(name = "id") int id) {
		Productos productosPorId = new Productos();
		productosPorId = productosServiceImpl.ProductosPorId(id);
		return productosPorId;
	}
	@PutMapping("/productos/{id}")
	public Productos actualizarProductos(@PathVariable(name = "id") int id, @RequestBody Productos Productos) {
		Productos productos_seleccionado = new Productos();
		Productos productos_actualizado = new Productos();

		productos_seleccionado = productosServiceImpl.ProductosPorId(id);

		productos_seleccionado.setId(Productos.getId());
		productos_seleccionado.setNombre(Productos.getNombre());
		productos_seleccionado.setPrecio(Productos.getPrecio());

		productos_actualizado = productosServiceImpl.actualizarProductos(productos_seleccionado);
		return productos_actualizado;
	}
	@DeleteMapping("/productos/{id}")
	public void eliminarProductos(@PathVariable(name = "id") int id) {
		productosServiceImpl.eliminarProductos(id);
	}
	
	
}
