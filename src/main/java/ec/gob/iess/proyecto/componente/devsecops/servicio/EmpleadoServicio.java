/* 
 * Copyright 2011 INSTITUTO ECUATORIANO DE SEGURIDAD SOCIAL - ECUADOR. 
 * Todos los derechos reservados. 
 */

package ec.gob.iess.proyecto.componente.devsecops.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Empleado;
import ec.gob.iess.proyecto.componente.devsecops.repositorio.EmpleadoRepositorio;

// TODO: Auto-generated Javadoc
/**
 * <b>
 * Proporciona accesos a los metodos de la Interface EmpleadoRepositorio.
 * </b>
 * 
 * @author andres.benavides
 * @version $Revision: 1.0
 *          <p>
 *          $[Author: andres.benavides $, $Date: 2024/08/23 $]
 *          </p>
 */

@Service
public class EmpleadoServicio {

	/**
	 * Inyecta un repositorio EmpleadoRepositorio para acceder a los datos de la
	 * entidad EMPLEADO.
	 */
	@Autowired
	private EmpleadoRepositorio empleadoRepo;
	
	
	/**
	 * <p>
	 * <b> Llama al método listarPorEstado de la interface EmpleadoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @return corresponde a la lista de todos los empleados con estado activo
	 */
	public List<Empleado> listarTodos() {
		return empleadoRepo.listarPorEstado();
	}
	
	
	/**
	 * <p>
	 * <b>Llama al método save de la interface EmpleadoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param empleado - corresponde a un objeto con los datos del empleado que se
	 *                 desea crear
	 * @return corresponde a un objeto con los datos del empleado que se creó
	 */
	public Empleado crear(Empleado empleado) {
		return empleadoRepo.save(empleado);
	}

	/**
	 * <p>
	 * <b>Llama al método save de la interface EmpleadoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param empleado - corresponde al objeto con los datos del empleado que se
	 *                 desea actualizar
	 * @return corresponde al objeto con los datos del empleado que se actualizó
	 */
	public Empleado actualizar(Empleado empleado) {
		return empleadoRepo.save(empleado);
	}



	/**
	 * <p>
	 * <b> Llama al método findById de la interface EmpleadoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador de la empleado que se desea
	 *                buscar
	 * @return corresponde al objeto con los datos de la empleado que se actualizó
	 *         manejando una posible devolución de un objeto nulo mediante el Optional
	 */
	public Optional<Empleado> listarPotId(Integer id) {
		return empleadoRepo.findById(id);
	}

	/**
	 * <p>
	 * <b> Llama al método deleteById de la interface EmpleadoRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador de la empleado que se desea eliminar
	 */
	
	public void EliminarPorId(Integer id) {
		empleadoRepo.deleteById(id);
	}
}
