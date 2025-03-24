import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class HackerRankJaveIfElseApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		int nbr = scan.nextInt();
	        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	      
	        
	        for (int i = 1; i<=nbr; i++) {
	        	if (nbr % 2 != 0) {
	        		System.out.println("Weird");
	        		break;
	        	}
	        	else if(nbr % 2== 0 && nbr < 5) {
	        		System.out.println("Not Weird");
	        		break;
	        	}
	        	else if (nbr % 2 ==0 && nbr<= 20) {
	        		System.out.println("Weird");
	        		break;
	        	}
	        	else if(nbr % 2 == 0 && nbr >20) {
	        		System.out.println("Not Weird");
	        		break;
	        	}
	        	scan.nextLine();
	        	
	        }

	        scan.close();

	}

}
