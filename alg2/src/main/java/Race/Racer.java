/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Race;
import java.util.Comparator;
/**
 *
 * @author vyhli
 */
public class Racer {
    //private double timeStart;
    private char gender = 'M';
    //private double timeFinish;
    private final int birth;
    private int number = 100;
    private int timeStart = 9*60*60;
    private int timeFinish;
    private int finalTime;
    private int hours;
    private int minutes;
    private int seconds;
    public Racer(char gender,int birth,int hours,int minutes,int seconds) {
        this.birth = birth;
        this.hours = hours;
        this.seconds = seconds;
        this.minutes = minutes;
        this.gender = gender;
        this.number = number+1;
        this.timeStart = timeStart + 2*60;
        this.timeFinish = timeStart + (hours * 60 * 60)+ minutes *60+seconds;
        this.finalTime = calculateFinalTimeInSeconds();                      
    }
    private int calculateFinalTimeInSeconds()
    {
        return timeFinish - timeStart;
    }

    public int getFinalTime() {
        return finalTime;
    }
   /*public abstract class RaceComparator implements Comparator {

        public int compare(Racer o1,Racer o2) {
           return (int) o1.getFinalTime();
        }
       
    }*/
    
    @Override
    public String toString() {
        String pohlavi = "muz";
        if (gender == 'W'){
            pohlavi = "zena";
        }
        return String.format("Zavodnik je %s narozena roku %d s vyslednym casem %d:%d:%d s cislem %d",pohlavi,birth,hours,minutes,seconds,number);
       
    }
}
