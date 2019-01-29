package main;

import java.awt.event.InputEvent;
import java.lang.Thread;
import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("---- Auto Mouse Clicker ----");

		System.out.println("Enter the number of desired clicks: ");
		int clicks = scr.nextInt();
		System.out.println();

		System.out.println("Enter delay between clicks in miliseconds: ");
		int delay = scr.nextInt();
		System.out.println();
		System.out.println("Program will start in 3 seconds!");

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Clicker clicker = new Clicker();
		clicker.setDelay(delay);
		
		for (int i = 0; i < clicks; i++) {
			clicker.clickMouse(InputEvent.BUTTON1_MASK);
		}
		
		System.out.println("Clicking complete!");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}