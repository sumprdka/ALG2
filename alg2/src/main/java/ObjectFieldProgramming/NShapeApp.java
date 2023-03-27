/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectFieldProgramming;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author vyhli
 */
public class NShapeApp {
    
    public static Scanner sc = new Scanner(System.in);
    private static ArrayList<Point> points = new ArrayList();
    
    public static void main(String[] args) {
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
        p = new Point(x, y);
        points.add(p);
        }
        double perimeter = calculatePerimeter();
        System.out.println(perimeter);
    }
    public static double calculatePerimeter()
    {
        double perimeter = 0;
        for(int i = 0; i < points.size()-1 ; i++)
        {
          perimeter += points.get(i).DistanceFrom(points.get(i+1));
        }
        perimeter += points.get(points.size()-1).DistanceFrom(points.get(0));
        return perimeter;
    }
}
