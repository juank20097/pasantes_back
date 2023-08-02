package ec.gob.iess.proyecto.componente.devsecops.controlador;


import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Empresa;
import ec.gob.iess.proyecto.componente.devsecops.servicio.EmpresaServicio;

// TODO: Auto-generated Javadoc
/**
 * Clase EmpresaController.
 */
@RestController
@RequestMapping("/empresas")
public class EmpresaController {

	/** Inyecta un servicio EmpresaServicio para acceder a los metodos del servicio empresa. */
	@Autowired
	private EmpresaServicio empresaService;
	
	/**
	 * Listar todos.
	 *
	 * @return the response entity
	 */
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Empresa>> listarTodos(){
		return ResponseEntity.status(HttpStatus.OK).body(empresaService.listarTodos());
	}
	
	/**
	 * Guardar.
	 *
	 * @param empre the empre
	 * @return the response entity
	 */
	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Empresa> guardar(@RequestBody Empresa empre) {
		return 	ResponseEntity.status(HttpStatus.OK).body(empresaService.crear(empre)) ;
	}
	
	/**
	 * Actualizar.
	 *
	 * @param empre the empre
	 * @param id the id
	 * @return the response entity
	 */
	//@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping(path = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Empresa> actualizar(@RequestBody Empresa empre,@PathVariable("id") int id) {
		empre.setIdEmpr(id);
		return ResponseEntity.status(HttpStatus.OK).body( empresaService.actualizar(empre));
	}
	
	
	/**
	 * Borrar.
	 *
	 * @param id the id
	 */
	@DeleteMapping(path = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public void borrar(@PathVariable("id") Integer id) {
		this.empresaService.EliminarPorId(id);
	}
	
	/**
	 * Buscar por id.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<Empresa>>  buscarPorId(@PathVariable("id") int id){
		return ResponseEntity.status(HttpStatus.OK).body( empresaService.listarPorId(id));
	}
	
	

}
