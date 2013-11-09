package moneyclicker;

import java.util.Scanner;
import static moneyclicker.Func.*;
import static moneyclicker.Itemfunc.*;

/**
 * @author Danny
 * @author Henning
 */

public class Main {
    
   
    public static void main(String[] args) {
        
        //Funktion zum Testen der Funktionen
        //Im Prinzip ein Consolen basiertes Game
        int i=0;
        while(i<999){
            System.out.println("-------------------");
            Scanner scan=new Scanner(System.in);
            System.out.println("0=Klick, 1=Flasche, 2=Oma, ...");
            double Zahl_1= scan.nextDouble();
  
            System.out.println("-------------------");
            if(Zahl_1 == 0){
                geld_addieren();
                System.out.println("Geld: "+Confiq.Geld+"€");
                System.out.println("+ " + runden(Confiq.Geld_Pc,2)+"€ pro klick");
                System.out.println("-------------------");
                
            }else if(Zahl_1 == 1){
                item_kaufen(Confiq.Item1_Name);
                System.out.println("Anzahl: " + Confiq.Item1_Anzahl+Confiq.Item1_Name+"n");
                System.out.println("Preis: " + Confiq.Item1_Preis+"€");
                System.out.println("+ " + Confiq.Item1_Pc +" pro klick");
                System.out.println("-------------------");
            }else if(Zahl_1 == 2){
                item_kaufen(Confiq.Item2_Name);
                System.out.println("Anzahl: " + Confiq.Item2_Anzahl+Confiq.Item2_Name+"s");
                System.out.println("Preis: " + Confiq.Item2_Preis+"€");
                System.out.println("+ " + Confiq.Item2_Pc +" pro klick");
                System.out.println("-------------------");
            }else if(Zahl_1 == 3){
                item_kaufen(Confiq.Item3_Name);
                System.out.println("Anzahl: " + Confiq.Item3_Anzahl+Confiq.Item3_Name+"en");
                System.out.println("Preis: " + Confiq.Item3_Preis+"€");
                System.out.println("+ " + Confiq.Item3_Pc +" pro klick");
                System.out.println("-------------------");
            }else if(Zahl_1 == 4){
                item_kaufen(Confiq.Item4_Name);
                System.out.println("Anzahl: " + Confiq.Item4_Anzahl+Confiq.Item4_Name+"en");
                System.out.println("Preis: " + Confiq.Item4_Preis+"€");
                System.out.println("+ " + Confiq.Item4_Pc +" pro klick");
                System.out.println("-------------------");
            }else if(Zahl_1 == 5){
                item_kaufen(Confiq.Item5_Name);
                System.out.println("Anzahl: " + Confiq.Item5_Anzahl+Confiq.Item5_Name);
                System.out.println("Preis: " + Confiq.Item5_Preis+"€");
                System.out.println("+ " + Confiq.Item5_Pc +" pro klick");
                System.out.println("-------------------");
            }else if(Zahl_1 == 6){
                item_kaufen(Confiq.Item6_Name);
                System.out.println("Anzahl: " + Confiq.Item6_Anzahl+Confiq.Item6_Name+"n");
                System.out.println("Preis: " + Confiq.Item6_Preis+"€");
                System.out.println("+ " + Confiq.Item6_Pc +" pro klick");
                System.out.println("-------------------");
            }else if(Zahl_1 == 9){
                save("save1.csv");
            }else if(Zahl_1 == 8){
                open("save1.csv");
            }else{
                delete_save("save1.csv");
            }
            i++;
        }
    }
    
}
