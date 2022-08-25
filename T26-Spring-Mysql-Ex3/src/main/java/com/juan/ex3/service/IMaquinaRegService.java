package com.juan.ex3.service;

import java.util.List;

import com.juan.ex3.dto.MaquinaReg;

public interface IMaquinaRegService {

	public List<MaquinaReg> listarMaquinaReg();

	public MaquinaReg guardarProductos(MaquinaReg maquinaReg);

	public MaquinaReg MaquinaRegPorId(int id);

	public MaquinaReg actualizarMaquinaReg(MaquinaReg maquinaReg);

	public void eliminarMaquinaReg(int id);
}
