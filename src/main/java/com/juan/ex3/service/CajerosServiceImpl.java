package com.juan.ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.ex3.dao.ICajerosDAO;
import com.juan.ex3.dto.Cajeros;

@Service
public class CajerosServiceImpl implements ICajerosService{

	@Autowired
	ICajerosDAO icajerosDAO;
	
	@Override
	public List<Cajeros> listarCajeros() {
		// TODO Auto-generated method stub
		return icajerosDAO.findAll();
	}

	@Override
	public Cajeros guardarCajeros(Cajeros cajeros) {
		// TODO Auto-generated method stub
		return icajerosDAO.save(cajeros);
	}

	@Override
	public Cajeros CajerosPorId(int id) {
		// TODO Auto-generated method stub
		return icajerosDAO.findById(id).get();
	}

	@Override
	public Cajeros actualizarCajeros(Cajeros cajeros) {
		// TODO Auto-generated method stub
		return icajerosDAO.save(cajeros);
	}

	@Override
	public void eliminarCajeros(int id) {
		icajerosDAO.deleteById(id);
		
	}

}
