package ec.gob.iess.proyecto.componente.devsecops.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Empleado;
import ec.gob.iess.proyecto.componente.devsecops.repositorio.EmpleadoRepositorio;

// TODO: Auto-generated Javadoc
/**
 * La Clase EmpleadoServicio.
 * Servicio que proporciona métodos crear, insertar, actualizar y eliminar un empleado
 * Este servicio utiliza la anotación @Service para ser un componente administrado por Spring.
 */
@Service
public class EmpleadoServicio {

	
	/** Inyecta un repositorio EmpleadoRepositorio para acceder a los datos de la entidad EMPLEADO. */
	@Autowired
	private EmpleadoRepositorio empleadoRepo;
	
	/**
	 * Crear un nuevo empleado.
	 *
	 * @param empleado - corresponde al objeto empleado que se desea crear.
	 * @return empleado - corresponde al objeto del empleado creado.
	 */
	public Empleado crear(Empleado empleado) {
		return empleadoRepo.save(empleado);
	}
	
	/**
	 * Actualizar un empleado.
	 *
	 * @param empleado - corresponde al objeto empleado que se desea actualizar
	 * @return empleado - corresponde al objeto empleado que se atualizó
	 */
	public Empleado actualizar (Empleado empleado) {
		return empleadoRepo.save(empleado);
	}
	
	/**
	 * Lista todos los empleados.
	 *
	 * @return lista - corresponde a una lista donde constan todos los empleados
	 */
	public List<Empleado> listarTodos() {
		return empleadoRepo.listarPorEstado();
	}
	
	/**
	 * Busca un empleado por medio de un id.
	 *
	 * @param id - corresponde al id del empleado que se desea buscar
	 * @return optional<empleado> - corresponde al empleado que se buscó por medio de un id 
	 * y retorna un false de tipo Booleano si no se encuentra un resultado
	 */
	public Optional<Empleado> listarPotId(Integer id) {
		return empleadoRepo.findById(id);
	}
	
	/**
	 * Elimina un empleado por medio de un id.
	 *
	 * @param id - corresponde al id del empleado que se desea eliminar
	 */
	public void EliminarPorId(Integer id) {
		empleadoRepo.deleteById(id);
	}
}
