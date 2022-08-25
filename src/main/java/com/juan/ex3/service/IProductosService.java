package com.juan.ex3.service;

import java.util.List;

import com.juan.ex3.dto.Productos;

public interface IProductosService {

	public List<Productos> listarProductos();

	public Productos guardarProductos(Productos Productos);

	public Productos ProductosPorId(int id);

	public Productos actualizarProductos(Productos Productos);

	public void eliminarProductos(int id);
}
