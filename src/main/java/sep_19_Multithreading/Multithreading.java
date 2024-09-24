package sep_19_Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Threadclass1 extends Thread{
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(" it is class 1 "+i);
		}
	}
}
class  Threadclass2 extends Thread{
	@Override
	public void run() {
		for (int i = 1; i <=20; i++) {
			System.out.println(" it is class 2 "+i);
		}

	}
}
class Threadclass3 extends Thread{
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(" it is class 3 "+i);
		}
	}
}
public class Multithreading {

	public static void main(String[] args) {
//		Threadclass1 class1= new Threadclass1();
//		Threadclass2 class2= new Threadclass2();
//		Threadclass3 class3= new Threadclass3();
//		Thread t= new Thread( class1);
//		Thread t1= new Thread( class2);
//		Thread t2= new Thread( class3);
//		t.start();
//		t1.start();
//		t2.start();
//		t1.getState();
//		System.out.println(Thread.activeCount());
	
		 ExecutorService executor = Executors.newFixedThreadPool(2); // Create a thread pool of 2 threads
	        executor.submit(() -> System.out.println("Task 1 executed"));
	        executor.submit(() -> System.out.println("Task 2 executed"));
	        executor.shutdown(); // Shut down the executor service after task completion
	        
		
//		class1.start();
//		class2.start();
	}

}