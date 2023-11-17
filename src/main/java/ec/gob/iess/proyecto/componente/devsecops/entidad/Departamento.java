/* 
 * Copyright 2011 INSTITUTO ECUATORIANO DE SEGURIDAD SOCIAL - ECUADOR. 
 * Todos los derechos reservados. 
 */

package ec.gob.iess.proyecto.componente.devsecops.entidad;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

// TODO: Auto-generated Javadoc

/**
 * Mapeo de la tabla [DEPARTAMENTO].
 * @author andres.benavides
 * @version $Revision: 1.0 
 * 				<p>
 * 				$[Author: andres.benavides $, $Date: 2023/08/22$]
 *				</p>
 * 
 *  
 */

@Entity
@Table(name = "DEPARTAMENTO")
@SequenceGenerator(name = "departamento_s", sequenceName = "departamento_s", allocationSize = 1)

public class Departamento{
	
	/** PK de la entidad [DEPARTAMENTO].*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_dep", length = 38, nullable = false)
	
	private Integer idDepa;
	
	/** The creado por. */
	@Column(name = "creado_por", length = 256, nullable = false)
	private String creadoPor;
	
	/** The fecha creado. */
	@Column(name = "fecha_creado", nullable = false)
	private Timestamp fechaCreado;
	
	/** The modificado por. */
	@Column(name = "modificado_por", length = 256, nullable = false)
	private String modificadoPor;
	
	/** The fecha modificado. */
	@Column(name = "fecha_modificado", nullable = false)
	private Timestamp fechaModificado;
	
	/** The estado. */
	private Boolean estado;
	
	/** The descripcion. */
	@Column(name = "descripcion", length = 500, nullable = false)
	private String descripcion;
	
	/** The nombre. */
	@Column(name = "nombre", length = 256, nullable = false)
	private String nombre;
	
	/** The telefono. */
	@Column(name = "telefono", length = 10, nullable = false)
	private String telefono;
	
	
	/** The empresa. */
	@ManyToOne
	@JoinColumn(name = "id_empresa", nullable = false)
	private Empresa empresa;
	
	

	

	//	SET AND GET
	
	/**
	 * Gets the id depa.
	 *
	 * @return the id depa
	 */
	public Integer getIdDepa() {
		return idDepa;
	}

	/**
	 * Sets the id depa.
	 *
	 * @param idDepa the new id depa
	 */
	public void setIdDepa(Integer idDepa) {
		this.idDepa = idDepa;
	}

	/**
	 * Gets the creado por.
	 *
	 * @return the creado por
	 */
	public String getCreadoPor() {
		return creadoPor;
	}

	/**
	 * Sets the creado por.
	 *
	 * @param creadoPor the new creado por
	 */
	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}

	/**
	 * Gets the fecha creado.
	 *
	 * @return the fecha creado
	 */
	public Timestamp getFechaCreado() {
		return fechaCreado;
	}

	/**
	 * Sets the fecha creado.
	 *
	 * @param fechaCreado the new fecha creado
	 */
	public void setFechaCreado(Timestamp fechaCreado) {
		this.fechaCreado = fechaCreado;
	}

	/**
	 * Gets the modificado por.
	 *
	 * @return the modificado por
	 */
	public String getModificadoPor() {
		return modificadoPor;
	}

	/**
	 * Sets the modificado por.
	 *
	 * @param modificadoPor the new modificado por
	 */
	public void setModificadoPor(String modificadoPor) {
		this.modificadoPor = modificadoPor;
	}

	/**
	 * Gets the fecha modificado.
	 *
	 * @return the fecha modificado
	 */
	public Timestamp getFechaModificado() {
		return fechaModificado;
	}

	/**
	 * Sets the fecha modificado.
	 *
	 * @param fechaModificado the new fecha modificado
	 */
	public void setFechaModificado(Timestamp fechaModificado) {
		this.fechaModificado = fechaModificado;
	}

	/**
	 * Gets the estado.
	 *
	 * @return the estado
	 */
	public Boolean getEstado() {
		return estado;
	}

	/**
	 * Sets the estado.
	 *
	 * @param estado the new estado
	 */
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	/**
	 * Gets the descripcion.
	 *
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Sets the descripcion.
	 *
	 * @param descripcion the new descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the telefono.
	 *
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Sets the telefono.
	 *
	 * @param telefono the new telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Gets the empresa.
	 *
	 * @return the empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}

	/**
	 * Sets the empresa.
	 *
	 * @param empresa the new empresa
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

//	public Set<DepartamentoEmpleado> getDepartment_employe() {
//		return departmentEmploye;
//	}
//
//	public void setDepartmentEmploye(Set<DepartamentoEmpleado> department_employe) {
//		this.departmentEmploye = department_employe;
//	}

	

}






















