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
	public Empleado obtenerEmpleado(Empleado e) {
		Session sesion = entitymanager.unwrap(Session.class);
		Query<Empleado> query = sesion.createQuery("from Empleado e where e.id="+e.getId(), Empleado.class);
		Empleado em = query.uniqueResult();
		return em;
	}

	@Override
	public int registrarEmpleado(Empleado e) {
		Session sesion = entitymanager.unwrap(Session.class);
		Integer codResult = (Integer) sesion.save(e);
		if (codResult == null) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public int eliminarEmpleado(Empleado e) {
		Session sesion = entitymanager.unwrap(Session.class);
		Empleado e2 = obtenerEmpleado(e);
		sesion.delete(e2);
		return 1;
	}
	
	@Override
	public int actualizarEmpleado(Empleado e) {
		Session sesion = entitymanager.unwrap(Session.class);
		sesion.saveOrUpdate(e);
		return 1;
	}

}
