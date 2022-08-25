package com.juan.ex3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juan.ex3.dto.MaquinaReg;

public interface IMaquinaRegDAO extends JpaRepository <MaquinaReg, Integer> {

}
