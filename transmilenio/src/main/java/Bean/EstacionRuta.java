package Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "EstacionRuta")  
public class EstacionRuta {
	
	@NotBlank
	private int idEstacionRuta;
	@NotBlank
	private String codEstacion;
	@NotBlank
	private String codRuta;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdEstacionRuta() {
		return idEstacionRuta;
	}
	public void setIdEstacionRuta(int idEstacionRuta) {
		this.idEstacionRuta = idEstacionRuta;
	}
	public String getCodEstacion() {
		return codEstacion;
	}
	public void setCodEstacion(String codEstacion) {
		this.codEstacion = codEstacion;
	}
	public String getCodRuta() {
		return codRuta;
	}
	public void setCodRuta(String codRuta) {
		this.codRuta = codRuta;
	}
	
	

}
