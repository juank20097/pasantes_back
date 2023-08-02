package ec.gob.iess.proyecto.componente.devsecops.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
 * Clase EmpleadoController.
 */
@RestController
@RequestMapping("/empleados")

public class EmpleadoController {

	
	/** Inyecta un servicio EmpleadoServicio para acceder a los metodos del servicio empleado. */
	@Autowired
	private EmpleadoServicio empleadoService;
	
	/**
	 * Listar todos.
	 *
	 * @return the response entity
	 */
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public ResponseEntity<List<Empleado>> listarTodos(){
		return ResponseEntity.status(HttpStatus.OK).body( empleadoService.listarTodos());
	}
	
	/**
	 * Guardar.
	 *
	 * @param empl the empl
	 * @return the response entity
	 */
	@PostMapping
	public ResponseEntity<Empleado> guardar(@RequestBody Empleado empl) {
		return ResponseEntity.status(HttpStatus.OK).body(empleadoService.crear(empl));
	}
	
	/**
	 * Actualizar.
	 *
	 * @param empl the empl
	 * @param id the id
	 * @return the response entity
	 */
	@PutMapping(path = "/{id}")
	public ResponseEntity<Empleado> actualizar(@RequestBody Empleado empl,@PathVariable("id") int id) {
		empl.setIdEmpl(id);
		return ResponseEntity.status(HttpStatus.OK).body( this.empleadoService.actualizar(empl));
	}
	
	/**
	 * Borrar.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	@DeleteMapping(path = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Empleado>> borrar(@PathVariable("id") Integer id) {
		this.empleadoService.EliminarPorId(id);
		return this.listarTodos();
	}
	
	/**
	 * Buscar por id.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<Empleado>>  buscarPorId(@PathVariable("id") Integer id){
		return ResponseEntity.status(HttpStatus.OK).body( empleadoService.listarPotId(id));
	}
	
	
}
