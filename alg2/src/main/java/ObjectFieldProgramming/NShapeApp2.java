/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectFieldProgramming;

import static ObjectFieldProgramming.NShapeApp.sc;
import java.util.ArrayList;

public class NShapeApp2 {
    
    public static void main(String[] args) {
        NShape shape = new NShape();
        System.out.println("Zadej pocet bodu");
        int n = sc.nextInt();
        System.out.println("Zadej body:");
        double x;
        double y;
        Point p;
        for(int i = 1; i <= n ; i++)
        {
        x = sc.nextDouble();
        y = sc.nextDouble();
        shape.addPoint(x,y);
        }
        double perimeter = shape.calculatePerimeter();
        System.out.println(perimeter);
        
        ArrayList<Point> myPoints = shape.getPoints();
        myPoints.add(new Point(0,0));
    }
    }
    

