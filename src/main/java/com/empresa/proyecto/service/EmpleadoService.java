package com.empresa.proyecto.service;

import java.util.List;

import com.empresa.proyecto.model.Empleado;

public interface EmpleadoService {
	
	List<Empleado> listaEmpleado();

	Empleado obtenerEmpleado(int id);

	int registrarEmpleado(Empleado e);

	int eliminarEmpleado(int id);
}
