package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Departement
 *
 */
@Entity

public class Departement implements Serializable {

	
	private Integer id;
	private String name;
	private static final long serialVersionUID = 1L;

	public Departement() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
