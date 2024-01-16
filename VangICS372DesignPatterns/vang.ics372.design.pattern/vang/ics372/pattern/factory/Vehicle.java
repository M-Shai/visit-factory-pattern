package vang.ics372.pattern.factory;

public interface Vehicle {
	public static final int type = 0;
	public static final String vin = "";
	public static final String doors = "";
	
	public abstract int getType();
	public abstract void setType(int type);
	public abstract String getVin();
	public abstract void setVin(String vin);
	public abstract String getDoors();
	public abstract void setDoors(String doors);
}
