package dragonTreasures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DragonTreasureAdd app = new DragonTreasureAdd();
        System.out.print("Enter how much treasures you want to add: ");
        int countTreasures = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0, k =1; i < countTreasures; i++, k++){
            System.out.print("Enter the name of the "+k+" treasure: ");
            String name = scanner.nextLine();
            System.out.print("Enter the cost of the "+k+" treasure: ");
            double cost = scanner.nextDouble();
            scanner.nextLine();
            app.addTreasure(new Treasure(name, cost));
        }

        int choice = -1;

        while (choice != 0) {
            System.out.println("Dragon's Treasure App Menu");
            System.out.println("1. View all treasures");
            System.out.println("2. Find the most valuable treasure");
            System.out.println("3. Find treasures with a specific value");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    app.viewTreasures();
                    break;
                case 2:
                    app.theMostExpensiveTreasure();
                    break;
                case 3:
                    System.out.print("Enter the value to search for: ");
                    double value = scanner.nextDouble();
                    scanner.nextLine();
                    app.searchTreasure(value);
                    break;
                case 0:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
