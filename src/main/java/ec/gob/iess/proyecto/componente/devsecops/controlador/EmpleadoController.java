package ec.gob.iess.proyecto.componente.devsecops.controlador;

import java.util.List;

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

import ec.gob.iess.proyecto.componente.devsecops.entidad.Empleado;
import ec.gob.iess.proyecto.componente.devsecops.servicio.EmpleadoServicio;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

	
	@Autowired
	private EmpleadoServicio empleadoService;
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public ResponseEntity<List<Empleado>> listarTodos(){
		return ResponseEntity.status(HttpStatus.OK).body( empleadoService.listarTodos());
	}
	
	@PostMapping
	public ResponseEntity<Empleado> guardar(@RequestBody Empleado empl) {
		return ResponseEntity.status(HttpStatus.OK).body(empleadoService.crear(empl));
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Empleado> actualizar(@RequestBody Empleado empl,@PathVariable("id") int id) {
		empl.setIdEmpl(id);
		return ResponseEntity.status(HttpStatus.OK).body( this.empleadoService.actualizar(empl));
	}
	
	
}
