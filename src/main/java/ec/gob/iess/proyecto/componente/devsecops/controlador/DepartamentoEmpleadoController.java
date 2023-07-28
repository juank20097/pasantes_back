package ec.gob.iess.proyecto.componente.devsecops.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.gob.iess.proyecto.componente.devsecops.entidad.DepartamentoEmpleado;
import ec.gob.iess.proyecto.componente.devsecops.servicio.DepartamentoEmpleadoServicio;

@RestController
@RequestMapping("/departamentoEmpleado")
public class DepartamentoEmpleadoController {

	
	
	@Autowired
	private DepartamentoEmpleadoServicio departamentoEmpleadoService;
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public List<DepartamentoEmpleado> listarTodos(){
		return departamentoEmpleadoService.listarTodos();
	}
	
	
	@PostMapping
	public DepartamentoEmpleado insert(@RequestBody DepartamentoEmpleado depaEmpleado) {
		return departamentoEmpleadoService.insertUpdate(depaEmpleado);
	}
	
	
}
