package ec.gob.iess.proyecto.componente.devsecops.entidad;

import java.sql.Timestamp;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

//Tabla Padre de Departament
@Entity
@Table(name = "EMPRESA")
@SequenceGenerator(name = "empresa_s", sequenceName = "empresa_s", allocationSize = 1)
public class Empresa{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_empr", length = 38, nullable = false)
	private Integer idEmpr;
	
	@Column(name = "creado_por ", length = 256, nullable = false)
	private String creadoPor;
	
	@Column(name = "fecha_creado", nullable = false)
	private Timestamp fechaCreado;
	
	@Column(name = "modificado_por", length = 256, nullable = false)
	private String modificadoPor;
	
	@Column(name = "fecha_modificado", nullable = false)
	private Timestamp fechaModificado;
	
	private Boolean estado;
	
	@Column(name = "direccion", length = 500 ,nullable = false)
	private String direccion;
	
	@Column(name = "telefono", length = 10, nullable = false)
	private String telefono;
	
	
//	@OneToMany(mappedBy = "empresa")
//	private Set<Departamento> departamentos;
	
	
	//SET and GET
	

	public Integer getIdEmpr() {
		return idEmpr;
	}

	public void setIdEmpr(Integer idEmpr) {
		this.idEmpr = idEmpr;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

//	public Set<Departamento> getDepartmentos() {
//		return departamentos;
//	}
//
//	public void setDepartmentos(Set<Departamento> departmentos) {
//		this.departamentos = departmentos;
//	}



}
