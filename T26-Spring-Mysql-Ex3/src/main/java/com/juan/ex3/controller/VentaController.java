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

import com.juan.ex3.dto.Venta;
import com.juan.ex3.service.VentaServiceImpl;

@RestController
@RequestMapping("/api")
public class VentaController {

	@Autowired VentaServiceImpl ventaServiceImpl;
	@GetMapping("/venta")
	public List<Venta> listarVenta() {
		return ventaServiceImpl.listarVenta();
	}
	@PostMapping("/venta")
	public Venta guardarVenta(Venta venta) {
		return ventaServiceImpl.guardarVenta(venta);
	}
	@GetMapping("/venta/{id}")
	public Venta VentaPorId(@PathVariable(name = "id") int id) {
		Venta ventaPorId = new Venta();
		ventaPorId = ventaServiceImpl.VentaPorId(id);
		return ventaPorId;
	}
	@PutMapping("venta/{id}")
	public Venta actualizarVenta(@PathVariable(name = "id") int id, @RequestBody Venta venta) {
		Venta venta_seleccionada = new Venta();
		Venta venta_actualizada = new Venta();

		venta_seleccionada = ventaServiceImpl.VentaPorId(id);

		venta_seleccionada.setIdCajero(venta.getIdCajero());
		venta_seleccionada.setIdMaquina(venta.getIdMaquina());
		venta_seleccionada.setIdProd(venta.getIdProd());

		venta_actualizada = ventaServiceImpl.actualizarVenta(venta_seleccionada);
		return venta_actualizada;
	}
	@DeleteMapping("/venta/{id}")
	public void eliminarVenta(@PathVariable(name = "id") int id) {
		ventaServiceImpl.eliminarVenta(id);
	}
	
	
}
