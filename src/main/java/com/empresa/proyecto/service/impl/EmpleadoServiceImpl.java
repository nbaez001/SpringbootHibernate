package com.empresa.proyecto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.empresa.proyecto.dao.EmpleadoDao;
import com.empresa.proyecto.model.Empleado;
import com.empresa.proyecto.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoDao empleadoDao;

	@Transactional
	@Override
	public List<Empleado> listaEmpleado() {
		return empleadoDao.listaEmpleado();
	}

	@Transactional
	@Override
	public Empleado obtenerEmpleado(Empleado e) {
		return empleadoDao.obtenerEmpleado(e);
	}

	@Transactional
	@Override
	public int registrarEmpleado(Empleado e) {
		return empleadoDao.registrarEmpleado(e);
	}

	@Transactional
	@Override
	public int eliminarEmpleado(Empleado e) {
		return empleadoDao.eliminarEmpleado(e);
	}

	@Override
	public int actualizarEmpleado(Empleado e) {
		return empleadoDao.actualizarEmpleado(e);
	}

}
