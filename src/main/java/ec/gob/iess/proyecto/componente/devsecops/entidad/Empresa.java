package ec.gob.iess.proyecto.componente.devsecops.entidad;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;



// TODO: Auto-generated Javadoc
/**
 * Mapeo de la tabla [EMPRESA].
 */
@Entity
@Table(name = "EMPRESA")
@SequenceGenerator(name = "empresa_s", sequenceName = "empresa_s", allocationSize = 1)
public class Empresa{
	
	
	/** PK de la entidad [EMPRESA]. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_empr", length = 38, nullable = false)
	private Integer idEmpr;
	
	/** The creado por. */
	@Column(name = "creado_por ", length = 256, nullable = false)
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
	
	/** The direccion. */
	@Column(name = "direccion", length = 500 ,nullable = false)
	private String direccion;
	
	
	/** The telefono. */
	@Column(name = "telefono", length = 10, nullable = false)
	private String telefono;
	
	
	
//	@OneToMany(mappedBy = "empresa")
//	private Set<Departamento> departamentos;
	
	
	//SET and GET
	

	/**
 * Gets the id empr.
 *
 * @return the id empr
 */
public Integer getIdEmpr() {
		return idEmpr;
	}

	/**
	 * Sets the id empr.
	 *
	 * @param idEmpr the new id empr
	 */
	public void setIdEmpr(Integer idEmpr) {
		this.idEmpr = idEmpr;
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
	 * Gets the direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Sets the direccion.
	 *
	 * @param direccion the new direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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


	





}
