package DesignPattern.DecoratorDesignPattern;

public class chocoChipDecorator extends iceCreamDecorator{
	icecream icecream;
	public chocoChipDecorator(icecream ic) {
		this.icecream=ic;
	}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return icecream.getCost()+12;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return icecream.getDescription()+" with choco chips";
	}

}
