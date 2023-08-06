package DesignPattern.StrategyDesignPattern;

public class Main {
public static void main(String[] args) {
	ApplyDiscount ad=new ApplyDiscount(new FlatDiscount());
	ad.getDiscount();
	ad.setStrategy(new CouponDiscount());
	ad.getDiscount();
}
}
