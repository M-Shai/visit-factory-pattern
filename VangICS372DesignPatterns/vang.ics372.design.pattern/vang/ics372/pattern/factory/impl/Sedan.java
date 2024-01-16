package vang.ics372.pattern.factory.impl;

import vang.ics372.pattern.clients.Handling;

public class Sedan extends Automobile {
	private boolean hasBucketSeats;
	private boolean isAWD;
	
	public Sedan(int vehicleType, String doors, String vin,
			boolean hasBucketSeats, boolean isAWD) {
		super(vehicleType, vin, doors);
		this.hasBucketSeats = hasBucketSeats;
		this.isAWD = isAWD;
		//System.out.println("Inside Sedan");
	}
	
	@Override
	public void accepts(Handling visitor) {
		visitor.visit(this);
	}

	/**
	 * @return the hasBucketSeat
	 */
	public Boolean getHasBucketSeat() {
		return hasBucketSeats;
	}

	/**
	 * @param hasBucketSeat the hasBucketSeat to set
	 */
	public void setHasBucketSeat(Boolean hasBucketSeats) {
		this.hasBucketSeats = hasBucketSeats;
	}

	/**
	 * @return the isAWD
	 */
	public boolean isAWD() {
		return isAWD;
	}

	/**
	 * @param isAWD the isAWD to set
	 */
	public void setAWD(boolean isAWD) {
		this.isAWD = isAWD;
	}

	@Override
	public String toString() {
		return "Sedan [" + super.toString() + "hasBucketSeats=" + hasBucketSeats + ", isAWD=" + isAWD + "]";
	}
}
