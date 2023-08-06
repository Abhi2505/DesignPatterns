package DesignPattern.FactoryDesignPattern;

public class Main {
	public static void main(String[] args) {
		vehicleManufacturingFactory f1=new vehicleManufacturingFactory();
		VehicleManufacture carManufacture=f1.getVehicle("CarManufacture");
		VehicleManufacture bikeManufacture=f1.getVehicle("BikeManufacture");
	}
}
