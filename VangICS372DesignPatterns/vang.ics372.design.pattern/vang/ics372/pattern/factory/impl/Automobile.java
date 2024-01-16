package vang.ics372.pattern.factory.impl;

import vang.ics372.pattern.clients.Handling;
import vang.ics372.pattern.factory.Vehicle;

public abstract class Automobile implements Vehicle{
	private int type;
	private String vin;
	private String doors;
	
	public Automobile(int vehicleType, String doors, String vin) {
		this.type = vehicleType;
		this.doors = doors;
		this.vin = vin;
	}
	public abstract void accepts(Handling visitor);

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the vin
	 */
	public String getVin() {
		return vin;
	}

	/**
	 * @param vin the vin to set
	 */
	public void setVin(String vin) {
		this.vin = vin;
	}

	/**
	 * @return the doors
	 */
	public String getDoors() {
		return doors;
	}

	/**
	 * @param doors the doors to set
	 */
	public void setDoors(String doors) {
		this.doors = doors;
	}
	
	@Override
	public String toString() {
		return "vin=" + vin + ", doors=" + doors + ", ";
	}
}
