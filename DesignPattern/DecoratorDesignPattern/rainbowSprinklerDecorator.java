package DesignPattern.DecoratorDesignPattern;

public class rainbowSprinklerDecorator extends iceCreamDecorator{
	icecream ic;
public rainbowSprinklerDecorator(icecream ic) {
	// TODO Auto-generated constructor stub
	this.ic=ic;
}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.ic.getCost()+45;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.ic.getDescription()+" with rainbow sprinkler";
	}

}
