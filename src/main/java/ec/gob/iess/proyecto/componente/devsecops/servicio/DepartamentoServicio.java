package ec.gob.iess.proyecto.componente.devsecops.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Departamento;
import ec.gob.iess.proyecto.componente.devsecops.repositorio.DepartamentoRepositorio;

// TODO: Auto-generated Javadoc
/**
 * La Clase DepartamentoServicio.
 * Servicio que proporciona métodos crear, insertar, actualizar y eliminar un departamento
 * Este servicio utiliza la anotación @Service para ser un componente administrado por Spring.
  */
@Service
public class DepartamentoServicio {

	/** Inyecta un repositorio DepartamentoRepositorio para acceder a los datos de la entidad DEPARTAMENTO. */
	@Autowired
	private DepartamentoRepositorio departamentoRepo;
	
	/**
	 * Crear o actualiza un nuevo departamento.
	 *
	 * @param departamento - corresponde al objeto departamento que se desea crear o actualizar.
	 * @return departamento - corresponde al objeto del departamento creado.
	 */
	public Departamento crear(Departamento departamento) {
		return departamentoRepo.save(departamento);
	}
	
	/**
	 * Actualizar un departamento.
	 *
	 * @param departamento - corresponde al objeto departamento que se desea actualizar
	 * @return departamento - corresponde al objeto departamento que se atualizó
	 */
	public Departamento actualizar(Departamento departamento) {
		return departamentoRepo.save(departamento);
	}
	
	/**
	 * Lista todos los departamentos.
	 *
	 * @return lista - corresponde a una lista donde constan todos los departamentos
	 */
	public List<Departamento> listarTodos() {
		return departamentoRepo.listarPorEstado();
	}
	
	/**
	 * Busca un departamento por medio de un id.
	 *
	 * @param id - corresponde al id del departamento que se desea buscar
	 * @return optional<departamento> - corresponde al departamento que se buscó por medio de un id 
	 * y retorna un false de tipo Booleano si no se encuentra un resultado
	 */
	public Optional<Departamento> getId(Integer id) {
		return departamentoRepo.findById(id);
	}
	
	/**
	 * Elimina un departamento por medio de un id.
	 *
	 * @param id - corresponde al id del departamento que se desea eliminar
	 */
	public void EliminarPorId(Integer id) {
		departamentoRepo.deleteById(id);
	}
}
