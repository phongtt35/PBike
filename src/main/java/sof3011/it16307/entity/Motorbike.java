package sof3011.it16307.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Motorbike {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private String brand;
	
	@Column(nullable=true)
	private String description;
	
	@Column(nullable=false)
	private BigDecimal currentRentingPrice;
	
	@OneToMany(mappedBy = "type")
	private List<MotorbikeInstance> instances;
	
	public Motorbike() {}

	public Motorbike(Integer id, String name, String brand, String description, BigDecimal rentingPrice) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.currentRentingPrice = rentingPrice;
	}
	
	public Motorbike(Integer id, String name, String brand, String description, BigDecimal currentRentingPrice,
			List<MotorbikeInstance> instances) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.currentRentingPrice = currentRentingPrice;
		this.instances = instances;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getRentingPrice() {
		return currentRentingPrice;
	}

	public void setRentingPrice(BigDecimal rentingPrice) {
		this.currentRentingPrice = rentingPrice;
	}

	public BigDecimal getCurrentRentingPrice() {
		return currentRentingPrice;
	}

	public void setCurrentRentingPrice(BigDecimal currentRentingPrice) {
		this.currentRentingPrice = currentRentingPrice;
	}

	public List<MotorbikeInstance> getInstances() {
		return instances;
	}

	public void setInstances(List<MotorbikeInstance> instances) {
		this.instances = instances;
	}
	
}
