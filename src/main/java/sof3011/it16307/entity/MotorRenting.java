package sof3011.it16307.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MotorRenting {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false)
	private Date startDate;
	
	@Column(nullable=false)
	private Date endDate;
	
	@Column(nullable=false)
	@Enumerated(value = EnumType.STRING)
	private RentingStatus rentingStatus = RentingStatus.NotReceived;

	public MotorRenting() {}
	
	public MotorRenting(Integer id, Date startDate, Date endDate, RentingStatus rentingStatus) {
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.rentingStatus = rentingStatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public RentingStatus getRentingStatus() {
		return rentingStatus;
	}

	public void setRentingStatus(RentingStatus rentingStatus) {
		this.rentingStatus = rentingStatus;
	}
}
