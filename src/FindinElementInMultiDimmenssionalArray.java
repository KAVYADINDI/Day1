import java.util.Scanner;
public class FindinElementInMultiDimmenssionalArray {
	public static Scanner scan;
	public static void main (String [] args)
	{
		scan= new Scanner(System.in);
		int n,m,number;
		System.out.println("Enter the array dimmenssions : ");
		n=scan.nextInt();
		m=scan.nextInt();
		int element[][] = new int[n][m];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the elements of " + (i+1)+ " row");
			for(int j=0;j<m;j++)
			{
				element[i][j]= scan.nextInt();
			}
		}
		System.out.println("Enter the number to be searched");
		number=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(element[i][j]==number)
				{
					System.out.println("The number is found at " + i +"-"+j );
				}
			}
		}

}
}
