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

import ec.gob.iess.proyecto.componente.devsecops.entidad.Departamento;
import ec.gob.iess.proyecto.componente.devsecops.entidad.DepartamentoEmpleado;
import ec.gob.iess.proyecto.componente.devsecops.entidad.Empleado;
import ec.gob.iess.proyecto.componente.devsecops.servicio.DepartamentoEmpleadoServicio;

// TODO: Auto-generated Javadoc
/**
 * <b>
 * Proporciona accesos a los metodos de la clase DepartamentoEmpleadoServicio.
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
@RequestMapping("/departamentoEmpleado")
public class DepartamentoEmpleadoController {

	
	/** Inyecta un servicio DepartamentoServicio para acceder a los metodos del servicio DepartamentoEmpleado. */
	@Autowired
	private DepartamentoEmpleadoServicio departamentoEmpleadoService;
	
	
	/**
	 * <p>
	 * <b> Llama al método listarTodos de la clase DepartamentoEmpleadoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @return corresponde a la lista de todos los DepartamentoEmpleado con estado activo
	 */
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public List<DepartamentoEmpleado> listarTodos(){
		return departamentoEmpleadoService.listarTodos();
	}
	
	
	/**
	 * <p>
	 * <b>Llama al método crear de la clase DepartamentoEmpleadoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param departEmpleado - corresponde a un objeto con los datos de DepartamentoEmpleado que se
	 *                desea crear
	 * @return corresponde a un objeto con los datos de DepartamentoEmpleado que se creó
	 *         
	 */
	@PostMapping
	public DepartamentoEmpleado insert(@RequestBody DepartamentoEmpleado departEmpleado) {
		return departamentoEmpleadoService.crear(departEmpleado);
	}
	
	/**
	 * <p>
	 * <b>Llama al método actualizar de la clase DepartamentoEmpleadoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param departEmpleado - corresponde al objeto con los datos de DepartamentoEmpleado que se
	 *                 desea actualizar
	 * @return corresponde al objeto con los datos de DepartamentoEmpleado que se actualizó
	 */
	@PutMapping(path = "/{id}")
	public ResponseEntity<DepartamentoEmpleado> actualizar(@RequestBody DepartamentoEmpleado departEmpleado,@PathVariable("id") Integer id) {
		departEmpleado.setIdDepEmpl(id);
		return ResponseEntity.status(HttpStatus.OK).body( this.departamentoEmpleadoService.actualizar(departEmpleado));
	}
	
	/**
	 * <p>
	 * <b> Llama al método EliminarPorId de la clase DepartamentoEmpleadoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador del DepartamentoEmpleado que se desea eliminar
	 * 
	 * @return corresponde a la lista actualizada de todas los DepartamentoEmpleado
	 */
	@DeleteMapping(path = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<DepartamentoEmpleado>> borrar(@PathVariable("id") Integer id) {
		
		this.departamentoEmpleadoService.EliminarPorId(id);
		return ResponseEntity.status(HttpStatus.OK).body(this.listarTodos());
	}
	
	/**
	 * <p>
	 * <b> Llama al método listarPorId de la clase DepartamentoEmpleadoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador de DepartamentoEmpleado que se desea
	 *                buscar
	 * @return corresponde al objeto con los datos de DepartamentoEmpleado que se buscó
	 *         manejando una posible devolución de un objeto nulo mediante el Optional
	 */
	@GetMapping(path = {"/{id}"})
	public ResponseEntity<Optional<DepartamentoEmpleado>> buscarPorId (@PathVariable("id") int id){
		return   ResponseEntity.status(HttpStatus.OK).body( this.departamentoEmpleadoService.listarPorId(id));
	}
	
	
	/**
	 * <p>
	 * <b> Llama al método listarDepartamentos de la clase DepartamentoEmpleadoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador de departamento que se desea buscar
	 *               
	 * @return corresponde a la lista con los datos de DepartamentoEmpleado relacionado al id de departamento 
	 */
	@GetMapping(path = {"departamentos/{id}"})
	public ResponseEntity<List<DepartamentoEmpleado>> listarDepartamentos (@PathVariable("id") int id){
		return   ResponseEntity.status(HttpStatus.OK).body( this.departamentoEmpleadoService.listarDepartamentos(id));
	}
	
	/**
	 * <p>
	 * <b> Llama al método listarDepartamentos de la clase DepartamentoEmpleadoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador de empleado que se desea buscar
	 *                
	 * @return corresponde a la lista con los datos de DepartamentoEmpleado relacionado al id de empleado
	 */
	@GetMapping(path = {"empleados/{id}"})
	public ResponseEntity<List<DepartamentoEmpleado>> listarEmpleados (@PathVariable("id") int id){
		return   ResponseEntity.status(HttpStatus.OK).body( this.departamentoEmpleadoService.listarEmpleados(id));
	}
	

	
	
	
	
	
}
