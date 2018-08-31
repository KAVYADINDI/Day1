import java.util.Scanner;
public class LinearSearch {
	public static Scanner scan;
	public static void main(String args [])
	{   
		scan= new Scanner(System.in);
		int num;
		int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.print("Value to be searched is: ");
		num = scan.nextInt();
		for(int i=0;i<=14;)
		{
			if(a[i]==num)
			{
		   System.out.print(num+" is in the array");
		   break;
			}
			else
			{
				System.out.print(num+" is in not the array");
				break;
			}
		}
	}
}
