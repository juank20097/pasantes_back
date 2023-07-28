package ec.gob.iess.proyecto.componente.devsecops.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Empleado;
import ec.gob.iess.proyecto.componente.devsecops.repositorio.EmpleadoRepositorio;

@Service
public class EmpleadoServicio {

	
	@Autowired
	private EmpleadoRepositorio empleadoRepo;
	
	public Empleado crear(Empleado empleado) {
		return empleadoRepo.save(empleado);
	}
	
	public Empleado actualizar (Empleado empleado) {
		return empleadoRepo.save(empleado);
	}
	
	public List<Empleado> listarTodos() {
		return empleadoRepo.listarPorEstado();
	}
	
	public Optional<Empleado> listarPotId(int id) {
		return empleadoRepo.findById(id);
	}
}
