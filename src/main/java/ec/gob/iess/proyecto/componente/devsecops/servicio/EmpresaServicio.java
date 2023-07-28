package ec.gob.iess.proyecto.componente.devsecops.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Empresa;
import ec.gob.iess.proyecto.componente.devsecops.repositorio.EmpresaRepositorio;

@Service
public class EmpresaServicio {
	
	@Autowired
	private EmpresaRepositorio empresaRepo;
	
	
	public Empresa crear(Empresa empresa) {
		return empresaRepo.save(empresa);
	}
	
	public Empresa actualizar(Empresa empresa) {
		return empresaRepo.save(empresa);
	}
	
	public List<Empresa> listarTodos() {
		return empresaRepo.listarPorEstado();
	}
	
	public Optional <Empresa> listarPorId(int id) {
		return empresaRepo.findById(id);
	}

}
