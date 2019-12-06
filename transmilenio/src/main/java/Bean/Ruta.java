package Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "Ruta")   
public class Ruta {
	@NotBlank
	private int idRuta;
	@NotBlank
	private String codRuta;
	@NotBlank
	private String nombre;
	private int inicioOperacion;

	private int finOperacion;

	public int getInicioOperacion() {
		return inicioOperacion;
	}


	public void setInicioOperacion(int inicioOperacion) {
		this.inicioOperacion = inicioOperacion;
	}


	public int getFinOperacion() {
		return finOperacion;
	}


	public void setFinOperacion(int finOperacion) {
		this.finOperacion = finOperacion;
	}
	
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdRuta() {
		return idRuta;
	}
	
	
	public void setIdRuta(int idRuta) {
		this.idRuta = idRuta;
	}
	public String getCodRuta() {
		return codRuta;
	}
	public void setCodRuta(String codRuta) {
		this.codRuta = codRuta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
