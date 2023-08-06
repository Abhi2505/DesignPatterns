package DesignPattern.SingletonDesignPattern;

import com.MT.MyThread;

public class Main {
public static void main(String[] args) {
	Runnable c1=new MyClassA();
	Runnable c2=new MyClassB();
	Thread t1=new Thread(c1);
	Thread t2=new Thread(c2);
	t1.start();
	t2.start();
	//two object are created which should not be the case 
	}
}
