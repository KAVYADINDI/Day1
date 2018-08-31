import java.util.*;
import java.io.*;
public class StringReverse {
	public static Scanner scan;
	public static void main(String args [])throws IOException{
	{ 
		System.out.println("Enter the string: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String abc=br.readLine();
		String[] s=abc.split(" ");
		String rev="";
		for(int i=0;i<s.length;i++)
		{
			for(int j=s[i].length()-1;j>=0;j--) 
			{
				rev=rev+s[i].charAt(j);
			}
			System.out.print(rev + " ");
			rev="";
		}   
	}
}
}
