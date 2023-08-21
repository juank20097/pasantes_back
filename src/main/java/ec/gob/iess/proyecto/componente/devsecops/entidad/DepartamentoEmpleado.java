package ec.gob.iess.proyecto.componente.devsecops.entidad;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * Mapeo de la tabla [DEPARTAMENTO_EMPLEADO].
 */
@Entity
@Table(name = "DEPARTAMENTO_EMPLEADO", schema = "andres")
@SequenceGenerator(name = "departamento_empleado_s", sequenceName = "departamento_empleado_s", allocationSize = 1)
public class DepartamentoEmpleado{

	/** PK de la entidad [DEPARTAMENTO_EMPLEADO]. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "departamento_empleado_s")
	@Column(name = "id_depa_empl", length = 38, nullable = false)
	private Integer idDepEmpl;
	
	/** The creado por. */
	@Column(name = "creado_por", length = 256, nullable = false)
	private String creadoPor;
	
	/** The fecha creado. */
	@Column(name="fecha_creado", nullable = false)
	private Timestamp fechaCreado;
	
	/** The modificado por. */
	@Column(name = "modificado_por", length = 256, nullable = false)
	private String modificadoPor;
	
	/** The fecha modificado. */
	@Column(name = "fecha_modificado", nullable = false)
	private Timestamp fechaModificado;
	
	/** The estado. */
	private Boolean estado;
	
	/** The id emple. */
	@ManyToOne
	@JoinColumn(name = "id_empl")
	private Empleado idEmple;
	
	/** The id depart. */
	@ManyToOne
	@JoinColumn(name = "id_dep")
	private Departamento idDepart;
	
	
//		SET AND GET

	/**
 * Gets the id dep empl.
 *
 * @return the id dep empl
 */
public Integer getIdDepEmpl() {
		return idDepEmpl;
	}

	/**
	 * Sets the id dep empl.
	 *
	 * @param idDepEmpl the new id dep empl
	 */
	public void setIdDepEmpl(Integer idDepEmpl) {
		this.idDepEmpl = idDepEmpl;
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
	 * Gets the id emple.
	 *
	 * @return the id emple
	 */
	public Empleado getIdEmple() {
		return idEmple;
	}

	/**
	 * Sets the id emple.
	 *
	 * @param idEmple the new id emple
	 */
	public void setIdEmple(Empleado idEmple) {
		this.idEmple = idEmple;
	}

	/**
	 * Gets the id depart.
	 *
	 * @return the id depart
	 */
	public Departamento getIdDepart() {
		return idDepart;
	}

	/**
	 * Sets the id depart.
	 *
	 * @param idDepart the new id depart
	 */
	public void setIdDepart(Departamento idDepart) {
		this.idDepart = idDepart;
	}
	
	
}
