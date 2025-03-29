import java.util.Scanner;

public class HRJavaIntToStringApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (n = -100;  n <= 100; n++) {
			String s = String.valueOf(n);
			

			if (String.valueOf(n).equals(s)) {
			}
		}
		System.out.println("Good job");
		sc.close();
	}
}
