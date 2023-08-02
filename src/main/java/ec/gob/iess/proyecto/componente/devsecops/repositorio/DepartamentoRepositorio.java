package ec.gob.iess.proyecto.componente.devsecops.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Departamento;
import jakarta.transaction.Transactional;

// TODO: Auto-generated Javadoc
/**
 * Acceso a datos de la entidad [DEPARTAMENTO].
 */
@Repository
@Transactional
public interface DepartamentoRepositorio extends JpaRepository<Departamento, Integer> {

	/**
	 * Listar por estado.
	 *
	 * @return the list
	 */
	@Query("select a from Departamento a where a.estado = true")
	List<Departamento> listarPorEstado();

}
