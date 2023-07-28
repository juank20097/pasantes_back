package ec.gob.iess.proyecto.componente.devsecops.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ec.gob.iess.proyecto.componente.devsecops.entidad.DepartamentoEmpleado;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface DepartamentoEmpleadoRepositorio extends JpaRepository<DepartamentoEmpleado, Integer> {

	@Query("select a from DepartamentoEmpleado a where a.estado = true")
	List<DepartamentoEmpleado> listarPorEstado();

//	@Query("select a from DepartamentoEmpleado a where a.idDepart.idDep = ?1")
//	List<DepartamentoEmpleado> listarPorDepartamentos(int id);
//
//	@Query("select a from DepartamentoEmpleado a where a.idEmple.idEmpl = ?1")
//	List<DepartamentoEmpleado> listarPorEmpleados(int id);

}
