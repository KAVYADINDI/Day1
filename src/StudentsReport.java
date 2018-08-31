import java.util.Scanner;
public class StudentsReport {
	
	public static Scanner scan;
	public static void main (String [] args)
	{
		scan= new Scanner(System.in);
		int marks[][] = new int[3][3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the marks for student " + (i+1));
			for(int j=0;j<3;j++)
			{
				marks[i][j]= scan.nextInt();
			}
		}
        int stdavg[]= new int[3];
	    int subavg[]= new int[3];
	    int stdtotal[]=new int[3];
	    int subtotal[]=new int[3];
	    for(int i=0;i<3;i++)
	    {
	    	for(int j=0;j<3;j++)
	    	{
	    		subtotal[j]= subtotal[j] + marks[i][j];
	    	}
	    }
	    for (int i=0;i<3;i++) {
	    	System.out.println("Total Subject marks in subj " + (i+1)+" is "+subtotal[i]);
	    	subavg[i]=subtotal[i]/3;
	    	System.out.println("Averagemarks in subject " +(i+1)+" is "+ subavg[i]);
	    }
	    for(int i=0;i<3;i++)
	    {
	    	for(int j=0;j<3;j++)
	    	{
	    		stdtotal[i]= stdtotal[i]+ marks[i][j];
	    	}
	    }
	    for(int i=0;i<3;i++)
	    {
	    	System.out.println("Total marks of student " + (i+1)+" is "+stdtotal[i]);
	    	stdavg[i]=stdtotal[i]/3;
	    	System.out.println("Averagemarks of student " +(i+1)+" is "+ stdavg[i]);

	    }
	}
	}