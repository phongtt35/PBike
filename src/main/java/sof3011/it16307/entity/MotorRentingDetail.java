package sof3011.it16307.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
@IdClass(MotorRentingDetailId.class)
public class MotorRentingDetail {

	@Id
	@ManyToOne
    @JoinColumn
	private MotorRenting motorRenting;
	
	@Id
	@ManyToOne
    @JoinColumn
	private MotorbikeInstance motorInstance;
	
	@Id
	@ManyToOne
    @JoinColumn
	private Renter renter;
	
	@Column(nullable=false)
	private BigDecimal rentingPrice;

	public MotorRentingDetail() {}
	
	public MotorRentingDetail(MotorRenting motorRenting, MotorbikeInstance motorInstance, Renter renter,
			BigDecimal rentingPrice) {
		this.motorRenting = motorRenting;
		this.motorInstance = motorInstance;
		this.renter = renter;
		this.rentingPrice = rentingPrice;
	}

	public MotorRenting getMotorRenting() {
		return motorRenting;
	}

	public void setMotorRenting(MotorRenting motorRenting) {
		this.motorRenting = motorRenting;
	}

	public MotorbikeInstance getMotorInstance() {
		return motorInstance;
	}

	public void setMotorInstance(MotorbikeInstance motorInstance) {
		this.motorInstance = motorInstance;
	}

	public Renter getRenter() {
		return renter;
	}

	public void setRenter(Renter renter) {
		this.renter = renter;
	}

	public BigDecimal getRentingPrice() {
		return rentingPrice;
	}

	public void setRentingPrice(BigDecimal rentingPrice) {
		this.rentingPrice = rentingPrice;
	}
	
}
