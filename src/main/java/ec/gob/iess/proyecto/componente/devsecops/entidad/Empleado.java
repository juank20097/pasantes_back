package ec.gob.iess.proyecto.componente.devsecops.entidad;

import java.sql.Timestamp;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


// tabla padre de tabla depa_empl
@Entity
@Table(name = "EMPLEADO")
@SequenceGenerator(name = "empleado_s", sequenceName = "empleado_s", allocationSize = 1)

public class Empleado {
	
	@Id
	@Column(name = "id_empl")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empleado_s")
	private Integer idEmpl;
	
	@Column(name = "creado_por", length = 256, nullable = false)
	private String creadoPor;
	
	@Column(name = "fecha_creado", nullable = false)
	private Timestamp fechaCreado;
	
	@Column(name = "modificado_por", length = 256, nullable = false)
	private String modificadoPor;
	
	@Column(name = "fecha_modificado" , nullable = false)
	private Timestamp fechaModificado;
	
	
	private Boolean estado;
	
	@Column(name = "edad", length = 3, nullable = false)
	private Integer edad;
	
	@Column(name = "correo", length = 256, nullable = false)
	private String correo;
	
	@Column(name = "nombre", length = 256, nullable = false)
	private String nombre;
	
	@Column(name = "posicion", length = 256, nullable = false)
	private String posicion;
	
	@Column(name = "apellido", length = 256, nullable = false)
	private String apellido;

//	@OneToMany(mappedBy = "idEmple")
//	private Set<DepartamentoEmpleado> employe_department;
	
		
	//SET and GET
	
	public Integer getIdEmpl() {
		return idEmpl;
	}

	public void setIdEmpl(Integer idEmpl) {
		this.idEmpl = idEmpl;
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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}	
		

	
	
	

}
