package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {
	
	public void agregar(Estudiante estudiante);
	
	public List<Estudiante> buscarTodos();

}
