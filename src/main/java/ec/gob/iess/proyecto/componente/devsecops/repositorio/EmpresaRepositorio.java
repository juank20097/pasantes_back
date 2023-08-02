package ec.gob.iess.proyecto.componente.devsecops.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Empresa;
import jakarta.transaction.Transactional;

// TODO: Auto-generated Javadoc
/**
 * Acceso a datos de la entidad [EMPRESA].
 * La clase EmpresaRepositorio proporciona métodos para realizar operaciones de acceso a datos en la tabla de EMPRESA.
 * Utiliza Spring Data JPA para la implementación de las consultas.
 */
@Repository
@Transactional
public interface EmpresaRepositorio extends JpaRepository<Empresa, Integer>{
	
	
	 /**
 	 * Listar por estado.
 	 *
 	 * @return the list
 	 */
 	@Query("select a from Empresa a where a.estado = true")
	 List<Empresa> listarPorEstado();
	
}
