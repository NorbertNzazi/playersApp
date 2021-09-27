/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.middlefielder;

import za.ac.tut.player.Player;

/**
 *
 * @author ELITEBOOK 840
 */
public class MiddleFielder extends Player {
    private int numberOfAssits;
    
    public MiddleFielder(){
    this.numberOfAssits = 1;
   
    }
    
    public MiddleFielder(String name, double basicSalary, int numberOfAssits){
    super(name, basicSalary);
    }

    public int getNumberOfAssits() {
        return numberOfAssits;
    }

    public void setNumberOfAssits(int numberOfAssits) {
        this.numberOfAssits = numberOfAssits;
    }

    @Override
    public String toString() {
        return super.toString() + "MiddleFielder{" + "numberOfAssits=" + numberOfAssits + '}';
    }
    
    
    
    
}
