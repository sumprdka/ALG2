/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectProgramming;
/**
 *
 * @author vyhli
 */
public class MoneyBoxApp {
    public static void main(String[] args) {
        MoneyBox firstBox = new MoneyBox("Alice");
        System.out.println(firstBox.getOwner());
        MoneyBox secondBox = new MoneyBox("Bob");
        secondBox.giveNumberOfCrowns(5);
        secondBox.giveNumberOfTwoCrowns(4);
        secondBox.giveOneCoinsAndTwoCoins(2, 3);
        System.out.println(secondBox.getOwner() +" " + secondBox.getNumberOfCrowns() + " " +secondBox.getNumberOfTwoCrowns());
        System.out.println("can he/she afford it = " + secondBox.isEnought(20));
        System.out.println(secondBox.toString());
    }
}
