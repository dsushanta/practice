package com.johny.bravo.java_tutorial.Threads;

class Runner extends Thread {

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello Thread : "+i);
		}
	}
}


public class extending_thread_class {

	public static void main(String[] args) {
		
		Runner r1 = new Runner();
		Runner r2 = new Runner();
		
		r1.start();
		r2.start();
		
		/*r1.run();
		r2.run();*/
	}	

}
