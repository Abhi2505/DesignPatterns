package DesignPattern.DecoratorDesignPattern;

public class chocolateSyrupdecorator extends iceCreamDecorator {
icecream ic;
public chocolateSyrupdecorator(icecream ic) {
this.ic=ic;
}
@Override
public int getCost() {
	// TODO Auto-generated method stub
	return this.ic.getCost()+25;
}

@Override
public String getDescription() {
	// TODO Auto-generated method stub
	return this.IceCream.getDescription()+" with chocolateSyrup ";
}
}
