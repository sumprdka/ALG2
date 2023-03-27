/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Race;

/**
 *
 * @author vyhli
 */
public class RaceApp {
    public static void main(String[] args) {
        Racer prvni = new Racer('M',2002,9,5,0);
        Racer druhy = new Racer('M',2004,9,2,30);
        Racer treti = new Racer('M',2005,9,2,15);
        Race zavod1 = new Race();
        zavod1.AddRacer(treti);
        zavod1.AddRacer(prvni);
        zavod1.AddRacer(druhy);
        zavod1.TableOfWinners();
        String string1 = zavod1.toString();
        System.out.println(string1);
    }
}
