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

@Entity
@Table(name = "DEPARTAMENTO_EMPLEADO")
@SequenceGenerator(name = "departamento_empleado_s", sequenceName = "departamento_empleado_s", allocationSize = 1)
public class DepartamentoEmpleado{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "departamento_empleado_s")
	@Column(name = "id_depa_empl", length = 38, nullable = false)
	private Integer idDepEmpl;
	
	@Column(name = "creado_por", length = 256, nullable = false)
	private String creadoPor;
	
	@Column(name="fecha_creado", nullable = false)
	private Timestamp fechaCreado;
	
	@Column(name = "modificado_por", length = 256, nullable = false)
	private String modificadoPor;
	
	@Column(name = "fecha_modificado", nullable = false)
	private Timestamp fechaModificado;
	
	private Boolean estado;
	
	@ManyToOne
	@JoinColumn(name = "id_empl")
	private Empleado idEmple;
	
	@ManyToOne
	@JoinColumn(name = "id_dep")
	private Departamento idDepart;
	
	
//		SET AND GET

	public Integer getIdDepEmpl() {
		return idDepEmpl;
	}

	public void setIdDepEmpl(Integer idDepEmpl) {
		this.idDepEmpl = idDepEmpl;
	}

	public String getCreadoPor() {
		return creadoPor;
	}

	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}

	public Timestamp getFechaCreado() {
		return fechaCreado;
	}

	public void setFechaCreado(Timestamp fechaCreado) {
		this.fechaCreado = fechaCreado;
	}

	public String getModificadoPor() {
		return modificadoPor;
	}

	public void setModificadoPor(String modificadoPor) {
		this.modificadoPor = modificadoPor;
	}

	public Timestamp getFechaModificado() {
		return fechaModificado;
	}

	public void setFechaModificado(Timestamp fechaModificado) {
		this.fechaModificado = fechaModificado;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Empleado getIdEmple() {
		return idEmple;
	}

	public void setIdEmple(Empleado idEmple) {
		this.idEmple = idEmple;
	}

	public Departamento getIdDepart() {
		return idDepart;
	}

	public void setIdDepart(Departamento idDepart) {
		this.idDepart = idDepart;
	}
	
	
}
