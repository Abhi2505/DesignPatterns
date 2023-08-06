package DesignPattern.SingletonDesignPattern;

public class MyClassB implements Runnable {

	@Override
	public void run() {
		SingletonClas obj1=SingletonClas.getInstance();
		obj1.method2();
		
	}

}
