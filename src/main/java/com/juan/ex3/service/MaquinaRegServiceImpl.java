package com.juan.ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.ex3.dao.IMaquinaRegDAO;
import com.juan.ex3.dto.MaquinaReg;

@Service
public class MaquinaRegServiceImpl implements IMaquinaRegService{

	@Autowired IMaquinaRegDAO imaquinaRegDAO;

	@Override
	public List<MaquinaReg> listarMaquinaReg() {
		// TODO Auto-generated method stub
		return imaquinaRegDAO.findAll();
	}

	@Override
	public MaquinaReg guardarProductos(MaquinaReg maquinaReg) {
		// TODO Auto-generated method stub
		return imaquinaRegDAO.save(maquinaReg);
	}

	@Override
	public MaquinaReg MaquinaRegPorId(int id) {
		// TODO Auto-generated method stub
		return imaquinaRegDAO.findById(id).get();
	}

	@Override
	public MaquinaReg actualizarMaquinaReg(MaquinaReg maquinaReg) {
		// TODO Auto-generated method stub
		return imaquinaRegDAO.save(maquinaReg);
	}

	@Override
	public void eliminarMaquinaReg(int id) {
		imaquinaRegDAO.deleteById(id);
		
	}
	
	
	
}
