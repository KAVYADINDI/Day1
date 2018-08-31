import java.util.*;
public class DiscountCalculation {
	public static Scanner scan;
	public static void main(String args [])
	{   
		scan= new Scanner(System.in);
		 float newItem=0;
		 int discount=35;
		 System.out.println("Enter the price of the new item:");
		 newItem=scan.nextInt();
		 float newItemPrice,discountAmount;
		 discountAmount=discount*newItem/100;
		 newItemPrice=newItem-discountAmount;
		 System.out.println("The new price after discount is: "+ newItemPrice);
}
}
