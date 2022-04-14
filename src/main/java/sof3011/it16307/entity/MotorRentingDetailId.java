package sof3011.it16307.entity;

import java.io.Serializable;

public class MotorRentingDetailId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private MotorRenting motorRenting;
	private MotorbikeInstance motorInstance;
	private Renter renter;

	public MotorRentingDetailId() {}
	
	public MotorRentingDetailId(MotorRenting motorRenting, MotorbikeInstance motorInstance, Renter renter) {
		this.motorRenting = motorRenting;
		this.motorInstance = motorInstance;
		this.renter = renter;
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
	
}
