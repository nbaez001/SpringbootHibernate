package com.empresa.proyecto.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.empresa.proyecto.dao.EmpleadoDao;
import com.empresa.proyecto.model.Empleado;

@Repository
public class EmpleadoDaoImpl implements EmpleadoDao {

	@Autowired
	private EntityManager entitymanager;

	@Override
	public List<Empleado> listaEmpleado() {
		Session sesion = entitymanager.unwrap(Session.class);
		Query<Empleado> query = sesion.createQuery("from Empleado", Empleado.class);
		List<Empleado> lista = query.getResultList();
		return lista;
	}

	@Override
	public Empleado obtenerEmpleado(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int registrarEmpleado(Empleado e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminarEmpleado(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
