/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.player;

/**
 *
 * @author ELITEBOOK 840
 */
public  abstract class Player {
    private String name;
    private double basicSalary;
    
    public Player(){
    this.name = " ";
    this.basicSalary = 0;
     }
    
    public Player(String name, double basicSalary){
    this.name = name;
    this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", basicSalary=" + basicSalary + '}';
    }
    
    
    
    
    
}
