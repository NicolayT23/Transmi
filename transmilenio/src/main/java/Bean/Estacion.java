package Bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "Estacion")   
public class Estacion {
	
	@NotBlank
	private int idEstacion;
	@NotBlank
	private String codEstacion;
	@NotBlank
	private String nombre;
	@NotBlank
	private String estado;
	@NotBlank
	@JsonFormat(timezone = "UTC", pattern = "HH:mm:ss")
    @Temporal(TemporalType.TIME)
    @Column(name="horaApertura", nullable=false)
	private Date horaApertura;
	
	@NotBlank
	@JsonFormat(timezone = "UTC", pattern = "HH:mm:ss")
    @Temporal(TemporalType.TIME)
    @Column(name="horaCierre", nullable=false)
	private Date horaCierre;
	
	@NotBlank
	private String codTroncal;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdEstacion() {
		return idEstacion;
	}
	public void setIdEstacion(int idEstacion) {
		this.idEstacion = idEstacion;
	}
	public String getCodEstacion() {
		return codEstacion;
	}
	public void setCodEstacion(String codEstacion) {
		this.codEstacion = codEstacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getHoraApertura() {
		return horaApertura;
	}
	public void setHoraApertura(Date horaApertura) {
		this.horaApertura = horaApertura;
	}
	public Date getHoraCierre() {
		return horaCierre;
	}
	public void setHoraCierre(Date horaCierre) {
		this.horaCierre = horaCierre;
	}
	public String getCodTroncal() {
		return codTroncal;
	}
	public void setCodTroncal(String codTroncal) {
		this.codTroncal = codTroncal;
	}
	
	
	
	
	
	

}
