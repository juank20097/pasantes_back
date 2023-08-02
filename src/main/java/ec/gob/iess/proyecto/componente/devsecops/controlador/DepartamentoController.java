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
import ec.gob.iess.proyecto.componente.devsecops.servicio.DepartamentoServicio;

// TODO: Auto-generated Javadoc
/**
 * Clase DepartamentoController.
 */
@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
	
	
	
	/** Inyecta un servicio DepartamentoServicio para acceder a los metodos del servicio departamento. */
	@Autowired
	private DepartamentoServicio departmentservice;
	
	/**
	 * Listar todos.
	 *
	 * @return the response entity
	 */
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public ResponseEntity< List<Departamento>> listarTodos(){
		return  ResponseEntity.status(HttpStatus.OK).body( departmentservice.listarTodos());
	}
	
/**
 * Insert.
 *
 * @param enter the enter
 * @return the response entity
 */
//	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping
	public ResponseEntity<Departamento> insert(@RequestBody Departamento enter) {
		return  ResponseEntity.status(HttpStatus.OK).body( departmentservice.crear(enter));
	}
	
/**
 * Update.
 *
 * @param enter the enter
 * @param id the id
 * @return the response entity
 */
//	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping(path = {"/{id}"})
	public ResponseEntity<Departamento> update(@RequestBody Departamento enter,@PathVariable("id") int id) {
		enter.setIdDepa(id);
		return  ResponseEntity.status(HttpStatus.OK).body(this.departmentservice.actualizar(enter));
	}
	
	/**
	 * Borrar.
	 *
	 * @param id the id
	 */
	@DeleteMapping(path = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public void borrar(@PathVariable("id") Integer id) {
		this.departmentservice.EliminarPorId(id);
	}
	
/**
 * Gets the id.
 *
 * @param id the id
 * @return the id
 */
//	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = {"/{id}"})
	public ResponseEntity<Optional<Departamento>> getId(@PathVariable("id") int id){
		return   ResponseEntity.status(HttpStatus.OK).body( this.departmentservice.getId(id));
	}

	
	
}
