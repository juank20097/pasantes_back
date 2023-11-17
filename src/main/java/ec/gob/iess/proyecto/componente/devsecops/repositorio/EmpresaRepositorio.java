/* 
 * Copyright 2011 INSTITUTO ECUATORIANO DE SEGURIDAD SOCIAL - ECUADOR. 
 * Todos los derechos reservados. 
 */

package ec.gob.iess.proyecto.componente.devsecops.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Empresa;
import jakarta.transaction.Transactional;

// TODO: Auto-generated Javadoc
/**
 * <b>
 * Acceso a datos de la entidad [EMPRESA].
 * La clase EmpresaRepositorio proporciona métodos para realizar operaciones de acceso a datos en la tabla de EMPRESA.
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
public interface EmpresaRepositorio extends JpaRepository<Empresa, Integer>{
	
	
	 /**
	 *<p><b>
 	 * Lista todas las empresa con estado activo.
 	 *</b></p>
 	 *
 	 *<p>[Author: andres.benavides, Date: 2023/08/22] </p>
 	 *
 	 * @return the list
 	 */
 	@Query("select a from Empresa a where a.estado = true")
	 List<Empresa> listarPorEstado();
	
}
