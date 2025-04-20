import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HackerRankPhoneBookMapApp {

	public static void main(String[] args) {
				
		String inputStr = ("3\nuncle sam\n99912222\ntom\n11122222\nharry\n12299933\nuncle sam\nuncle tom\nharry");
		Scanner in = new Scanner(inputStr);
		int n=in.nextInt();
		in.nextLine();
		
		Map <String, Integer> phonebook = new HashMap<String, Integer>();
		
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			phonebook.put(name, phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			if (phonebook.containsKey(s)){
				System.out.println(s + "=" + phonebook.get(s));
				}
			else {
				System.out.println("Not found");
			}
		}
		in.close();
	}

}
