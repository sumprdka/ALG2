/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectProgramming;

/**
 * Represents a point in 2D
 * sablona pro @D 
 * @author vyhli
 */
public class Point {

    //data - clenske promenne, atributy - stavy a vlastnosti (nemenne,menici se)
    private double x;
    private double y;
    //konstruktor, musi mit stejne jmeno jako trida
    public Point(double x, double y) {  
        this.x = x;
        this.y = y;
    }
    //metody ktere pracuji nad daty
    public double Distance(){
        
    return Math.hypot(x, y);
    }
    
    @Override
    //prekryti (override) metody predka
    public String toString(){
        return String.format("x = %.2f, y = %.2f",x ,y );      
      }
    //gettr povoly jen cteni
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    //settr povoly zapisovani, ale narozdil od public promennych, muzu kontrolovat atd. 
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
            
    //testovaci main
    public static void main(String[] args) {
        Point pointA = new Point(3, 4);
        double result = pointA.Distance();
        System.out.println(result);
        System.out.println(pointA); // automaticky vola toString metodu 
    }
}

       