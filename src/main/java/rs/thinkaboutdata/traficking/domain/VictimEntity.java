package rs.thinkaboutdata.traficking.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="victim")
public class VictimEntity {
	

	@Id @Column(name="id") 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="working_position")
	private String workingPosition;
	
	@ManyToOne 
	@JoinColumn(name = "trafficker_id")
	TraffickerEntity trafficker;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_person_id")
	ContactPersonEntity contactPerson;
	
	public VictimEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getWorkingPosition() {
		return workingPosition;
	}

	public void setWorkingPosition(String workingPosition) {
		this.workingPosition = workingPosition;
	}


	public TraffickerEntity getTrafficker() {
		return trafficker;
	}

	public void setTrafficker(TraffickerEntity trafficker) {
		this.trafficker = trafficker;
	}


	public ContactPersonEntity getContactPerson() {
		return contactPerson;
	}


	public void setContactPerson(ContactPersonEntity contactPerson) {
		this.contactPerson = contactPerson;
	}
	
	
	
	

	
	

	
	
	
}
