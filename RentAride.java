package RentARide;
import java.util.Scanner;
public class RentAride extends Drivers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ride distance :");
		double rideDistance = sc.nextDouble();
		
		sc.nextLine();
		System.out.println("Enter the requested car model:");
		String requestedCarModel = sc.nextLine();
		Drivers d=new Drivers();
		d.print();
		// sc.close();
		String selectedDriver =null;
		double mindistance=99999;
		for(int i=0;i<5;i++) {
			if(d.carModel[i].equals(requestedCarModel)&&d.ratings[i]>=4.0 && d.DistanceFromCustomer[i]<mindistance) {
				selectedDriver =d.driver[i];
				mindistance = d.DistanceFromCustomer[i];
				
			}
		}
		System.out.println("Driver"+selectedDriver+"will get you to the destination ");
	    double totalCharge= rideDistance *8.0;
	    System.out.println("Your charge will br Rs" + totalCharge);
		
			
	}

}