import java.util.*;
public class NameCount {
	public static Scanner scan;
	public static void main(String args [])
	{   
		scan= new Scanner(System.in);
		String[] users= {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan","Dev","Kity","Meery","Smith","Johnson","Bill","Williams","Jones","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Thomas","Jackson"};
		String name="";
		System.out.print("Enter Name to be searched: ");
		name=scan.nextLine();
		int count=0;
		for (int i=0;i<users.length;i++)
		{
		if (users[i].equals(name)) 
			{
			count++;			
			}
}
		if(count>0)
		{
			System.out.print("Found name: " + name + " Occurence: "+ count);
		}
}
}
