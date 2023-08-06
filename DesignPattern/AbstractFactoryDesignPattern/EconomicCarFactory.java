package DesignPattern.AbstractFactoryDesignPattern;

public class EconomicCarFactory implements CarFactory {

	@Override
	public CarFactory getCarFactoryInstance(String factoryName) {
		// TODO Auto-generated method stub
		return new EconomicCarFactory();
	}

}
