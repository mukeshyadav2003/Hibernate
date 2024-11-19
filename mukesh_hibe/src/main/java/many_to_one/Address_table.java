package many_to_one;

import javax.persistence.Entity;

import javax.persistence.Id;



@Entity
public class Address_table {
     
	@Id
	private int streetno;
	private String streetname;
			
	public int getStreetno() {
		return streetno;
	}
	public void setStreetno(int streetno) {
		this.streetno = streetno;
	}
	public String getStreetname(){
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	
	
}
