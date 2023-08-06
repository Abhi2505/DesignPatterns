package DesignPattern.AbstractFactoryDesignPattern;

public class FactoryCreator {
	public CarFactory getCarFactoryInstance(String factoryName) {
		if(factoryName.equals("EconomicCarFactory")) {
			return new EconomicCarFactory();
		}
		else if(factoryName.equals("LuxuryCarFactory")) {
			return new LuxuryCarFactory();
		}
		else
		return null;
	}

}
