/* 
 * Copyright 2011 INSTITUTO ECUATORIANO DE SEGURIDAD SOCIAL - ECUADOR. 
 * Todos los derechos reservados. 
 */

package ec.gob.iess.proyecto.componente.devsecops.servicio;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.iess.proyecto.componente.devsecops.entidad.Empresa;
import ec.gob.iess.proyecto.componente.devsecops.repositorio.EmpresaRepositorio;

// TODO: Auto-generated Javadoc
/**
 * <b>
 * Proporciona accesos a los metodos de la Interface EmpresaRepositorio.
 * </b>
 * 
 * @author andres.benavides
 * @version $Revision: 1.0
 *          <p>
 *          $[Author: andres.benavides $, $Date: 2024/08/23 $]
 *          </p>
 */
@Service
public class EmpresaServicio {

	/**
	 * Inyecta un repositorio EmpresaRepositorio para acceder a los datos de la
	 * entidad EMPRESA.
	 */
	@Autowired
	private EmpresaRepositorio empresaRepo;

	/**
	 * <p>
	 * <b>Llama al método save de la interface EmpresaRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param empresa - corresponde a un objeto con los datos de la empresa que se
	 *                desea crear
	 * @return corresponde a un objeto con los datos de la empresa que se creó
	 * 
	 */
	public Empresa crear(Empresa empresa) {
		
		Date data = new Date();
		Timestamp fechaActual = new Timestamp(data.getDate());
		empresa.setFechaCreado(fechaActual);
		return empresaRepo.save(empresa);
	}

	/**
	 * <p>
	 * <b>Llama al método save de la interface EmpresaRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param empresa - corresponde al objeto con los datos de la empresa que se
	 *                desea actualizar
	 * @return corresponde al objeto con los datos de la empresa que se actualizó
	 */
	public Empresa actualizar(Empresa empresa) {
		return empresaRepo.save(empresa);
	}

	/**
	 * <p>
	 * <b> Llama al método listarPorEstado de la interface EmpresaRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @return corresponde a la lista de todas las empresas con estado activo
	 */
	public List<Empresa> listarTodos() {
		return empresaRepo.listarPorEstado();
	}

	/**
	 * <p>
	 * <b> Llama al método findById de la interface EmpresaRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador de la empresa que se desea
	 *                buscar
	 * @return corresponde al objeto con los datos de la empresa que se actualizó
	 *         manejando la devolución de un objeto nulo mediante el Optional
	 */
	public Optional<Empresa> listarPorId(Integer id) {
		return empresaRepo.findById(id);
	}

	/**
	 * <p>
	 * <b> Llama al método deleteById de la interface EmpresaRepositorio</b>
	 * </p>
	 * 
	 * <p>
	 * [Author: andres.benavides, Date: 2023/08/22]
	 * </p>
	 * 
	 * @param id - corresponde al identificador de la empresa que se desea eliminar
	 */
	public void EliminarPorId(Integer id) {
		empresaRepo.deleteById(id);
	}
}
