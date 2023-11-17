/* 
 * Copyright 2011 INSTITUTO ECUATORIANO DE SEGURIDAD SOCIAL - ECUADOR. 
 * Todos los derechos reservados. 
 */

package ec.gob.iess.proyecto.componente.devsecops.controlador;


import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
 * <b>
 * Proporciona accesos a los metodos de la clase EmpresaServicio.
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
@RequestMapping("/empresas")
public class EmpresaController {

	/** Inyecta un servicio EmpresaServicio para acceder a los metodos de la clase. */
	@Autowired
	private EmpresaServicio empresaService;
	
	/**
	 * <p>
	 * <b> Llama al método listarTodos de la clase EmpresaServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @return corresponde a la lista de todas las empresas con estado activo
	 */
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Empresa>> listarTodos(){
		return ResponseEntity.status(HttpStatus.OK).body(this.empresaService.listarTodos());
	}
	
	/**
	 * <p>
	 * <b>Llama al método crear de la clase EmpresaServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param empresa - corresponde a un objeto con los datos de la empresa que se
	 *                desea guardar
	 * @return corresponde a un objeto con los datos de la empresa que se guardó
	 * 
	 */
	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Empresa> guardar(@RequestBody Empresa empresa) {
		return 	ResponseEntity.status(HttpStatus.OK).body(this.empresaService.crear(empresa)) ;
	}
	
	/**
	 * <p>
	 * <b>Llama al método actualizar de la clase EmpresaServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param empresa - corresponde al objeto con los datos de la empresa que se
	 *                desea actualizar
	 * @return corresponde al objeto con los datos de la empresa que se actualizó
	 */
	//@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping(path = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Empresa> actualizar(@RequestBody Empresa empresa,@PathVariable("id") int id) {
		empresa.setIdEmpr(id);
		return ResponseEntity.status(HttpStatus.OK).body(this.empresaService.actualizar(empresa));
	}
	
	
	/**
	 * <p>
	 * <b> Llama al método EliminarPorId de la clase EmpresaServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador de la empresa que se desea borrar
	 */
	@DeleteMapping(path = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public void borrar(@PathVariable("id") Integer id) {
		this.empresaService.EliminarPorId(id);
	}
	
	/**
	 * <p>
	 * <b> Llama al método buscarPorId de la clase EmpresaServicio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador de la empresa que se desea
	 *                buscar
	 * @return corresponde al objeto con los datos de la empresa que se actualizó
	 *         manejando una posible devolución de un objeto nulo mediante el Optional
	 */
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<Empresa>>  buscarPorId(@PathVariable("id") int id){
		return ResponseEntity.status(HttpStatus.OK).body(this.empresaService.listarPorId(id));
	}
	
	

}
