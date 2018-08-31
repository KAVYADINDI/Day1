import java.util.Scanner;
import java.lang.Math;
public class SiAndCi{
	public static Scanner scan;
	public static void main(String args [])
	{
		float si,ci;
		float p,t,r;
		scan = new Scanner(System.in);
		System.out.print("Enter the principal amount: ");
	     p=scan.nextFloat();
	     System.out.print("Enter the Interest rate per anum: ");
		 r=scan.nextFloat();
		 System.out.print("Enter the time period: ");
		 t=scan.nextFloat();
		    si=(p*t*r)/100;
		    ci=(float) (p*(Math.pow((1+(r/100)),t)))-p;
		    System.out.println("Simple interest is: " + si);
		    System.out.println("Compound interest is: " + ci);
	}
}
