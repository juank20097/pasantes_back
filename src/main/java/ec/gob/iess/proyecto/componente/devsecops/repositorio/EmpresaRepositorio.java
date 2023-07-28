package ec.gob.iess.proyecto.componente.devsecops.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Empresa;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface EmpresaRepositorio extends JpaRepository<Empresa, Integer>{
	
	
	 @Query("select a from Empresa a where a.estado = true")
	 List<Empresa> listarPorEstado();
	
}
