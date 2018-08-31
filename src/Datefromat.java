import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Datefromat {
	public static void main(String args []) throws IOException
	{     
		int m;
		String s="";
		System.out.print("Enter the date(DD,MM,YYYY): ");
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String abc=in.readLine();
		String[] date=abc.split(",");		
	 m=Integer.parseInt(date[1]);
		switch(m)
		{

		case 1 : s="January"; break;
		case 2 : s="February"; break;
		case 3 : s="March"; break;
		case 4 : s="April"; break;
		case 5 : s="May"; break;
		case 6 : s="June"; break;
		case 7 : s="July"; break;
		case 8 : s="August"; break;
		case 9 : s="September"; break;
		case 10 : s="October"; break;
		case 11 : s="November"; break;
		case 12 : s="December"; break;
		}
		System.out.print(date[0]+"/"+s+"/"+date[2]);
		
	}
	
	
}
