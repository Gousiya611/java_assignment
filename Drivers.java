package RentARide;

public class Drivers {
	
		// TODO Auto-generated constructor stub
	String[] driver= {"A","B","C","D","E"};
	String[] carModel = {"Sedan","HatchBack","5 Seater","Sedan","HatchBack"};
	double[] ratings = {4.0,4.3,4.8,4.1,4.7};
	double[] DistanceFromCustomer = {500, 1000, 200, 700, 430};
	public void print() {
		for (int i=0;i<driver.length;i++) {
			System.out.println(driver[i]+" "+carModel[i]+" "+ratings[i]+" "+DistanceFromCustomer[i]);
			
		}
	}

}
