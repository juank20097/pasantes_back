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

import ec.gob.iess.proyecto.componente.devsecops.entidad.Departamento;
import ec.gob.iess.proyecto.componente.devsecops.entidad.DepartamentoEmpleado;
import ec.gob.iess.proyecto.componente.devsecops.entidad.Empleado;
import ec.gob.iess.proyecto.componente.devsecops.servicio.DepartamentoEmpleadoServicio;

// TODO: Auto-generated Javadoc
/**
 * Clase DepartamentoEmpleadoController.
 */
@RestController
@RequestMapping("/departamentoEmpleado")
public class DepartamentoEmpleadoController {

	
	/** Inyecta un servicio DepartamentoServicio para acceder a los metodos del servicio DepartamentoEmpleado. */
	@Autowired
	private DepartamentoEmpleadoServicio departamentoEmpleadoService;
	
	/**
	 * Listar todos.
	 *
	 * @return the list
	 */
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public List<DepartamentoEmpleado> listarTodos(){
		return departamentoEmpleadoService.listarTodos();
	}
	
	
	/**
	 * Insert.
	 *
	 * @param depaEmpleado the depa empleado
	 * @return the departamento empleado
	 */
	@PostMapping
	public DepartamentoEmpleado insert(@RequestBody DepartamentoEmpleado depaEmpleado) {
		return departamentoEmpleadoService.crear(depaEmpleado);
	}
	
	/**
	 * Actualizar.
	 *
	 * @param departEmpleado the depart empleado
	 * @param id the id
	 * @return the response entity
	 */
	@PutMapping(path = "/{id}")
	public ResponseEntity<DepartamentoEmpleado> actualizar(@RequestBody DepartamentoEmpleado departEmpleado,@PathVariable("id") Integer id) {
		departEmpleado.setIdDepEmpl(id);
		return ResponseEntity.status(HttpStatus.OK).body( this.departamentoEmpleadoService.actualizar(departEmpleado));
	}
	
	/**
	 * Borrar.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	@DeleteMapping(path = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<DepartamentoEmpleado>> borrar(@PathVariable("id") Integer id) {
		
		this.departamentoEmpleadoService.EliminarPorId(id);
		return ResponseEntity.status(HttpStatus.OK).body(this.listarTodos());
	}
	
	/**
	 * Buscar por id.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	@GetMapping(path = {"/{id}"})
	public ResponseEntity<Optional<DepartamentoEmpleado>> buscarPorId (@PathVariable("id") int id){
		return   ResponseEntity.status(HttpStatus.OK).body( this.departamentoEmpleadoService.listarPorId(id));
	}
	
	
	/**
	 * Listar departamentos.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	@GetMapping(path = {"departamentos/{id}"})
	public ResponseEntity<List<DepartamentoEmpleado>> listarDepartamentos (@PathVariable("id") int id){
		return   ResponseEntity.status(HttpStatus.OK).body( this.departamentoEmpleadoService.listarDepartamentos(id));
	}
	
	/**
	 * Listar empleados.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	@GetMapping(path = {"empleados/{id}"})
	public ResponseEntity<List<DepartamentoEmpleado>> listarEmpleados (@PathVariable("id") int id){
		return   ResponseEntity.status(HttpStatus.OK).body( this.departamentoEmpleadoService.listarEmpleados(id));
	}
	
	
	
	
	
}
