package com.juan.ex3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.ex3.dto.MaquinaReg;
import com.juan.ex3.service.MaquinaRegServiceImpl;

@RestController
@RequestMapping("/api")
public class MaquinaRegController {

	@Autowired MaquinaRegServiceImpl maquinaServiceImpl;
	@GetMapping("/maquinaReg")
	public List<MaquinaReg> listarMaquinaReg() {
		return maquinaServiceImpl.listarMaquinaReg();
	}
	@PostMapping("/maquinaReg")
	public MaquinaReg guardarProductos(MaquinaReg maquinaReg) {
		return maquinaServiceImpl.guardarProductos(maquinaReg);
	}
	@GetMapping("/maquinaReg/{id}")
	public MaquinaReg MaquinaRegPorId(@PathVariable(name = "id") int id) {
		MaquinaReg maquinaRegPorId = new MaquinaReg();
		maquinaRegPorId = maquinaServiceImpl.MaquinaRegPorId(id);
		return maquinaRegPorId;
	}
	@PutMapping("/maquinaReg/{id}")
	public MaquinaReg actualizarMaquinaReg(@PathVariable(name = "id") int id, MaquinaReg maquinaReg) {
		MaquinaReg  MaquinaReg_seleccionado = new MaquinaReg();
		MaquinaReg  MaquinaReg_actualizado = new MaquinaReg();

		MaquinaReg_seleccionado = maquinaServiceImpl.MaquinaRegPorId(id);

		MaquinaReg_seleccionado.setId(maquinaReg.getId());
		MaquinaReg_seleccionado.setPiso(maquinaReg.getPiso());

		MaquinaReg_actualizado = maquinaServiceImpl.actualizarMaquinaReg(MaquinaReg_seleccionado);
		return MaquinaReg_actualizado;
	}
	@DeleteMapping("/maquinaReg/{id}")
	public void eliminarMaquinaReg(@PathVariable(name = "id") int id) {
		maquinaServiceImpl.eliminarMaquinaReg(id);
	}
	
	
}
