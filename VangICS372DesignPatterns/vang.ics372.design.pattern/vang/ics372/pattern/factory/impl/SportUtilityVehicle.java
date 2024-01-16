package vang.ics372.pattern.factory.impl;

import vang.ics372.pattern.clients.Handling;

public class SportUtilityVehicle extends Automobile {
	private boolean hasThirdRow;
	private boolean is4X4;
	
	
	public SportUtilityVehicle(int vehicleType, String vin, String doors,
			boolean hasThirdRow, boolean is4X4) {
		super(vehicleType, vin, doors);
		this.hasThirdRow = hasThirdRow;
		this.is4X4 = is4X4;
		//System.out.println("Inside SUV");
	}
	
	@Override
	public void accepts(Handling visitor) {
		visitor.visit(this);
	}

	/**
	 * @return the hasThirdRow
	 */
	public boolean isHasThirdRow() {
		return hasThirdRow;
	}

	/**
	 * @param hasThirdRow the hasThirdRow to set
	 */
	public void setHasThirdRow(boolean hasThirdRow) {
		this.hasThirdRow = hasThirdRow;
	}

	/**
	 * @return the is4X4
	 */
	public boolean isIs4X4() {
		return is4X4;
	}

	/**
	 * @param is4x4 the is4X4 to set
	 */
	public void setIs4X4(boolean is4x4) {
		is4X4 = is4x4;
	}

	@Override
	public String toString() {
		return "SportUtilityVehicle [" + super.toString() + "hasThirdRow=" + hasThirdRow + ", is4X4=" + is4X4 + "]";
	}

}
