package DesignPattern.SingletonDesignPattern;

public class MyClassA implements Runnable{

	@Override
	public void run() {
		SingletonClas s1=SingletonClas.getInstance();
		s1.method1();
		System.out.println(s1);
	}

}
