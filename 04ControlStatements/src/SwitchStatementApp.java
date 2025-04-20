import java.util.Scanner;

public class SwitchStatementApp {

	public static void main(String[] args) {
		System.out.println("Switch Statements\n");
		Scanner sc = new Scanner(System.in);

		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			System.out.println("MENU:");
			System.out.println("------------");
			System.out.println("Get");
			System.out.println("Add");
			System.out.println("Del");
			System.out.println("Exit");

			System.out.print("Command:");
			command = sc.nextLine();

			switch (command) {
			case "Get":
				System.out.println("Get selected");
				break;
			case "Add":
				System.out.println("Add selected");
				break;
			case "Del":
				System.out.println("Del selected");
				break;
			case "Exit":
				System.out.println("Exit selected");
				break;
			default:
				System.out.println("Invalid command");
				break;

			}

		}

		System.out.println("\nBye");

	}

}
