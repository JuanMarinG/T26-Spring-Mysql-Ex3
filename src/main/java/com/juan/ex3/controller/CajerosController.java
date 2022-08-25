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

import com.juan.ex3.dto.Cajeros;
import com.juan.ex3.dto.Productos;
import com.juan.ex3.service.CajerosServiceImpl;

@RestController
@RequestMapping("/api")
public class CajerosController {

	@Autowired CajerosServiceImpl cajerosServiceImpl;
	@GetMapping("/cajeros")
	public List<Cajeros> listarCajeros() {
		return cajerosServiceImpl.listarCajeros();
	}
	@PostMapping("/cajeros")
	public Cajeros guardarCajeros(Cajeros cajeros) {
		return cajerosServiceImpl.guardarCajeros(cajeros);
	}
	@GetMapping("/cajeros/{id}")
	public Cajeros CajerosPorId(@PathVariable(name = "id") int id) {
		Cajeros cajerosPorId = new Cajeros();
		cajerosPorId = cajerosServiceImpl.CajerosPorId(id);
		return cajerosPorId;
	}
	@PutMapping("/cajeros/{id}")
	public Cajeros actualizarCajeros(@PathVariable(name = "id") int id, @RequestBody Cajeros cajeros) {
		Cajeros cajeros_seleccionado = new Cajeros();
		Cajeros cajeros_actualizado = new Cajeros();

		cajeros_seleccionado = cajerosServiceImpl.CajerosPorId(id);

		cajeros_seleccionado.setId(cajeros.getId());
		cajeros_seleccionado.setNomApels(cajeros.getNomApels());

		cajeros_actualizado = cajerosServiceImpl.actualizarCajeros(cajeros_seleccionado);
		return cajeros_actualizado;
	}
	@DeleteMapping("/cajeros/{id}")
	public void eliminarCajeros(@PathVariable(name = "id") int id) {
		cajerosServiceImpl.eliminarCajeros(id);
	}
	
	
}
