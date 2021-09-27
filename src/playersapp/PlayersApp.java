/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playersapp;

import java.util.ArrayList;
import java.util.List;
import za.ac.tut.defender.Defender;
import za.ac.tut.goalkeeper.GoalKeeper;
import za.ac.tut.middlefielder.MiddleFielder;
import za.ac.tut.player.Player;
import za.ac.tut.playersinterfacemanager.PlayersInterfaceManager;
import za.ac.tut.striker.Striker;

/**
 *
 * @author ELITEBOOK 840
 */
public class PlayersApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables
        List<Player>players = new ArrayList<>();
        List<Double>payment = new ArrayList<>();
        double   totalPaymt=0 , costs = 0;
       
    
   
        
        //creating object of classes
        Player defender = new Defender("Norbert", 1000, 50);
        Player defender2 = new Defender("Norbert", 1000, 50);
        Player striker =    new Striker("Mpho", 1500, 25);
        Player striker2 =    new Striker("Zuma", 1200, 10);
        Player goalkeeper = new GoalKeeper("po", 1250, 5);
        Player middleFielder = new MiddleFielder("Paci", 800, 3);
        Player middleFielder2 = new MiddleFielder("Paci", 800, 3);
        
        //adding object in the array
        players.add(defender);
        players.add(striker);
        players.add(goalkeeper);
        
        //invoking processor methods
        PlayersInterfaceManager pim = new PlayersInterfaceManager();
        
        totalPaymt=pim.determineTotalPayment(players, payment);
        
        costs = pim.determineCosts(payment, totalPaymt);
        
        System.out.println("The payment is " + totalPaymt + "\n" + 
                                    "The total cost is " + costs + "\n");
        
        display(players, payment);
      
            }
            
   public static  void display(List<Player>players,  List<Double>payment){
      //variables
      int  numberOfGoalsScored ;
      String name = " ", info = " ";
      Striker striker;
       
       
            for(int x=0 ; x<players.size(); x++){ 
                if(players.get(x) instanceof Striker){
                striker= (Striker)players.get(x);
                numberOfGoalsScored = striker.getNumberOfGoalsScored();
                        //get name
                        name = striker.getName();
                        info = info +  "The best striker is " + name  + " and "  + " with "  + "\n" + numberOfGoalsScored + " number of goals scored";
                        
            }
}
         
             System.out.println(info);

}
}
