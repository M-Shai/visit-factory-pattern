package vang.ics372.pattern.factory;

import vang.ics372.pattern.factory.impl.Automobile;
import vang.ics372.pattern.factory.impl.PickupTruck;
import vang.ics372.pattern.factory.impl.Sedan;
import vang.ics372.pattern.factory.impl.SportUtilityVehicle;

public class VehicleFactory {
	public static final int SEDAN = 1;
	public static final int PICKUP = 2;
	public static final int SUV = 3;
	private static VehicleFactory singletonVehicleFactory;
	
	private VehicleFactory() {
		//singleton pattern
	}
	
	public static VehicleFactory instance() {
		if(singletonVehicleFactory == null) {
			return singletonVehicleFactory = new VehicleFactory();
		}
		else {
			return singletonVehicleFactory;
		}
	}
	
	public Automobile getVehicle(int vehicleType, String vin, String doors,
			boolean seating, boolean drive) {
		//System.out.println("Inside getVehicle type = " + vehicleType);
		switch(vehicleType) {
		case SEDAN:
			//System.out.println("type = " + vehicleType);
			return new Sedan(vehicleType, vin, doors,
					seating, drive);
		case PICKUP:
			//System.out.println("type = " + vehicleType);
			return new PickupTruck(vehicleType, vin, doors,
					seating, drive);
		case SUV:
			//System.out.println("type = " + vehicleType);
			return new SportUtilityVehicle(vehicleType, vin, doors,
					seating, drive);
		default:
			throw new RuntimeException("Invalid vehicle type");
		}
	}

}
