/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.striker;

import za.ac.tut.player.Player;

/**
 *
 * @author ELITEBOOK 840
 */
public class Striker extends Player {
    private int numberOfGoalsScored;
    
    public Striker(){
    this.numberOfGoalsScored = 1;
    }
    
    public Striker(String name, double basicSalary, int numberOfGoalsScored){
    super(name, basicSalary);
    this.numberOfGoalsScored= numberOfGoalsScored;
    }
    
    

    public int getNumberOfGoalsScored() {
        return numberOfGoalsScored;
    }

    public void setNumberOfGoalsScored(int numberOfGoalsScored) {
        this.numberOfGoalsScored = numberOfGoalsScored;
    }

    @Override
    public String toString() {
        return super.toString() +  "Striker{" + "numberOfGoalsScored=" + numberOfGoalsScored + '}';
    }
    
    
    
    
    
    
    
}
