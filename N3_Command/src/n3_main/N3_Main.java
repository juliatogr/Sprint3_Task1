package n3_main;

import java.util.Scanner;

public class N3_Main {
	public static void main (String[] args) {
		
		boolean exit = false;

        IMotorable car = new Vehicle();
        IMotorable bicycle = new Vehicle();
        IMotorable plane = new Vehicle();
        IMotorable boat = new Vehicle();	        
        
        // Pass reference to instances of the Command objects to the switch
        Motor carMotor = new Motor(car);
        Motor bicycleMotor = new Motor(bicycle);
        Motor planeMotor = new Motor(plane);
        Motor boatMotor = new Motor(boat);
        

        while(!exit) {
        	int motorOpt = initMenu();
        	Motor currentMotor = null;
        	
        	switch(motorOpt) {
        	case 0:
        		exit = true;
        		System.out.println("bye");
        		break;
        	case 1:
        		currentMotor = carMotor;
        		break;
        	case 2:
        		currentMotor = bicycleMotor;
        		break;
        	case 3:
        		currentMotor = planeMotor;
        		break;
        	case 4:
        		currentMotor = boatMotor;
        		break;	
        	}
        
        	boolean goBack = false;
        	
            while(!goBack) {
            	int actionOpt = actionMenu();
            	
            	switch(actionOpt) {
            	case 0:
            		goBack = true;
            		break;
            	case 1:
            		currentMotor.start();
            		break;
            	case 2:
            		currentMotor.run();
            		break;
            	case 3:
            		currentMotor.stop();
            		break;
            	
                }
            }
        }
    }
	
	public static int initMenu() {
		Scanner sc = new Scanner(System.in);
		final int MAX_OPTS = 4;
		
		int opt = -1;
		
		while (opt < 0 || opt > MAX_OPTS) {
			
			System.out.println("Choose an option:");
			
			System.out.println("    1. Use the car");
			System.out.println("    2. Use the bike");
			System.out.println("    3. Use the plane");
			System.out.println("    4. Use the boat");
			System.out.println("    0. Exit");		
			
			opt = sc.nextInt();
			
			if (opt < 0 || opt > MAX_OPTS) {
				System.out.println("Not a valid input");
			}
		}
		
		return opt;
		
	}
	
	public static int actionMenu() {
		Scanner sc = new Scanner(System.in);
		final int MAX_OPTS = 3;
		
		int opt = -1;
		
		while (opt < 0 || opt > MAX_OPTS) {
			
			System.out.println("Choose an action:");
			
			System.out.println("    1. Start up");
			System.out.println("    2. Speed up");
			System.out.println("    3. Stop");
			System.out.println("    0. Go back to the init menu");		
			
			opt = sc.nextInt();
			
			if (opt < 0 || opt > MAX_OPTS) {
				System.out.println("Not a valid input");
			}
		}
		
		return opt;
		
	}
}
