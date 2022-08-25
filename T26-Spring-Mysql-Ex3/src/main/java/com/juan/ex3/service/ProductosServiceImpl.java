package com.juan.ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.ex3.dao.IProductosDAO;
import com.juan.ex3.dto.Productos;
@Service
public class ProductosServiceImpl implements IProductosService{

	@Autowired 
	IProductosDAO iproductosDAO;
	
	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return iproductosDAO.findAll();
	}

	@Override
	public Productos guardarProductos(Productos Productos) {
		// TODO Auto-generated method stub
		return iproductosDAO.save(Productos);
	}

	@Override
	public Productos ProductosPorId(int id) {
		// TODO Auto-generated method stub
		return iproductosDAO.findById(id).get();
	}

	@Override
	public Productos actualizarProductos(Productos Productos) {
		// TODO Auto-generated method stub
		return iproductosDAO.save(Productos);
	}

	@Override
	public void eliminarProductos(int id) {
		iproductosDAO.deleteById(id);
		
	}

}
