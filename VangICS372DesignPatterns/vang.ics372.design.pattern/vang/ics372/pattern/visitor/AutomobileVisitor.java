package vang.ics372.pattern.visitor;

import vang.ics372.pattern.factory.impl.PickupTruck;
import vang.ics372.pattern.factory.impl.Sedan;
import vang.ics372.pattern.factory.impl.SportUtilityVehicle;

public interface AutomobileVisitor {
	public void visit(PickupTruck pickup);
	public void visit(Sedan sedan);
	public void visit(SportUtilityVehicle suv);
}
