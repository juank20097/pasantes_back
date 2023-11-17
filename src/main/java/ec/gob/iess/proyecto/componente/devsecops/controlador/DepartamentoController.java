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
import ec.gob.iess.proyecto.componente.devsecops.servicio.DepartamentoServicio;

// TODO: Auto-generated Javadoc
/**
 * <b>
 * Proporciona accesos a los metodos de la clase DepartamentoServicio.
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
@RequestMapping("/departamentos")
public class DepartamentoController {
	
	
	
	/** Inyecta un servicio DepartamentoServicio para acceder a los metodos de la clase. */
	@Autowired
	private DepartamentoServicio departmentservice;
	
	/**
	 * <p>
	 * <b> Llama al método listarTodos de la clase DepartamentoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @return corresponde a la lista de todos los departamentos con estado activo
	 */
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public ResponseEntity< List<Departamento>> listarTodos(){
		return  ResponseEntity.status(HttpStatus.OK).body( departmentservice.listarTodos());
	}
	
	/**
	 * <p>
	 * <b> Llama al método listarPotId de la clase DepartamentoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador del departamento que se desea buscar
	 *               
	 * @return corresponde al objeto con los datos del departamento que se actualizó
	 *          manejando una posible devolución de un objeto nulo mediante el Optional
	 */
//	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = {"/{id}"})
	public ResponseEntity<Optional<Departamento>> buscarPorId(@PathVariable("id") int id){
		return   ResponseEntity.status(HttpStatus.OK).body( this.departmentservice.listarPotId(id));
	}
	
	/**
	 * <p>
	 * <b>Llama al método crear de la clase DepartamentoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param departamento - corresponde a un objeto con los datos del departamento
	 *                     que se desea crear
	 * @return corresponde a un objeto con los datos del departamento que se creó
	 */
//	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping
	public ResponseEntity<Departamento> insert(@RequestBody Departamento departamento) {
		return  ResponseEntity.status(HttpStatus.OK).body( departmentservice.crear(departamento));
	}
	
	/**
	 * <p>
	 * <b>Llama al método actualizar de la clase DepartamentoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param departamento - corresponde al objeto con los datos del departamento
	 *                     que se desea actualizar
	 * @return corresponde al objeto con los datos del departamento que se actualizó
	 */
//	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping(path = {"/{id}"})
	public ResponseEntity<Departamento> update(@RequestBody Departamento departamento,@PathVariable("id") int id) {
		departamento.setIdDepa(id);
		return  ResponseEntity.status(HttpStatus.OK).body(this.departmentservice.actualizar(departamento));
	}
	
	/**
	 * <p>
	 * <b> Llama al método EliminarPorId de la clase DepartamentoServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador del departamento que se desea eliminar
	 *           
	 */
	@DeleteMapping(path = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public void borrar(@PathVariable("id") Integer id) {
		this.departmentservice.EliminarPorId(id);
	}
	


	
	
}
