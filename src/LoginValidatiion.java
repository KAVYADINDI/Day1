import java.util.Scanner;
public class LoginValidatiion 
{
	public static Scanner scan;
	public static void main(String args [])
	{   
		scan= new Scanner(System.in);
		String[] users= {"kavya","mahanvi","lahari"};
		String[] password= {"111","222","333"};
		String user,psswd;
		int count=0;
		while(count<3) 
		 {
			System.out.print("Enter user name");
			user=scan.nextLine();
			System.out.print(user);
			System.out.print("Enter password");
			psswd=scan.nextLine();
			for (int i=0;i<users.length;i++)
			{
			if (users[i].equals(user) && password[i].equals(psswd)) 
				{
					System.out.print("Welcome!");return;
				}
				
			}
			count++;
		}
		
	if (count==3)
	{
		System.out.print("Contact Admin");
	} 
}
}
