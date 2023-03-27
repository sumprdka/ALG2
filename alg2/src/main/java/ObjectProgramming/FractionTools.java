/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectProgramming;

/**
 *
 * @author vyhli
 */
public final class FractionTools {

    private FractionTools() {
    }
       
    public static Fraction Soucin(Fraction zlomek1,Fraction zlomek2)
    {
        int jmenovatel = (zlomek1.getJmenovatel() * zlomek2.getJmenovatel());
        int citatel = (zlomek1.getCitatel() * zlomek2.getCitatel());
        Fraction zlomek = new Fraction(citatel,jmenovatel);
        return zlomek;
    }
    public static Fraction Podil(Fraction zlomek1,Fraction zlomek2)
    {
      
        int jmenovatel = (zlomek1.getJmenovatel() * zlomek2.getCitatel());
        int citatel = (zlomek1.getCitatel() * zlomek2.getJmenovatel());
        Fraction zlomek = new Fraction(citatel,jmenovatel);
        return zlomek; 
    }
    public static Fraction Soucet(Fraction zlomek1,Fraction zlomek2)
    {
      
        int jmenovatel = (zlomek1.getJmenovatel() * zlomek2.getJmenovatel());
        int citatel = (zlomek1.getCitatel()*zlomek2.getJmenovatel() + zlomek2.getCitatel()*zlomek1.getJmenovatel());
        Fraction zlomek = new Fraction(citatel,jmenovatel);
        return zlomek; 
    }
    public static Fraction rozdil(Fraction zlomek1,Fraction zlomek2)
    {
      
        int jmenovatel = (zlomek1.getJmenovatel() * zlomek2.getCitatel());
        int citatel = (zlomek1.getCitatel()*zlomek2.getJmenovatel() - zlomek2.getCitatel()*zlomek1.getJmenovatel());
        Fraction zlomek = new Fraction(citatel,jmenovatel);
        return zlomek; 
    }
   /* public static Fraction ZkratitZlomek(Fraction zlomek)
    {
        int citatel = zlomek.getCitatel();
        int jmenovatel = zlomek.getJmenovatel();
        int max = (citatel > jmenovatel)?citatel:jmenovatel;
        for (int i = 0; i <= Math.sqrt(max);i++)
        {
            if (((citatel % i) == 0) && (jmenovatel % i) == 0)
            {
                citatel = citatel / i;
                jmenovatel = jmenovatel / i;
                i = 0;
            }
        }
        Fraction zlomek = (citatel,jmenovatel);
        return zlomek;
    }*/
    

}
