package ec.gob.iess.proyecto.componente.devsecops.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Departamento;
import ec.gob.iess.proyecto.componente.devsecops.servicio.DepartamentoServicio;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
	
	
	
	@Autowired
	private DepartamentoServicio departmentservice;
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public ResponseEntity< List<Departamento>> listarTodos(){
		return  ResponseEntity.status(HttpStatus.OK).body( departmentservice.listarTodos());
	}
	
//	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping
	public ResponseEntity<Departamento> insert(@RequestBody Departamento enter) {
		return  ResponseEntity.status(HttpStatus.OK).body( departmentservice.insertUpdate(enter));
	}
	
//	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping(path = {"/{id}"})
	public ResponseEntity<Departamento> update(@RequestBody Departamento enter,@PathVariable("id") int id) {
		enter.setIdDepa(id);
		return  ResponseEntity.status(HttpStatus.OK).body(this.departmentservice.insertUpdate(enter));
	}
	
//	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = {"/{id}"})
	public ResponseEntity<Optional<Departamento>> getId(@PathVariable("id") int id){
		return   ResponseEntity.status(HttpStatus.OK).body( this.departmentservice.getId(id));
	}

	
	
}
