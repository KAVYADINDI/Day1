import java.util.*;
public class EqualValuesSeperatedbyDistance {
	public static Scanner scan;
	public static void main(String args [])
	{   
		scan= new Scanner(System.in);
		
		int size,temp=0;
		System.out.println("Enter the array size: ");
		size=scan.nextInt();
		System.out.println("Enter the integers of the array: ");
		int integers[]=new int[size];
		for(int i=0;i<size;i++)
		{
			integers[i]=scan.nextInt();
		}
		System.out.println("Enter an integer 'k' specifying atmost difference: ");
	    int k=scan.nextInt();
	    for(int i=0;i<size;i++)
	    {
	    	temp=integers[i];
	    	for(int j=i+1;j<size;j++)
			{
	    	if(integers[j]==temp)
	    	{
	    		if(Math.abs(j-i)<=k)
	    		{
	    			System.out.println(integers[j]+ " at "+ (i+1)+" , " +(j+1));
	    		}
	    	}
	    		
			}
	}	
}
}
