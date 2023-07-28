package ec.gob.iess.proyecto.componente.devsecops.controlador;


import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Empresa;
import ec.gob.iess.proyecto.componente.devsecops.servicio.EmpresaServicio;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

	@Autowired
	private EmpresaServicio empresaService;
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Empresa>> listarTodos(){
		return ResponseEntity.status(HttpStatus.OK).body(empresaService.listarTodos());
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Empresa> guardar(@RequestBody Empresa empre) {
		return 	ResponseEntity.status(HttpStatus.OK).body(empresaService.crear(empre)) ;
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping(path = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Empresa> actualizar(@RequestBody Empresa empre,@PathVariable("id") int id) {
		empre.setIdEmpr(id);
		return ResponseEntity.status(HttpStatus.OK).body( empresaService.actualizar(empre));
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<Empresa>>  buscarPorId(@PathVariable("id") int id){
		return ResponseEntity.status(HttpStatus.OK).body( empresaService.listarPorId(id));
	}

}
