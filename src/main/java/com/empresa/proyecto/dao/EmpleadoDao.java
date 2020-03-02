package com.empresa.proyecto.dao;

import java.util.List;

import com.empresa.proyecto.model.Empleado;

public interface EmpleadoDao {

	List<Empleado> listaEmpleado();

	Empleado obtenerEmpleado(int id);

	int registrarEmpleado(Empleado e);

	int eliminarEmpleado(int id);
}
