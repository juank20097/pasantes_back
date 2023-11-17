/* 
 * Copyright 2011 INSTITUTO ECUATORIANO DE SEGURIDAD SOCIAL - ECUADOR. 
 * Todos los derechos reservados. 
 */

package ec.gob.iess.proyecto.componente.devsecops.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Empleado;
import jakarta.transaction.Transactional;

// TODO: Auto-generated Javadoc
/**
 * <b> Acceso a datos de la entidad [EMPLEADO]. La clase EmpleadoRepositorio
 * proporciona métodos para realizar operaciones de acceso a datos en la tabla
 * de EMPLEADO. Utiliza Spring Data JPA para la implementación de las consultas y JpaRepository para implementar metodos basicos CRUD
 * </b>
 * 
 * @author andres.benavides
 * @version $Revision: 1.0
 *          <p>
 *          $[Author: andres.benavides $, $Date: 2024/08/23 $]
 *          </p>
 * 
 */
@Repository
@Transactional
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {

	/**
	 * <p>
	 * <b> Lista todos los empleados con estado activo.. </b>
	 * </p>
	 *
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 *
	 * @return lista - corresponde a una lista donde constan los empleados en estado
	 *         activo.
	 */
	@Query("select a from Empleado a where a.estado = true")
	List<Empleado> listarPorEstado();
}
