package com.empresa.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.proyecto.model.Empleado;
import com.empresa.proyecto.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

	@Autowired
	EmpleadoService empleadoService;

	@PostMapping(value = "/listar")
	public List<Empleado> listarEmpleado() {
		return empleadoService.listaEmpleado();
	}
	
	@PostMapping(value = "/registrar")
	public int registrarEmpleado(@RequestBody Empleado e) {
		return empleadoService.registrarEmpleado(e);
	}
	
	@PostMapping(value = "/obtener")
	public Empleado obtenerEmpleado(@RequestBody Empleado e) {
		return empleadoService.obtenerEmpleado(e);
	}
	
	@PostMapping(value = "/eliminar")
	public int eliminarEmpleado(@RequestBody Empleado e) {
		return empleadoService.eliminarEmpleado(e);
	}
	
	@PostMapping(value = "/actualizar")
	public int actualizarEmpleado(@RequestBody Empleado e) {
		return empleadoService.actualizarEmpleado(e);
	}

}
