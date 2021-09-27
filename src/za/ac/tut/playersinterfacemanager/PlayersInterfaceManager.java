/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.playersinterfacemanager;

import java.util.ArrayList;
import java.util.List;
import za.ac.tut.defender.Defender;
import za.ac.tut.goalkeeper.GoalKeeper;
import za.ac.tut.middlefielder.MiddleFielder;
import za.ac.tut.player.Player;
import za.ac.tut.playersdatainterface.PlayersDataInterface;
import za.ac.tut.playersinterface.PlayersInterface;
import za.ac.tut.striker.Striker;

/**
 *
 * @author ELITEBOOK 840
 */
public class PlayersInterfaceManager implements PlayersDataInterface , PlayersInterface {
    public PlayersInterfaceManager(){
    
    }
  
    @Override
    public double determineTotalPayment(List<Player> players, List<Double> payment) {
        double totalPaymt = 0;
        Player player = null;
        Defender defender ;
        Striker striker;
        MiddleFielder middleFielder ;
        GoalKeeper goalKeeper ;
        
        for(int i=0; i<players.size(); i++){
            if(players.get(i) instanceof Defender ){
                defender = (Defender)players.get(i);
            totalPaymt +=  (DEFENDER_BONUS_RATE * defender.getNumberOfGamesPlayed()+ defender.getBasicSalary() );
          
            } else if (players.get(i) instanceof Striker){
                striker = (Striker)players.get(i);
            totalPaymt = (STRIKER_BONUS_RATE * striker.getNumberOfGoalsScored())+ striker.getBasicSalary()  ;
             payment.add(totalPaymt);
            } else if(players.get(i) instanceof MiddleFielder ){
                middleFielder = (MiddleFielder)players.get(i);
             totalPaymt =  (MIDDFIELD_BONUS_RATE * middleFielder.getNumberOfAssits()) + middleFielder.getBasicSalary() ;
              payment.add(totalPaymt);
            } else if (players.get(i) instanceof GoalKeeper){
               goalKeeper = (GoalKeeper)players.get(i);
                totalPaymt =  (GOALKEEPER_BONUS_RATE * goalKeeper.getNumberOfCleanSheets()) + goalKeeper.getBasicSalary() ;
                //store
                 payment.add(totalPaymt);
            }
        
        }
       
        return totalPaymt;
    }

    @Override
    public double determineCosts(List<Double> payment, double totalPaymt) {
        double cost=0;
        for(int i=0; i<payment.size(); i++){
        cost += totalPaymt;
        }
        payment.add(cost);
        
 return cost;
    }

    @Override
    public Striker bestMonthlyStriker(List<Player> players) {
        Striker strikers = null;
        List<Striker> striker = new ArrayList<>();
        //interate through
    for(int i=0; i<players.size(); i++){
        //check
    if(players.get(i) instanceof Player){
        //downcast
    strikers = (Striker)players.get(i);
    //store
    striker.add(strikers);
    }
    }
     //sort and compare strikerAtI and strikerAtL
         for(int i=0; i<striker.size()-1; i++){
         for(int j=i+1; j<striker.size(); j++){
         Striker strikerAtI = (Striker)striker.get(i);
         Striker strikerAtJ= (Striker)striker.get(j);
         //
         int numGoalScoredAtI = strikerAtI.getNumberOfGoalsScored();
         int numGoalScoredAtJ = strikerAtJ.getNumberOfGoalsScored();
         //compare
         if( numGoalScoredAtI > numGoalScoredAtJ){
          //swap
         striker.set(i,  strikerAtJ);
         striker.set(j,  strikerAtI);
         }
         
        
        
         
         }
         }
         
        
     return striker.get(0);
    
    
    
    
    
    }

    @Override
    public double determineSalaries(List<Player> players, List<Double> salaries) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
