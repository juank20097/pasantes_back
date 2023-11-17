/* 
 * Copyright 2011 INSTITUTO ECUATORIANO DE SEGURIDAD SOCIAL - ECUADOR. 
 * Todos los derechos reservados. 
 */

package ec.gob.iess.proyecto.componente.devsecops.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ec.gob.iess.proyecto.componente.devsecops.entidad.DepartamentoEmpleado;
import jakarta.transaction.Transactional;

// TODO: Auto-generated Javadoc
/**
 * 
 * <b>
 * Acceso a datos de la entidad [DEPARTAMENTOEMPLEADO].
 * proporciona métodos para realizar operaciones de acceso a datos en la tabla de DEPARTAMENTO.
 * Utiliza Spring Data JPA para la implementación de las consultas y JpaRepository para implementar metodos basicos CRUD.
 * </b>
 * 
 * @author andres.benavides
 * @version $Revision: 1.0
 *          <p>
 *          $[Author: andres.benavides $, $Date: 2024/08/23 $]
 *          </p>
 */
@Repository
@Transactional
public interface DepartamentoEmpleadoRepositorio extends JpaRepository<DepartamentoEmpleado, Integer> {

	/**
	 * <p>
	 * <b> Lista todos las relaciones con estado activo entre departamentos y
	 * empleados. </b>
	 * </p>
	 *
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 *
	 * @return corresponde a una lista donde constan las relaciones con estado
	 *         activo entre departamentos y empleados.
	 */
	@Query("select a from DepartamentoEmpleado a where a.estado = true")
	List<DepartamentoEmpleado> listarPorEstado();

	/**
	 * <p>
	 * <b> Lista las relaciones que un departamento tiene con una empleado mediante
	 * un id </b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 *
	 * @param id corresponde al identificador de la relación entre departamento y
	 *           empleado
	 * @return lista de la relacion de departamentos y empleado que cumplen con un
	 *         id
	 */
	@Query("select a from DepartamentoEmpleado a where a.idDepart.idDepa = ?1")
	List<DepartamentoEmpleado> listarDepartamentos(Integer id);

	/**
	 * <p>
	 * <b> Lista las relaciones que un empleado tiene con un departamento mediante
	 * un id </b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 *
	 * @param id corresponde al identificador del empleado
	 * @return lista de la relacion que un empleado especificado por el id tiene con
	 *         departamento
	 */
	@Query("select a from DepartamentoEmpleado a where a.idEmple.idEmpl = ?1")
	List<DepartamentoEmpleado> listarEmpleados(Integer id);

}
