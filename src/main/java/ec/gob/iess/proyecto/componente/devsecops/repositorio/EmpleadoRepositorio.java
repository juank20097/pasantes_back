package ec.gob.iess.proyecto.componente.devsecops.repositorio;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Empleado;
import jakarta.transaction.Transactional;


// TODO: Auto-generated Javadoc
/**
 * Acceso a datos de la entidad [EMPLEADO].
 * La clase EmpleadoRepositorio proporciona métodos para realizar 
 * operaciones de acceso a datos en la tabla de EMPLEADO.
 * Utiliza Spring Data JPA para la implementación de las consultas.
 */
@Repository
@Transactional
public interface EmpleadoRepositorio  extends JpaRepository<Empleado, Integer>{

	

	 /**
 	 * Lista todos los empleados en estado activo, es decir estado igual a true.
 	 *
 	 * @return lista - corresponde a una lista donde constan los empleados en estado activo
 	 * o estado igual a true.
 	 */
 	@Query("select a from Empleado a where a.estado = true")
	 List<Empleado> listarPorEstado();
}
	