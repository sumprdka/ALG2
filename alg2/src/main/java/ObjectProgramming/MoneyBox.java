/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectProgramming;
/**
 * Represents moneybox
 * @author vyhli
 */
public class MoneyBox {
    private int numberOfCrowns = 0;
    private int numberOfTwoCrowns = 0;
    private String owner;
    
    public MoneyBox(String owner){
        this.owner = owner;
    }
    public MoneyBox(String owner,int numberOfCrowns,int numberOfTwoCrowns){
        this.owner = owner;
        this.numberOfCrowns = numberOfCrowns;
        this.numberOfTwoCrowns =numberOfTwoCrowns;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int sum(){
    return (numberOfCrowns + 2*numberOfTwoCrowns);
    }

    public void giveNumberOfCrowns(int numberOfCrowns) {
        this.numberOfCrowns = this.numberOfCrowns + numberOfCrowns;
    }

    public void giveNumberOfTwoCrowns(int numberOfTwoCrowns) {
        this.numberOfTwoCrowns = this.numberOfTwoCrowns + numberOfTwoCrowns;
    }
    public void giveOneCoinsAndTwoCoins(int numberOfCrowns,int numberOfTwoCrowns){
    this.numberOfCrowns = this.numberOfCrowns + numberOfCrowns;
    this.numberOfTwoCrowns = this.numberOfTwoCrowns + numberOfTwoCrowns;
    }     
    @Override
    public String toString(){
        return String.format("%s ma v pokladnicce %d - %dx1Kc, %dx2Kc. ",owner ,sum(),numberOfCrowns,numberOfTwoCrowns  );
    }
    public boolean isEnought(double prize){      
            return ((numberOfCrowns + 2*numberOfTwoCrowns) >= prize);       
    }

    public int getNumberOfCrowns() {
        return numberOfCrowns;
    }

    public int getNumberOfTwoCrowns() {
        return numberOfTwoCrowns;
    }

    public String getOwner() {
        return owner;
    }
    
    // test
    /*public static void main(String[] args) {
        MoneyBox firstBox = new MoneyBox("Alice");
        System.out.println(firstBox.owner);
        MoneyBox secondBox = new MoneyBox("Bob",2,5);
        System.out.println(secondBox.owner +" " + secondBox.numberOfCrowns + " " +secondBox.numberOfTwoCrowns);
    }*/
}
