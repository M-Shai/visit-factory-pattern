package vang.ics372.pattern.clients;

import vang.ics372.pattern.factory.impl.PickupTruck;
import vang.ics372.pattern.factory.impl.Sedan;
import vang.ics372.pattern.factory.impl.SportUtilityVehicle;
import vang.ics372.pattern.visitor.AutomobileVisitor;

public class Handling implements AutomobileVisitor{

	@Override
	public void visit(PickupTruck pickup) {
		System.out.println(pickup.toString());
		
	}

	@Override
	public void visit(Sedan sedan) {
		System.out.println(sedan.toString());
		
	}

	@Override
	public void visit(SportUtilityVehicle suv) {
		System.out.println(suv.toString());
		
	}

}
