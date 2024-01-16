package vang.ics372.pattern.factory.impl;

import vang.ics372.pattern.clients.Handling;

public class PickupTruck<AutomobileVisitor> extends Automobile {
	
	private boolean hasCab;
	private boolean is4X4;
	
	
	public PickupTruck(int vehicleType, String doors, String vin, 
			boolean hasCab, Boolean is4X4) {
		super(vehicleType, vin, doors);
		this.hasCab = hasCab;
		this.is4X4 = is4X4;
		//System.out.println("Inside PickupTruck");
	}
	
	@Override
	public void accepts(Handling visitor) {
		visitor.visit(this);
	}
	
	/**
	 * @return the bed
	 */
	public boolean isHasCab() {
		return hasCab;
	}

	/**
	 * @param bed the bed to set
	 */
	public  void setHasCab(boolean hasCab) {
		this.hasCab = hasCab;
	}

	/**
	 * @return the is4X4
	 */
	public boolean getIs4X4() {
		return is4X4;
	}

	/**
	 * @param is4x4 the is4X4 to set
	 */
	public void setIs4X4(Boolean is4x4) {
		is4X4 = is4x4;
	}

	@Override
	public String toString() {
		return "PickupTruck [" + super.toString() + 
				"hasCab=" + hasCab + ", is4X4=" + is4X4 + "]";
	}
}
