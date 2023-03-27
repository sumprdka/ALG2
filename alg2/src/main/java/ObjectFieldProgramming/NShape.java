/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectFieldProgramming;
import java.util.ArrayList;

/**
 *
 * @author vyhli
 */
public class NShape {
   private ArrayList<Point> points = new ArrayList();

    public NShape() {
    }
    public void addPoint(Point p){
       points.add(p);
    }
    public void addPoint(double x, double y){
       Point p = new Point(x,y);
       points.add(p);
    }
    public double calculatePerimeter(){
        double perimeter = 0;
        for(int i = 0; i < points.size()-1 ; i++)
        {
          perimeter += points.get(i).DistanceFrom(points.get(i+1));
        }
        perimeter += points.get(points.size()-1).DistanceFrom(points.get(0));
        return perimeter;
    }
    public Point getClosestPoint(){
     //double distance = 0;
     Point min = points.get(0);
     for(int i = 1; i < points.size(); i++)
        { 
               //distance = (distance < points.get(i).Distance())? distance : points.get(i).Distance();
        if (min.Distance() > points.get(i).Distance())
        {
            min = points.get(i);
        }
        }
     return min;
    }

    @Override
    public String toString() {
        return "NShape{" + "points=" + points + '}';
    }
    
    public ArrayList<Point> getPoints() {
        return (ArrayList)points.clone();
    }
    
    
}
