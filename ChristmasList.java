import java.util.Scanner;
public class ChristmasList {

	public static void main(String[] args) {
		//list of each item name
		String[] cList = {"Hats!!!", "Game NBA Men's Hawks Jogger Sweatpants (M)", "SKATER KAERU Classic Tee", "AE AirFlex+ Original Straight Jean", "WILSON Evolution Game Basketball", "MURRAY PEACH NIKE CITY EDITION SWINGMAN (L)", "TRAE YOUNG 2.0 BASKETBALL SHOES (Light Blue)", "Apple Airpods Pro 2nd Gen"};
		Double[] priceList = {20.0, 22.0, 23.0, 30.0, 75.0, 130.0, 140.0, 200.0};
		double sumAmt = 0;
		
		
		//for loop involved in the sumation of all price values
		for (int i=0; i < cList.length; i++) {
			sumAmt += priceList[i];
		} 
		
		//output line (introduction)
		System.out.println("Wassup Family!\n"
				+ "First, please choose your budget for Ryan's Christmas present:\n"
				+ "(entering a budget greater than $640.0 will output the whole list)\n$");
		//Initialization of Scanner Object named "scan"
		Scanner scan = new Scanner(System.in);
		//program asks for input in the form of a Double in order to determine what items can be bought with the balance given
		double amt = scan.nextDouble();
		
		//constraints dependent on balance amount (Keep in mind this program was initially for my family, 
		//so the crude humour is not something I would put in professional code
		if (amt < 20.0) {
			System.out.println("Uh oh! You are too poor to afford my present! Might as well just keep the money at that point, you need"
					+ " it more than me!");
		} else if (amt > sumAmt){
			System.out.println("Order of list low to high in price!");
			System.out.println("-----------------------------------");
			for (int i =0; i < cList.length; i++) {
				System.out.println( cList[i] + " - $" + priceList[i]);
			}
		} else {
		
		
		System.out.println("Calculating...");

		int index =0;
		int maxAmt = 0;
			//for loop which finds the most expensive item that the user can afford on the list. 
		for (int i=0; i < priceList.length; i++) {
			if (amt >= priceList[i]) {
				maxAmt = priceList[i].intValue();
				index = i;
			}
		}
			//with the value of the index location from the for loop, 
			//sets two variables which stores a String of the affordable
			//and maximum priced item as well as a Double which is the amount
			//of money left after purchasing the gift
		String maxPresent = cList[index];
		Double amtLeft = amt -maxAmt;
		
		// cheaper options
		String [] cheaperOptions = new String[index-1];
		String cheap = "";
		if (cheaperOptions.length <1) {
			cheap = " Not enough money to purchase anything else!";
		} else {
			cheap = " Or, you can purchase one of the cheaper options and save some money: ";
			for (int x=0; x < index; x++) {
				cheap = cheap + "\n\n";
				cheap = cheap + (cList[x] + " - $" + priceList[x]);
			}
		}
		
		
		
		
		System.out.println("With a budget of: $" + amt + ", you can buy 1 " + maxPresent+ "\n"
				+ "and be left with $"+ amtLeft + cheap);
		
		
		scan.next();
		
		scan.close();
		}
		
	}
	
		
	

}
