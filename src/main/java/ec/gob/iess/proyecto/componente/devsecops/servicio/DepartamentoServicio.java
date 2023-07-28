package ec.gob.iess.proyecto.componente.devsecops.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Departamento;
import ec.gob.iess.proyecto.componente.devsecops.repositorio.DepartamentoRepositorio;

@Service
public class DepartamentoServicio {

	@Autowired
	private DepartamentoRepositorio departamentoRepo;
	
	public Departamento insertUpdate(Departamento departamento) {
		return departamentoRepo.save(departamento);
	}
	
	public List<Departamento> listarTodos() {
		return departamentoRepo.listarPorEstado();
	}
	
	public Optional<Departamento> getId(Integer id) {
		return departamentoRepo.findById(id);
	}
}
