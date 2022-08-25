package com.juan.ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.ex3.dao.IVentaDAO;
import com.juan.ex3.dto.Venta;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired IVentaDAO iventaDAO;
	
	@Override
	public List<Venta> listarVenta() {
		// TODO Auto-generated method stub
		return iventaDAO.findAll();
	}

	@Override
	public Venta guardarVenta(Venta venta) {
		// TODO Auto-generated method stub
		return iventaDAO.save(venta);
	}

	@Override
	public Venta VentaPorId(int id) {
		// TODO Auto-generated method stub
		return iventaDAO.findById(id).get();
	}

	@Override
	public Venta actualizarVenta(Venta venta) {
		// TODO Auto-generated method stub
		return iventaDAO.save(venta);
	}

	@Override
	public void eliminarVenta(int id) {
		iventaDAO.deleteById(id);
		
	}

}
