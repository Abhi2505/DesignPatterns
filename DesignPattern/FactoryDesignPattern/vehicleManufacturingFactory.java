package DesignPattern.FactoryDesignPattern;

public class vehicleManufacturingFactory {
	
	public VehicleManufacture getVehicle(String VehicleManufacturer) {
		if(VehicleManufacturer.equals("CarManufacture")) {
			return new CarManufacture();
		}
		else if(VehicleManufacturer.equals("BikeManufacture")) {
			return new BikeManufacture();
		}
		else {
			return null;
		}
	}

}
