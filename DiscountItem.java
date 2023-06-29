/*
 * Develop a program which requests a price of an item, item number, item title 
 * and a discount percent from the user which should represent the percentage 
 * that would be discounted from the item.
 * 
 * The program should then display the following :
 * - Original price of the item
 * - The discounted amount
 * - The amount the customer must pay.
 */
import java.util.Scanner;

public class DiscountItem {
	public static double price = 0;
	
	public static void main(String[] args) {
		System.out.println("JAV745 Winter 2023 Rady Dimitroff 059742122");
		String itemNumber = "";
		String itemTitle = "";
		double discount = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the item price: ");
		if(sc.hasNextDouble()) {
			price = sc.nextDouble();
		}
		System.out.printf("Price as a double: %.3f\n", price);
		
		System.out.printf("Enter the item number: ");
		if(sc.hasNext()) {
			itemNumber = sc.next();
			sc.nextLine();
		}
		
		System.out.print("Please enter the item title: ");
		if(sc.hasNext()) {
			itemTitle = sc.nextLine();
			//sc.nextLine();
		}
		
		System.out.print("Discount as a percent: ");
		if(sc.hasNext()) {
			discount = sc.nextDouble();
			sc.nextLine();
		}
		
		discount = discount / 100.00;
		System.out.printf("Original price of [%s] with item code [%s], is $%.2f\n", itemTitle, itemNumber, price);
		System.out.printf("The discounted amount is: %.2f\n", (price*discount) );
		System.out.printf("The customer must pay: %.2f\n", price - (price*discount) );
	}
}
