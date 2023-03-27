/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectProgramming;

/**
 *
 * @author vyhli
 */
public class Fraction {
    private int citatel = 0;
    private int jmenovatel = 1;
    private String zlomekRetezec = "";
    public Fraction(int citatel,int jmenovatel)
    {
        Kraceni(citatel,jmenovatel);      
    }
     public Fraction(int zlomek)
    {
        this.citatel = zlomek;
    }
     private void Kraceni(int citatel, int jmenovatel)
     {
         int max = (citatel > jmenovatel)?citatel:jmenovatel;
         
        for (int i = 2; i <= (max/2);i++)
        {
            if (citatel == jmenovatel)
         {
             citatel = 1;
             jmenovatel = 1;
             break;
         }
            if (((citatel % i) == 0) && ((jmenovatel % i) == 0))
            {
                citatel = citatel / i;
                jmenovatel = jmenovatel / i;
                i = 2;
                max = (citatel > jmenovatel)?citatel:jmenovatel;
            }
        }
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
     }
      public Fraction(String zlomekRetezec)
    {
       String[] cisla = zlomekRetezec.split("/");
       Kraceni(Integer.parseInt(cisla[0]),Integer.parseInt(cisla[1]));
       /*this.citatel = Integer.parseInt(cisla[0]);
       this.jmenovatel = Integer.parseInt(cisla[1]);
       */
    }

    public int getCitatel() {
        return citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }
    public double getDoubleZlomek() {
        return (citatel/jmenovatel);
    }    
    @Override
      public String toString(){
          if(jmenovatel != 1 )
          {
        return String.format("zlomek je %d/%d",citatel,jmenovatel);
          }
          else 
        return String.format("zlomek je %d",citatel);
    }
    public static void main(String[] args) {
        Fraction zlomek1 = new Fraction(10,8);
        Fraction zlomek2 = new Fraction("5/10");
        Fraction zlomek3 = FractionTools.Soucin(zlomek1, zlomek2);
        Fraction zlomek4 = FractionTools.Podil(zlomek1, zlomek2);
        System.out.println(zlomek1.toString());
         System.out.println(zlomek2.toString());
        System.out.println(zlomek3.toString());
         System.out.println(zlomek4.toString());
        System.out.println(zlomek1.citatel);
        
        
    }
 
}

