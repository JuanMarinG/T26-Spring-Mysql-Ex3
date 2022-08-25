package com.juan.ex3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juan.ex3.dto.Venta;

public interface IVentaDAO extends JpaRepository <Venta, Integer>{

}
