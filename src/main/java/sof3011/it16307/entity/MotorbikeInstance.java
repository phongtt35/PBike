package sof3011.it16307.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class MotorbikeInstance {

	@Id
	private String licensePlate;
	
	@ManyToOne
    @JoinColumn(nullable=false)
	private Motorbike type;
	
	@Column(nullable=false)
	private String color;
	
	@Column(nullable=true)
	private String description;
	
	@Column(nullable=false)
	private Integer kmNumber;
	
	public MotorbikeInstance() { }

	public MotorbikeInstance(String licensePlate, Motorbike type, String color, String description, Integer kmNumber) {
		this.licensePlate = licensePlate;
		this.type = type;
		this.color = color;
		this.description = description;
		this.kmNumber = kmNumber;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public Motorbike getType() {
		return type;
	}

	public void setType(Motorbike type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getKmNumber() {
		return kmNumber;
	}

	public void setKmNumber(Integer kmNumber) {
		this.kmNumber = kmNumber;
	}
	
}
