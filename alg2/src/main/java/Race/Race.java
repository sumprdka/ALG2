/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Race;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author vyhli
 */
public class Race {
    private ArrayList<Racer> Racers = new ArrayList();
    
    public Race(){    
    }
    public void AddRacer(Racer Zavodnik)
    {
        Racers.add(Zavodnik);
    }

    @Override
    public String toString() {
        return "ucastnik: " + Racers ;
    }
    
   /*public class RaceComparator implements Comparator {

        @Override
        public int compare(Object o1,Object o2) {
           return 
        }
       
    }*/
     public void TableOfWinners()
     {
         sortListByAttribute(Racers);
     }
    private void sortListByAttribute(ArrayList<Racer> list) {
    Comparator<Racer> comparator = new Comparator<Racer>() {
        @Override
       public int compare(Racer o1, Racer o2) {
                if (o1.getFinalTime()  > o2.getFinalTime() ) {
                    return 1;
                } else if (o1.getFinalTime()  < o2.getFinalTime() ) {
                    return -1;
                } else {
                    return 0;
                }
            }
    };
    Collections.sort(list, comparator);
}
   /* private ArrayList<Racer> TableOfWinners()
            {
                ArrayList<Racer> Winners = new ArrayList();
                Racer pomocna = Racers.get(0);
                for(int i = 0; i < Racers.size()-1; i++)
                {
                    for(int j = 0; j < Racers.size(); j++)
                {
                    if (Racers.get(j).getFinalTime() > Racers.get(j+1).getFinalTime())
                    {
                        //Sorting algorithm
                    }
                    
                }
                }
                return Racers;
            }
       */     
    
    
}
