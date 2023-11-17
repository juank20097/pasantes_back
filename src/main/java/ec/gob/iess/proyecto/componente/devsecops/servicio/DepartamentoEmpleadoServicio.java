/* 
 * Copyright 2011 INSTITUTO ECUATORIANO DE SEGURIDAD SOCIAL - ECUADOR. 
 * Todos los derechos reservados. 
 */

package ec.gob.iess.proyecto.componente.devsecops.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.iess.proyecto.componente.devsecops.entidad.DepartamentoEmpleado;
import ec.gob.iess.proyecto.componente.devsecops.repositorio.DepartamentoEmpleadoRepositorio;

// TODO: Auto-generated Javadoc
/**
 * <b>
 * Proporciona accesos a los metodos de la Interface DepartamentoEmpleadoRepositorio.
 * </b>
 * 
 * @author andres.benavides
 * @version $Revision: 1.0
 *          <p>
 *          $[Author: andres.benavides $, $Date: 2024/08/23 $]
 *          </p>
 */
@Service
public class DepartamentoEmpleadoServicio{

	/** Inyecta un repositorio DepartamentoEmpleadoRepositorio para acceder a los datos de la entidad DEPARTAMENTO_EMPLEADO. */
	@Autowired
	private DepartamentoEmpleadoRepositorio departamentoEmpleadoRepo;
	
	
	
	/**
	 * <p>
	 * <b>Llama al método save de la interface DepartamentoEmpleadoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param departEmpleado - corresponde a un objeto con los datos de DepartamentoEmpleado que se
	 *                desea crear
	 * @return corresponde a un objeto con los datos de DepartamentoEmpleado que se creó
	 *         
	 */
	public DepartamentoEmpleado crear(DepartamentoEmpleado departEmpleado) {
		return departamentoEmpleadoRepo.save(departEmpleado);
	}
	
	/**
	 * <p>
	 * <b>Llama al método save de la interface DepartamentoEmpleadoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param departEmpleado - corresponde al objeto con los datos de DepartamentoEmpleado que se
	 *                 desea actualizar
	 * @return corresponde al objeto con los datos de DepartamentoEmpleado que se actualizó
	 */
	public DepartamentoEmpleado actualizar (DepartamentoEmpleado departEmpleado) {
		return departamentoEmpleadoRepo.save(departEmpleado);
	}
	
	
	/**
	 * <p>
	 * <b> Llama al método listarPorEstado de la interface DepartamentoEmpleadoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @return corresponde a la lista de todos los DepartamentoEmpleado con estado activo
	 */
	public List<DepartamentoEmpleado> listarTodos() {
		return departamentoEmpleadoRepo.listarPorEstado();
	}
	
	/**
	 * <p>
	 * <b> Llama al método findById de la interface DepartamentoEmpleadoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador de DepartamentoEmpleado que se desea
	 *                buscar
	 * @return corresponde al objeto con los datos de DepartamentoEmpleado que se buscó
	 *         manejando la devolución de un objeto nulo mediante el Optional
	 */
	public Optional<DepartamentoEmpleado> listarPorId(Integer id) {
		return departamentoEmpleadoRepo.findById(id);
	}
	
	/**
	 * <p>
	 * <b> Llama al método deleteById de la interface DepartamentoEmpleadoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador del DepartamentoEmpleado que se desea eliminar
	 */
	public void EliminarPorId(Integer id) {
		departamentoEmpleadoRepo.deleteById(id);
	}
	

	
	/**
	 * <p>
	 * <b> Llama al método listarDepartamentos de la interface DepartamentoEmpleadoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador de departamento que se desea buscar
	 *               
	 * @return corresponde a la lista con los datos de DepartamentoEmpleado relacionado al id de departamento 
	 */
	public List<DepartamentoEmpleado> listarDepartamentos(Integer id){
		
		return  departamentoEmpleadoRepo.listarDepartamentos(id);
	}
	
	/**
	 * <p>
	 * <b> Llama al método listarDepartamentos de la interface DepartamentoEmpleadoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador de empleado que se desea buscar
	 *                
	 * @return corresponde a la lista con los datos de DepartamentoEmpleado relacionado al id de empleado
	 */
	public List<DepartamentoEmpleado> listarEmpleados(Integer id){	
		return departamentoEmpleadoRepo.listarEmpleados(id);
			
	}

	
	
	
}
