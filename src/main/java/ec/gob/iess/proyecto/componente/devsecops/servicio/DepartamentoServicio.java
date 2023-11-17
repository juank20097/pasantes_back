/* 
 * Copyright 2011 INSTITUTO ECUATORIANO DE SEGURIDAD SOCIAL - ECUADOR. 
 * Todos los derechos reservados. 
 */

package ec.gob.iess.proyecto.componente.devsecops.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Departamento;
import ec.gob.iess.proyecto.componente.devsecops.repositorio.DepartamentoRepositorio;

// TODO: Auto-generated Javadoc
/**
 * <b>
 * Proporciona accesos a los metodos de la Interface DepartamentoRepositorio.
 * </b>
 * 
 * @author andres.benavides
 * @version $Revision: 1.0
 *          <p>
 *          $[Author: andres.benavides $, $Date: 2024/08/23 $]
 *          </p>
 */
@Service
public class DepartamentoServicio {

	/**
	 * Inyecta un repositorio DepartamentoRepositorio para acceder a los datos de la
	 * entidad DEPARTAMENTO.
	 */
	@Autowired
	private DepartamentoRepositorio departamentoRepo;

	/**
	 * <p>
	 * <b>Llama al método save de la interface DepartamentoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param departamento - corresponde a un objeto con los datos del departamento
	 *                     que se desea crear
	 * @return corresponde a un objeto con los datos del departamento que se creó
	 */
	public Departamento crear(Departamento departamento) {
		return departamentoRepo.save(departamento);
	}

	/**
	 * <p>
	 * <b>Llama al método save de la interface DepartamentoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param departamento - corresponde al objeto con los datos del departamento
	 *                     que se desea actualizar
	 * @return corresponde al objeto con los datos del departamento que se actualizó
	 */
	public Departamento actualizar(Departamento departamento) {
		return departamentoRepo.save(departamento);
	}

	/**
	 * <p>
	 * <b> Llama al método listarPorEstado de la interface
	 * DepartamentoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @return corresponde a la lista de todos los departamentos con estado activo
	 */
	public List<Departamento> listarTodos() {
		return departamentoRepo.listarPorEstado();
	}

	/**
	 * <p>
	 * <b> Llama al método findById de la interface DepartamentoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador del departamento que se desea
	 *                buscar
	 * @return corresponde al objeto con los datos del departamento que se actualizó
	 *         manejando la devolución de un objeto nulo mediante el Optional
	 */
	public Optional<Departamento> listarPotId(Integer id) {
		return departamentoRepo.findById(id);
	}

	/**
	 * <p>
	 * <b> Llama al método deleteById de la interface DepartamentoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador del departamento que se desea
	 *           eliminar
	 */
	public void EliminarPorId(Integer id) {
		departamentoRepo.deleteById(id);
	}
}
