package vang.ics372.pattern.clients;

import vang.ics372.pattern.factory.VehicleFactory;
import vang.ics372.pattern.factory.impl.Automobile;
import vang.ics372.pattern.factory.impl.Sedan;

public class TestClient {
	private static VehicleFactory vehicleFactory;
	
	public static void main(String[] args) {
		Automobile vehicle;
		Sedan sedan = new Sedan(VehicleFactory.SEDAN, 
				"JDMB18C5RR", "4 Doors", true, true);
		Handling visitor = new Handling();
		//System.out.println("Inside main");
		vehicleFactory = VehicleFactory.instance();
		vehicle = vehicleFactory.getVehicle(VehicleFactory.SEDAN, 
				"JDM18765498R", "4 Doors", true, true);
		vehicle.accepts(visitor);
		//System.out.println(vehicle.toString());
		vehicle = vehicleFactory.getVehicle(VehicleFactory.PICKUP, 
				"JDM18765589R", "2 Doors", false, true);
		vehicle.accepts(visitor);
		//System.out.println(vehicle.toString());
		vehicle = vehicleFactory.getVehicle(VehicleFactory.SUV, 
				"JDM38865589R", "2 Doors", true, true);
		vehicle.accepts(visitor);
		//System.out.println(vehicle.toString());
		sedan.accepts(visitor);
	}
}
