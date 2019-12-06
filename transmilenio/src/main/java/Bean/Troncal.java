package Bean;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;



@Entity
@Table(name = "Troncal")    
public class Troncal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTroncal;

    @NotBlank
    private String CodTroncal;

	public int getIdTroncal() {
		return idTroncal;
	}

	public void setIdTroncal(int idTroncal) {
		this.idTroncal = idTroncal;
	}

	public String getCodTroncal() {
		return CodTroncal;
	}

	public void setCodTroncal(String codTroncal) {
		CodTroncal = codTroncal;
	}


    
}