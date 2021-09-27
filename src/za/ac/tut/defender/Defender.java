/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.defender;

import za.ac.tut.player.Player;

/**
 *
 * @author ELITEBOOK 840
 */
public class Defender extends Player{
    private int numberOfGamesPlayed;
    
    public Defender(){
    this.numberOfGamesPlayed= 1;
    }
    
    public Defender(String name, double basicSalary, int numberOfGamesPlayed ){
    super(name , basicSalary);
    this.numberOfGamesPlayed= numberOfGamesPlayed;
    }

    public int getNumberOfGamesPlayed() {
        return numberOfGamesPlayed;
    }
    
    public void setNumberOfGamesPlayed(int numberOfGamesPlayed){
    this.numberOfGamesPlayed= numberOfGamesPlayed;
    }

    @Override
    public String toString() {
        return super.toString() + "Defender{" + "numberOfGamesPlayed=" + numberOfGamesPlayed + '}';
    }
    
    
    
    
}
