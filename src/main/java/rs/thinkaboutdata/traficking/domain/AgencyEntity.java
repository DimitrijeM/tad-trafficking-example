package rs.thinkaboutdata.traficking.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="agency")
public class AgencyEntity {

	@Id @Column(name="id") 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="is_registered")
	private boolean isRegistered;
	
	@Column(name= "pib")
	private String pib;
		
//	@OneToMany(mappedBy = "trafficker")
//	private List<TraffickerEntity> traffickers;
	

	public AgencyEntity() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

//	public List<TraffickerEntity> getTraffickers() {
//		return traffickers;
//	}
//
//	public void setTraffickers(List<TraffickerEntity> traffickers) {
//		this.traffickers = traffickers;
//	}
	
	
}
