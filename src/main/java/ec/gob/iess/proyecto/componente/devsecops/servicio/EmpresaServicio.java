package ec.gob.iess.proyecto.componente.devsecops.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Empresa;
import ec.gob.iess.proyecto.componente.devsecops.repositorio.EmpresaRepositorio;

// TODO: Auto-generated Javadoc
/**
 * La Clase EmpresaServicio.
 * Servicio que proporciona métodos crear, insertar, actualizar y eliminar una empresa
 * Este servicio utiliza la anotación @Service para ser un componente administrado por Spring.
 */
@Service
public class EmpresaServicio {
	
	/** Inyecta un repositorio EmpresaRepositorio para acceder a los datos de la entidad EMPRESA. */
	@Autowired
	private EmpresaRepositorio empresaRepo;
	
	
	/**
	 * Crear una nueva empresa.
	 *
	 * @param empresa - corresponde al objeto empresa que se desea crear
	 * @return empresa - corresponde al objeto de la empresa creada
	 */
	public Empresa crear(Empresa empresa) {
		return empresaRepo.save(empresa);
	}
	
	/**
	 * Actualizar una empresa.
	 *
	 * @param empresa - corresponde al objeto empresa que se desea actualizar
	 * @return empresa - corresponde al objeto empresa que se atualizó
	 */
	public Empresa actualizar(Empresa empresa) {
		return empresaRepo.save(empresa);
	}
	
	/**
	 * Lista todas las empresas.
	 *
	 * @return lista - corresponde a una lista donde constan todas las empresas
	 */
	public List<Empresa> listarTodos() {
		return empresaRepo.listarPorEstado();
	}
	
	/**
	 * Busca una empresa por medio de un id.
	 *
	 * @param id - corresponde al id de la empresa que se desea buscar
	 * @return optional<Empresa> - corresponde a la empresa que se buscó por medio de un id 
	 * y retorna un false de tipo Booleano si no se encuentra un resultado
	 */
	public Optional <Empresa> listarPorId(Integer id) {
		return empresaRepo.findById(id);
	}
	
	/**
	 * Elimina una empresa por medio de un id.
	 *
	 * @param id - corresponde al id de la empresa que se desea eliminar
	 */
	public void EliminarPorId(Integer id) {
		empresaRepo.deleteById(id);
	}

}
