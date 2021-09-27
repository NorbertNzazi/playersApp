/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.goalkeeper;

import za.ac.tut.player.Player;

/**
 *
 * @author ELITEBOOK 840
 */
public class GoalKeeper extends Player {
    private int numberOfCleanSheets;
    
    public GoalKeeper(){
    this.numberOfCleanSheets = 1; 
    }
    
    public GoalKeeper(String name, double basicSalary, int numberOfCleanSheets){
    super(name, basicSalary);
    this.numberOfCleanSheets = numberOfCleanSheets;
    }

    public int getNumberOfCleanSheets() {
        return numberOfCleanSheets;
    }

    public void setNumberOfCleanSheets(int numberOfCleanSheets) {
        this.numberOfCleanSheets = numberOfCleanSheets;
    }

    @Override
    public String toString() {
        return super.toString() + "GoalKeeper{" + "numberOfCleanSheets=" + numberOfCleanSheets + '}';
    }
    
    
    
    
}
