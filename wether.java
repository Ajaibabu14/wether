package assesment;

import java.util.Scanner;

public class wether {
	
	
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Welcome to Weather Information Program!");

	        while (true) {
	            System.out.println("Options:");
	            System.out.println("1. Get weather");
	            System.out.println("2. Get Wind Speed");
	            System.out.println("3. Get Pressure");
	            System.out.println("0. Exit");

	            System.out.print("Enter your choice (0-3): ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); 
	            if (choice == 0) {
	                System.out.println("Terminating the program.");
	                break;
	            }

	            System.out.print("Enter the date (YYYY-MM-DD): ");
	            String date = scanner.nextLine();

	            switch (choice) {
	                case 1:
	                    double temperature = getTemperature(date);
	                    System.out.println("Temperature on " + date + ": " + temperature + "°C");
	                    break;

	                case 2:
	                    double windSpeed = getWindSpeed(date);
	                    System.out.println("Wind Speed on " + date + ": " + windSpeed + " km/h");
	                    break;

	                case 3:
	                    double pressure = getPressure(date);
	                    System.out.println("Pressure on " + date + ": " + pressure + " hPa");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please choose a valid option (0-3).");
	            }
	        }
	        scanner.close();
	    }

	    
	    private static double getTemperature(String date) {
	        
	        return 25.0;
	    }

	    
	    private static double getWindSpeed(String date) {
	        
	        return 10.0;
	    }

	   
	    private static double getPressure(String date) {
	        
	        return 1015.0;
	    }

}
