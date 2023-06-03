package dragonTreasures;

import java.util.ArrayList;
import java.util.List;

public class DragonTreasureAdd {
    private List<Treasure> treasures;
    public DragonTreasureAdd(){
        treasures = new ArrayList<>();
    }

    public void addTreasure(Treasure treasure){
        treasures.add(treasure);
    }

    public void viewTreasures(){
        System.out.println("All treasures: ");
        for(Treasure treasure:treasures){
            System.out.println(treasure.getName() + "-$"+ treasure.getCost());
        }
    }

    public void theMostExpensiveTreasure(){
        Treasure highCostTreasure = treasures.get(0);
        for(Treasure treasure: treasures){
            if(highCostTreasure.getCost()<treasure.getCost()){
                highCostTreasure = treasure;
            }
        }
        System.out.print("the most expensive treasure is: "+highCostTreasure.getName() +"-$"+highCostTreasure.getCost());
    }

    public void searchTreasure(double cost){
        int flag = 0;
        for (Treasure treasure:treasures){
            if(treasure.getCost() == cost){
                System.out.println(treasure.getName() + "-$"+treasure.getCost());
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("No treasures found.");
        }

    }
}
