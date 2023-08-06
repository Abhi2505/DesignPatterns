package DesignPattern.AbstractFactoryDesignPattern;

public interface AbstractFactory {
	public CarFactory getCarFactoryInstance(String factoryName);
}
