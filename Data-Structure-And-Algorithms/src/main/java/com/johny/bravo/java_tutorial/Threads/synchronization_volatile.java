package com.johny.bravo.java_tutorial.Threads;

import java.util.Scanner;

class Processor extends Thread {

	private volatile boolean running = true;
	
	@Override
	public void run() {
		while(running) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Still Running .... ");
		}
	}
	
	public void shutdown() {
		running = false;
	}
}

public class synchronization_volatile {

	public static void main(String[] args) {
		
		Processor p = new Processor();
		p.start();
		System.out.println("Hit Enter to Stop Thread !!");
		Scanner in = new Scanner(System.in);
		in.nextLine();
		p.shutdown();
	}

}
