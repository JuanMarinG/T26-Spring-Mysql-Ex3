package com.juan.ex3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juan.ex3.dto.Productos;

public interface IProductosDAO extends JpaRepository <Productos, Integer> {

}
