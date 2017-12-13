package rs.thinkaboutdata.traficking.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "trafficker")
public class TraffickerEntity {
	
	@Id @Column(name="id") 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
//	@ManyToOne 
//	@JoinColumn(name = "agency_id")
//	AgencyEntity agencyEntity;
	
	public TraffickerEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public TraffickerEntity(Long id) {
		this.id = id;
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

//	public AgencyEntity getAgencyEntity() {
//		return agencyEntity;
//	}
//
//	public void setAgencyEntity(AgencyEntity agencyEntity) {
//		this.agencyEntity = agencyEntity;
//	}	
//	
	
	
}
