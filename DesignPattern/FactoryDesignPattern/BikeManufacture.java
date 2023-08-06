package DesignPattern.FactoryDesignPattern;

public class BikeManufacture implements VehicleManufacture {

	@Override
	public BikeManufacture getVehicleManufacture() {
		// TODO Auto-generated method stub
		return new BikeManufacture();
	}


}
