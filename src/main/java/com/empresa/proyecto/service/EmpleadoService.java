package com.empresa.proyecto.service;

import java.util.List;

import com.empresa.proyecto.model.Empleado;

public interface EmpleadoService {
	
	List<Empleado> listaEmpleado();

	Empleado obtenerEmpleado(Empleado e);

	int registrarEmpleado(Empleado e);

	int eliminarEmpleado(Empleado e);
	
	int actualizarEmpleado(Empleado e);
}
