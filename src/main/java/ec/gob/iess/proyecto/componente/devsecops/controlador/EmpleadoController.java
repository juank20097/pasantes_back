/* 
 * Copyright 2011 INSTITUTO ECUATORIANO DE SEGURIDAD SOCIAL - ECUADOR. 
 * Todos los derechos reservados. 
 */

package ec.gob.iess.proyecto.componente.devsecops.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Empleado;
import ec.gob.iess.proyecto.componente.devsecops.servicio.EmpleadoServicio;

// TODO: Auto-generated Javadoc
/**
 * <b>
 * Proporciona accesos a los metodos de la clase EmpleadoServicio.
 * </b>
 * 
 * @author andres.benavides
 * @version $Revision: 1.0
 *          <p>
 *          $[Author: andres.benavides $, $Date: 2024/08/23 $]
 *          </p>
 */
@CrossOrigin
@RestController
@RequestMapping("/empleados")

public class EmpleadoController {

	/**
	 * Inyecta un servicio EmpleadoServicio para acceder a los metodos de la clase.
	 */
	@Autowired
	private EmpleadoServicio empleadoService;

	/**
	 * <p>
	 * <b> Llama al método listarTodos de la clase EmpleadoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @return corresponde a la lista de todos los empleados con estado activo
	 */
	// @CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public ResponseEntity<List<Empleado>> listarTodos() {
		return ResponseEntity.status(HttpStatus.OK).body(this.empleadoService.listarTodos());
	}

	/**
	 * <p>
	 * <b>Llama al método crear de la clase EmpleadoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param empleado - corresponde a un objeto con los datos del empleado que se
	 *                 desea guardar
	 * @return corresponde a un objeto con los datos del empleado que se guardó
	 */
	@PostMapping
	public ResponseEntity<Empleado> guardar(@RequestBody Empleado empleado) {
		return ResponseEntity.status(HttpStatus.OK).body(this.empleadoService.crear(empleado));
	}

	/**
	 * <p>
	 * <b>Llama al método actualizar de la clase EmpleadoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param empleado - corresponde al objeto con los datos del empleado que se
	 *                 desea actualizar
	 * @return corresponde al objeto con los datos del empleado que se actualizó
	 */
	@PutMapping(path = "/{id}")
	public ResponseEntity<Empleado> actualizar(@RequestBody Empleado empleado, @PathVariable("id") int id) {
		empleado.setIdEmpl(id);
		return ResponseEntity.status(HttpStatus.OK).body(this.empleadoService.actualizar(empleado));
	}

	/**
	 * <p>
	 * <b> Llama al método EliminarPorId de la clase EmpleadoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador de la empleado que se desea eliminar
	 */
	@DeleteMapping(path = { "/{id}" }, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Empleado>> borrar(@PathVariable("id") Integer id) {
		this.empleadoService.EliminarPorId(id);
		return this.listarTodos();
	}

	/**
	 * <p>
	 * <b> Llama al método listarPotId de la clase EmpleadoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador del empleado que se desea buscar
	 * @return corresponde al objeto con los datos del empleado que se actualizó
	 *         manejando una posible devolución de un objeto nulo mediante el
	 *         Optional
	 */
	// @CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = { "/{id}" }, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<Empleado>> buscarPorId(@PathVariable("id") Integer id) {
		return ResponseEntity.status(HttpStatus.OK).body(this.empleadoService.listarPotId(id));
	}

}
