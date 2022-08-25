package com.juan.ex3.service;

import java.util.List;

import com.juan.ex3.dto.Cajeros;

public interface ICajerosService {

	public List<Cajeros> listarCajeros();

	public Cajeros guardarCajeros(Cajeros cajeros);

	public Cajeros CajerosPorId(int id);

	public Cajeros actualizarCajeros(Cajeros cajeros);

	public void eliminarCajeros(int id);
}
