package DesignPattern.FactoryDesignPattern;

public class CarManufacture implements VehicleManufacture{

	@Override
	public CarManufacture getVehicleManufacture() {
		// TODO Auto-generated method stub
		return new CarManufacture();
	}

}
