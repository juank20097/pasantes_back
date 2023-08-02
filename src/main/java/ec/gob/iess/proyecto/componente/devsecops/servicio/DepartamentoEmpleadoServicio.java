package ec.gob.iess.proyecto.componente.devsecops.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Departamento;
import ec.gob.iess.proyecto.componente.devsecops.entidad.DepartamentoEmpleado;
import ec.gob.iess.proyecto.componente.devsecops.entidad.Empleado;
import ec.gob.iess.proyecto.componente.devsecops.repositorio.DepartamentoEmpleadoRepositorio;

// TODO: Auto-generated Javadoc
/**
 * La Clase DepartamentoEmpleadoServicio.
 * Servicio que proporciona métodos crear, insertar, actualizar y eliminar un departamentoEmpleado
 * Este servicio utiliza la anotación @Service para ser un componente administrado por Spring.
 */
@Service
public class DepartamentoEmpleadoServicio{

	/** Inyecta un repositorio DepartamentoEmpleadoRepositorio para acceder a los datos de la entidad DEPARTAMENTO_EMPLEADO. */
	@Autowired
	private DepartamentoEmpleadoRepositorio departamentoEmpleadoRepo;
	
	
	
	/**
	 * Crear un nuevo departamentoEmpleado.
	 *
	 * @param deparEmpl - corresponde al objeto departamentoEmpleado que se desea crear.
	 * @return deparEmpl - corresponde al objeto del departamentoEmpleado creado.
	 */
	public DepartamentoEmpleado crear(DepartamentoEmpleado deparEmpl) {
		return departamentoEmpleadoRepo.save(deparEmpl);
	}
	
	/**
	 * Actualizar un departamentoEmpleado.
	 *
	 * @param departEmpleado - corresponde al objeto departamentoEmpleado que se desea actualizar
	 * @return departEmpleado - corresponde al objeto departamentoEmpleado que se atualizó
	 */
	public DepartamentoEmpleado actualizar (DepartamentoEmpleado departEmpleado) {
		return departamentoEmpleadoRepo.save(departEmpleado);
	}
	
	/**
	 * Lista todos los departamentoEmpleado.
	 *
	 * @return lista - corresponde a una lista donde constan todos los departamentoEmpleado
	 */
	public List<DepartamentoEmpleado> listarTodos() {
		return departamentoEmpleadoRepo.listarPorEstado();
	}
	
	/**
	 * Busca un departamentoEmpleado por medio de un id.
	 *
	 * @param id - corresponde al id del departamentoEmpleado que se desea buscar
	 * @return optional<departamentoEmpleado> - corresponde al departamentoEmpleado que se buscó por medio de un id 
	 * y retorna un false de tipo Booleano si no se encuentra un resultado
	 */
	public Optional<DepartamentoEmpleado> listarPorId(Integer id) {
		return departamentoEmpleadoRepo.findById(id);
	}
	
	/**
	 * Elimina un departamentoEmpleado por medio de un id.
	 *
	 * @param id - corresponde al id del departamentoEmpleado que se desea eliminar
	 */
	public void EliminarPorId(Integer id) {
		departamentoEmpleadoRepo.deleteById(id);
	}
	

	
	/**
	 * Listar departamentos.
	 *
	 * @param id - corresponde al id de los departamentos que pertenecen a departamentoEmpleado
	 * @return list - corresponde al listado de departamentos que se buscó por medio del id
	 */
	public List<DepartamentoEmpleado> listarDepartamentos(Integer id){
		
		return  departamentoEmpleadoRepo.listarDepartamentos(id);
	}
	
	/**
	 * Listar empleados.
	 *
	 * @param id - corresponde al id de los departamentos que pertenecen a empleados
	 * @return list - corresponde al listado de empleados que se buscó por medio del id
	 */
	public List<DepartamentoEmpleado> listarEmpleados(Integer id){	
		return departamentoEmpleadoRepo.listarEmpleados(id);
			
	}

	
	
	
}
