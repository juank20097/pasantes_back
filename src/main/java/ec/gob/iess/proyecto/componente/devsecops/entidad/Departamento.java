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

//tabla hijo de enterprise
//tabla padre de tabla depa_empl
@Entity
@Table(name = "DEPARTAMENTO")
@SequenceGenerator(name = "departamento_s", sequenceName = "departamento_s", allocationSize = 1)
public class Departamento{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_dep", length = 38, nullable = false)
	
	private Integer idDepa;
	
	@Column(name = "creado_por", length = 256, nullable = false)
	private String creadoPor;
	
	@Column(name = "fecha_creado", nullable = false)
	private Timestamp fechaCreado;
	
	@Column(name = "modificado_por", length = 256, nullable = false)
	private String modificadoPor;
	
	@Column(name = "fecha_modificado", nullable = false)
	private Timestamp fechaModificado;
	
	private Boolean estado;
	
	@Column(name = "descripcion", length = 500, nullable = false)
	private String descripcion;
	
	@Column(name = "nombre", length = 256, nullable = false)
	private String nombre;
	
	@Column(name = "telefono", length = 10, nullable = false)
	private String telefono;
	
	
	@ManyToOne
	@JoinColumn(name = "id_empresa")
	private Empresa empresa;
	
	
//	@OneToMany(mappedBy = "idDepart")
//	private Set<DepartamentoEmpleado> departmentEmploye;
	

	//	SET AND GET
	
	public Integer getIdDepa() {
		return idDepa;
	}

	public void setIdDepa(Integer idDepa) {
		this.idDepa = idDepa;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

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






















