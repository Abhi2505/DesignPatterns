package DesignPattern.StrategyDesignPattern;

public class ApplyDiscount {
	//as long as new strategies arrives for giving we need not have to do the
	//changes in this class only new implementation needs to be created and also
	//strategies can be assigned at runtime 
 DiscountStrategy discountStrategy;
 //another example can be when we create multiple sorting strategies
 //and can modify the sorting strategy at the runtime
 
 public ApplyDiscount(DiscountStrategy ds) {
	 this.discountStrategy=ds;
 }
 public void getDiscount() {
	 this.discountStrategy.giveDiscount();
 }
 
 public void setStrategy(DiscountStrategy ds) {
	 this.discountStrategy=ds;
 }
 
}
