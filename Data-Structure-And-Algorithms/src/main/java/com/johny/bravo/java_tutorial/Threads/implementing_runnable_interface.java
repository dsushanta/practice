package com.johny.bravo.java_tutorial.Threads;

class runner_interface implements Runnable{

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

public class implementing_runnable_interface {

	public static void main(String[] args) {
		
		Thread I1 = new Thread(new runner_interface());
		Thread I2 = new Thread(new runner_interface());
		
		I1.start();
		I2.start();
	}

}
