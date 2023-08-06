package DesignPattern.AbstractFactoryDesignPattern;

public class LuxuryCarFactory implements CarFactory {

	@Override
	public CarFactory getCarFactoryInstance(String factoryName) {
		return new LuxuryCarFactory();
	}

}
