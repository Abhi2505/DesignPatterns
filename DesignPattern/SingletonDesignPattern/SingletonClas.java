package DesignPattern.SingletonDesignPattern;

public class SingletonClas {
 private static  SingletonClas obj;
 private SingletonClas() {
	 System.out.println("private constructor called 	");
 }
   public  static  SingletonClas getInstance() {	 
	 if(obj==null) { 
		 //here suppose first find null and swithced second also find
		 //null then two instance would be created
		 //1) way make method synchronized but that can lead to performance issue
		 //if suppose 1 cr lines are there then other thread has to wait for complete syn method execution
		 //so to deal with synchronized block can be used
		 synchronized (SingletonClas.class) {
			 if(obj==null)
			 obj=new SingletonClas();			
		}
	 }
	 //line no 9 is necessary so that multiple threads need not to wait outside the sync block after object initialisation .
	 
	 return obj;
 }
 
 
 //if t1 thread is calling a syn method and t2 thread is cannot calling the any other synchronized method
 //on the same object it will only call once t1 execution is completed .
 public synchronized void method1() {
	for(int i=1;i<=20;i++)
	 System.out.println(i);
 }
 public synchronized void method2() {
	for(int i=20;i>=1;i--)
	 System.out.println(i);
 }
 
 
}
