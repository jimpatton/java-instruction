import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import util.MyConsole;

public class HackerRankAnagreamApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");

	}

	static boolean isAnagram(String a, String b) {
		String lowercaseA = a.toLowerCase();
		char[] aArray = lowercaseA.toCharArray();
		String lowercaseB = b.toLowerCase();
		char[] bArray = lowercaseB.toCharArray();

		Arrays.sort(aArray);
		Arrays.sort(bArray);
		return Arrays.equals(aArray, bArray);
	}
}

//		if (aArray == bArray)
//			return true;
//	}
//		else {
//			return false;
//		}

//		int frequecy = 0;
//			if (aArray.length != bArray.length) {
//				System.out.println("Not Anagram");
	
//				for (int i = 0; i < aArray.length; i++) {
//			
//				if (aArray[i] == bArray[i]) {
//					frequecy++;
//					break;
//				} else {
////					System.out.println("Not Anagram");
//				}
//
//			}
//				return ;

