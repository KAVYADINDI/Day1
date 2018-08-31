import java.util.Scanner;
public class MissingNo {
	public static Scanner scan;
	public static void main(String args [])
	{   
		int i,n,sum;
		scan= new Scanner(System.in);
		System.out.println("Enter the array size: ");
		n=scan.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(i=0;i<n-1;i++)
		{
			array[i]=scan.nextInt();
		}
		sum=(n*(n+1))/2;
		for(i=0;i<n;i++)
		{
			sum=sum-array[i];
		}
		System.out.println("The missing number is "+ sum);
}
}
