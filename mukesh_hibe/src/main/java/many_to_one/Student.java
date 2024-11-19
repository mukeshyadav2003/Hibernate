package many_to_one;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Student {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;

	@ManyToOne(cascade = CascadeType.ALL)
    private Address_table Adr;
	
	public Address_table getAdr() {
		return Adr;
	}
	public void setAdr(Address_table adr) {
		this.Adr = adr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	
}
