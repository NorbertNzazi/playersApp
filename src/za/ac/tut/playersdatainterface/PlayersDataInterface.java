/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.playersdatainterface;

import java.util.List;
import za.ac.tut.player.Player;
import za.ac.tut.striker.Striker;

/**
 *
 * @author ELITEBOOK 840
 */
public interface PlayersDataInterface {
    public double determineSalaries(List<Player>players, List<Double>salaries);
    public double determineCosts(List<Double>salaries, double totalPaymt);
    public Striker bestMonthlyStriker(List<Player>players);
    
}
