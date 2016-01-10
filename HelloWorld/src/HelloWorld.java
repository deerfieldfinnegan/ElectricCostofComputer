import java.util.Scanner;
import java.util.ArrayList;;
public class HelloWorld
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ArrayList listA = new ArrayList();
		ArrayList batteryCost = new ArrayList();
		ArrayList computerCost = new ArrayList();
		ArrayList electricityCost = new ArrayList();
		Double watts = 0.0 ; //defining the numeber of watts in the beginning
		Double elec = 0.0; //the cost depending on the country you live in
		Double bCost = 0.0; //if the number of years of ownership is 5 or more years the battery cost increases
		System.out.println("How much did you purchase your computer for?"); //to get the baseline money spent
		Double purchase = scan.nextDouble(); //the scanner
		System.out.println("Do you own a laptop or a desktop?");  //to find out the energy type and then ask about screen sizes
		Scanner scan1 = new Scanner(System.in);
		String computer = scan1.nextLine();
		System.out.println("Do you have an Intel or AMD CPU?"); //Asking about CPU
		Scanner scan2 = new Scanner(System.in);
		String brand = scan2.nextLine();
		System.out.println("How many cores do you have?"); //Asking about cores, this contributes to follow up questions depending on your CPU answer
		Scanner scan3 = new Scanner(System.in);
		Double cores = scan3.nextDouble();
		System.out.println("How big is your ram in MB?"); //Rams effect on the energy
		Scanner scan4 = new Scanner(System.in);
		Double ram = scan4.nextDouble();
		System.out.println("How many gigabytes is your hard disk?"); //The gigs of the hard disk
		Scanner scan5 = new Scanner(System.in);
		Double gigs=scan5.nextDouble();
		System.out.println("Is your hard disk 3.5 or 2.5 inches?"); //The most common types of hard disk sizes and the biggest affect on energy is the size not the GB
		Scanner scan6 = new Scanner(System.in);
		Double hard = scan6.nextDouble();
		System.out.println("Do you live in USA, China, India, Mexico, Canada, Russia, Brazil or Japan?"); //To figure out the cost per KwH where they live
		Scanner scan7 = new Scanner(System.in);
		String country = scan7.nextLine();
		System.out.println("How many years do you expect to keep the computer"); //To help calculate the electricity cost and if the battery will need to be replaced
		Scanner scan8 = new Scanner(System.in);
		Double battery = scan8.nextDouble();
		System.out.println("How many hours a day do you leave computer on?"); //to figure out the energy per day, x 365 is the energy per year
		Scanner scan9 = new Scanner(System.in);
		Double hours = scan9.nextDouble();
		if (computer.equals("laptop")) {
			watts = watts + 30.0;
			System.out.println("Is your laptop screen 11, 12,13, 14, or 15 inches?"); //figuring out the wattage if you havae a laptop
			Scanner scanA = new Scanner(System.in);
			Double laptop = scanA.nextDouble();
			if (laptop == 11){
				watts = watts + 5.0;
			}
			if (laptop == 12){
				watts = watts + 8.1;
			}
			if (laptop == 13){
				watts = watts + 8.6;
			}
			if (laptop == 14){
				watts = watts + 10.0;
			}
			if (laptop == 15){
				watts = watts + 10.0;
			}
		}
		if (computer.equals("desktop")){ //figuring out the wattage if its a desktop and asking for screen size
			System.out.println("Do you have a 21.5 inch desktop, or a 27 inch desktop?");
			Scanner scanB = new Scanner(System.in);
			Double desktop = scanB.nextDouble();
			if (desktop == 21.5){
				watts = watts + 37.5;
			}
			if (desktop == 27){
				watts = watts + 79.0;
			}
		}
		if (brand.equals("Intel")){ //the most common CPUs with the cores and the wattage increases by the number added
			System.out.println("Do you have the Intel Athlon II X4 630, the Intel Core 2 Duo E7500, Intel Core i3 -6300T X2, or Intel Core 2 Quad Q8200?");
			Scanner scanC = new Scanner(System.in);
			String intel = scanC.nextLine();
			if (intel.equals("Intel Athlon II X4 630")){
				watts = watts + 98.0;
			}
			if (intel.equals("Intel Core 2 Duo E7500")){
				watts = watts + 40.8;
			}
			if (intel.equals("Intel Core i3 -6300T X2")){
				watts = watts + 75.0;
			}
			if (intel.equals("Intel Core 2 Quad Q8200")){
				watts = watts + 52.0;
			}
			}
		if (brand.equals("AMD")){ //The most common CPUs with AMD and the wattage depending on the answer
			System.out.println("Do you have the AMD PHENOM™ II X4 925 W, the AMD PHENOM™ X4 9750, or the AMD PHENOM™ II X3 720?");
			Scanner scanD = new Scanner(System.in);
			String amd = scanD.nextLine();
			if (amd.equals("AMD PHENOM™ II X4 925 W")){
				watts = watts + 121.2;
			}
			if (amd.equals("AMD PHENOM™ X4 9750")){
				watts = watts + 126.0;
			}
			if (amd.equals("AMD PHENOM™ II X3 720")){
				watts = watts + 81.6;
			}
		}
		if (hard==3.5){ //wattage depending on the size of the hard disk 
			watts = watts + 192.0;
		}
		if (hard==2.5){
			watts = watts + 12.5;
		}
	    if (country.equals("USA")){ //electricity cost per country
		elec = elec +.1273;
		}
		if (country.equals("China")){
			elec = elec + .08;
		}
		if (country.equals("India")){
			elec = elec +.08;
		}
		if (country.equals("Mexico")){
			elec = elec + .1;
		}
		if (country.equals("Canada")){
			elec = elec + .1;
		}
		if (country.equals("Russia")){
			elec = elec + .11;
		}
		if (country.equals("Brazil")){
			elec = elec + .17;
		}
		if (country.equals("Japan")){
			elec = elec + .26;
		}
		if (battery>=4){ //Saying if the number of years planning on keeping it is great or equal to 4 than you replace the battery
			bCost = bCost + 65;
		}
		System.out.println( "The electric cost per day is " + ((watts/1000) * hours * elec)); //prints the electricity cost per day
		System.out.println("The battery cost is " + bCost); //prints the battery cost
		System.out.println("The cost of the computer is " + purchase); //the original purchase of the computer prints
		System.out.println("The total cost of the computer for "+ battery +" years is "+(bCost+purchase+(((((365*battery)*(watts/1000))*hours)*elec))) ); //the electricity cost for the number of years planned on keeping it, the battery cost, and the original purchase cost all combined
	}
		
}


		
