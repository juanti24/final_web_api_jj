package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.EstudianteRepositoryImpl;
import com.uce.edu.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	
	@Autowired
	private EstudianteRepositoryImpl estudianteRepositoryImpl;


	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
	}

}
