/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ObjectProgramming;
import java.util.Scanner;
import java.io.ObjectStreamConstants;

/**
 *
 * @author vyhli
 */

public class PointApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Write two coordinates for point");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Point pointA = new Point(x,y);
        double result = pointA.Distance();
        System.out.format("Vzdalenost od pocatku je %.2f", result);
        
        System.out.println("zadej dalsi bod");
        Point pointB = new Point(sc.nextDouble(),sc.nextDouble());
        System.out.println(pointA.Distance());
    }
    
}
