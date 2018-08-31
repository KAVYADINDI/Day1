import java.util.Scanner;
public class BubbleSort {
	public static Scanner scan;
	public static void main(String args [])
	{   
		scan= new Scanner(System.in);
		int i,j,n;
		int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		n=a.length;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
				}
			}
		}
		System.out.print("Sorted array is: ");
 for(i=0;i<n;i++)
 {
	 System.out.print(a[i]+" ");
 }
}
}
