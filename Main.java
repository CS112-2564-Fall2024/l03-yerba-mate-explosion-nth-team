import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args)
	{
		ArrayList<CaffeinatedBeverage> inventory = new ArrayList<>();
		// CaffeinatedBeverage[] inventory = new CaffeinatedBeverage[10];
		Scanner keyboard = new Scanner(System.in);
		// Prompt user with options in a loop
		int choice, ounces, brewTemp, count = 0;
		String name;
		double price;
		
		do {
			System.out.println("1) Enter new Tea");
			System.out.println("2) Enter new Yerba Mate");
			System.out.println("3) Exit");
			System.out.print(">>");
			choice = keyboard.nextInt();
			if (choice == 3) {
				printInventory(inventory);
				System.exit(0);
			}
			System.out.print("Enter name      : ");
			name = keyboard.nextLine();
			keyboard.nextLine();
			System.out.print("Enter ounces    : ");
			ounces = keyboard.nextInt();
			System.out.print("Enter price     $ ");
			price = keyboard.nextDouble();
			System.out.print("Enter brew temperature (in Celsius): ");
			brewTemp = keyboard.nextInt();
			System.out.println(choice);
			switch (choice) {
				// Tea
				case 1:
					inventory.add(new Tea(name, ounces, price, brewTemp));
					// inventory[count] = new Tea(name, ounces, price, brewTemp);
					// System.out.println("Your tea order has been added: " + inventory[count]);
					System.out.println("Your tea order has been added: " + inventory.get(count));

					count++;
					break;
				case 2:
					inventory.add(new YerbaMate(name, ounces, price, brewTemp, 0));
					// inventory[count] = new YerbaMate(name, ounces, price, brewTemp, 0);
					System.out.println("Your yerba mate order has been added: " + inventory.get(count));
					// Ask if it the yerba will be refilled

					// Ask if the yerba will be passed. If yes, bump numPasses by 1 and print the
					// toString, if no, print the toString
					count++;
					break;
				// case 3:
				// System.out.println("debug test");
				// System.exit(0);

			}
		} while (choice != 3);

		keyboard.close();
	}

	private static void printInventory(ArrayList<CaffeinatedBeverage> inventory) {

		double average = 0;
		double max = 0;
		for (CaffeinatedBeverage beverage : inventory) {
			System.out.println(beverage);
			average += beverage.getPrice();

			if (beverage.getPrice() > max) {
				max = beverage.getPrice();
			}
		}

		System.out.println("Highest Price: " + max + "\nAverage Price: " + average / inventory.size());
	}
}