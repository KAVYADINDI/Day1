import java.util.*;
public class Duplicates {
	public static Scanner scan;
	public static void main(String args [])
	{   
		scan= new Scanner(System.in);
	String input="";
	char a;
	System.out.print("Enter the string: ");
	input=scan.nextLine();
	//System.out.print(input);
	int n=input.length();
	for(int i=0;i<n;i++)
	{
		a=input.charAt(i);
		for(int j=i+1;j<n;j++)
		{
			if(input.charAt(j)==a) {
			char[] array=input.toCharArray();
			array[j]=' ';
			input=String.valueOf(array);
			}
		}
	
    }
	//System.out.println(array[]);
	for(int i=0;i<n;i++)
	{
		
	if(input.charAt(i)!=' ')
	{
	System.out.print(input.charAt(i));
	}
}
	}
}
