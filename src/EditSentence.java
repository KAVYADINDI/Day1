import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class EditSentence {
	public static Scanner scan;
	public static void main(String args []) throws IOException
	{
		scan= new Scanner(System.in);
		int i;
		System.out.println("Enter the sentence: ");
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String sentence=in.readLine();
		String[] words=sentence.split(" +");
		int length=words.length;
		System.out.println("Word to be deleted: ");
		String deleteWord=scan.nextLine();
		System.out.println("word position in the sentence: ");
		int position=scan.nextInt();
for(i=0;i<length;i++)
		{
	
	if(words[i].equals(deleteWord))	
				{	
					if(i==position-1)
					{
						continue;	
					}	
					System.out.print(words[i]+" ");
				}
	else
	{
		System.out.print(words[i]+" ");
	}
	}
}
}
