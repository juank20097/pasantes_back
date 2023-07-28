package ec.gob.iess.proyecto.componente.devsecops.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.iess.proyecto.componente.devsecops.entidad.DepartamentoEmpleado;
import ec.gob.iess.proyecto.componente.devsecops.repositorio.DepartamentoEmpleadoRepositorio;

@Service
public class DepartamentoEmpleadoServicio {

	@Autowired
	private DepartamentoEmpleadoRepositorio departamentoEmpleadoRepo;
	
	public DepartamentoEmpleado insertUpdate(DepartamentoEmpleado deparEmpl) {
		return departamentoEmpleadoRepo.save(deparEmpl);
	}
	
	public List<DepartamentoEmpleado> listarTodos() {
		return departamentoEmpleadoRepo.listarPorEstado();
	}
	
	public Optional<DepartamentoEmpleado> listarPorId(int id) {
		return departamentoEmpleadoRepo.findById(id);
	}
	
//	public List<DepartamentoEmpleado> listarPorDepartamentos(int id) {
//		return departamentoEmpleadoRepo.listarPorDepartamentos(id);
//	}
//	
//	public List<DepartamentoEmpleado> listarPorEmpleados(int id) {
//		return departamentoEmpleadoRepo.listarPorEmpleados(id);
//	}
}
