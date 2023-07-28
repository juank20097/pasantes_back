package ec.gob.iess.proyecto.componente.devsecops.repositorio;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Empleado;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public interface EmpleadoRepositorio  extends JpaRepository<Empleado, Integer>{

	

	 @Query("select a from Empleado a where a.estado = true")
	 List<Empleado> listarPorEstado();
}
	