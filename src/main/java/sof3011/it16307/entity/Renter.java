package sof3011.it16307.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Renter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=true)
	private String address;
	
	@Column(nullable=false)
	private String phoneNumber;
	
	@Column(nullable=true)
	private Date dateOfBirth;
	
	@Column(unique=true, nullable=true)
	private String citizenIdentificationNumber;
	@Column(unique=true, nullable=true)
	private String idCardNumber;
	@Column(unique=true, nullable=true)
	private String passportNumber;
	
	public Renter() {}

	public Renter(Integer id, String name, String address, String phoneNumber, Date dateOfBirth,
			String citizenIdentificationNumber, String idCardNumber, String passportNumber) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.citizenIdentificationNumber = citizenIdentificationNumber;
		this.idCardNumber = idCardNumber;
		this.passportNumber = passportNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCitizenIdentificationNumber() {
		return citizenIdentificationNumber;
	}

	public void setCitizenIdentificationNumber(String citizenIdentificationNumber) {
		this.citizenIdentificationNumber = citizenIdentificationNumber;
	}

	public String getIdCardNumber() {
		return idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	
}
