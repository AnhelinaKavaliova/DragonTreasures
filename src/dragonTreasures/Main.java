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


    }
}
