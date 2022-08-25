package com.juan.ex3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juan.ex3.dto.Cajeros;

public interface ICajerosDAO extends JpaRepository <Cajeros, Integer> {

}
