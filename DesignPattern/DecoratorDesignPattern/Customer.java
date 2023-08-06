package DesignPattern.DecoratorDesignPattern;

public class Customer {
public static void main(String[] args) {
	icecream icream=new vanillaIceCream();
	icream = new chocoChipDecorator( new rainbowSprinklerDecorator(icream));
	System.out.println(icream.getCost());
	System.out.println(icream.getDescription());
}
}
