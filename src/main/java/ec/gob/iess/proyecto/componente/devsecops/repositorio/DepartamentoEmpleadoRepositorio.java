package ec.gob.iess.proyecto.componente.devsecops.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Departamento;
import ec.gob.iess.proyecto.componente.devsecops.entidad.DepartamentoEmpleado;
import ec.gob.iess.proyecto.componente.devsecops.entidad.Empleado;
import jakarta.transaction.Transactional;


// TODO: Auto-generated Javadoc
/**
 * Acceso a datos de la entidad [DEPARTAMENTO_EMPLEADO].
 */
@Repository
@Transactional
public interface DepartamentoEmpleadoRepositorio extends JpaRepository<DepartamentoEmpleado, Integer> {

	/**
	 * Listar por estado.
	 *
	 * @return the list
	 */
	@Query("select a from DepartamentoEmpleado a where a.estado = true")
	List<DepartamentoEmpleado> listarPorEstado();

	/**
	 * Listar departamentos.
	 *
	 * @param id the id
	 * @return the list
	 */
	@Query("select a from DepartamentoEmpleado a where a.idDepart.idDepa = ?1")
	List<DepartamentoEmpleado> listarDepartamentos(Integer id);

	/**
	 * Listar empleados.
	 *
	 * @param id the id
	 * @return the list
	 */
	@Query("select a from DepartamentoEmpleado a where a.idEmple.idEmpl = ?1")
	List<DepartamentoEmpleado> listarEmpleados(Integer id);

}
