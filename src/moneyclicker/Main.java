package moneyclicker;

import java.util.Scanner;
import static moneyclicker.Func.*;
import static moneyclicker.Math.*;

/**
 * @author Danny
 * @author Henning
 */

public class Main {
    
    public static float Geld = 0;
    public static float Geld_Pc_Anfang = 0.5F;
    public static float Geld_Pc = 0;
    
    public static String Item1_Name = "Flasche";
    public static float Item1_Preis = 2;
    public static float Item1_Faktor = 0.2F;
    public static int Item1_Anzahl = 0;
    public static float Item1_Pc_Anfang = 0.05F;
    public static float Item1_Pc = 0;
    
    public static String Item2_Name = "Oma";
    public static float Item2_Preis = 250;
    public static float Item2_Faktor = 0.21F;
    public static int Item2_Anzahl = 0;
    public static float Item2_Pc_Anfang = 3;
    public static float Item2_Pc = 0;
    
    public static String Item3_Name = "Fabrik";
    public static float Item3_Preis = 1000;
    public static float Item3_Faktor = 0.22F;
    public static int Item3_Anzahl = 0;
    public static float Item3_Pc_Anfang = 10;
    public static float Item3_Pc = 0;
    
    public static String Item4_Name = "Bank";
    public static float Item4_Preis = 7500;
    public static float Item4_Faktor = 0.23F;
    public static int Item4_Anzahl = 0;
    public static float Item4_Pc_Anfang = 25;
    public static float Item4_Pc = 0;
    
    public static String Item5_Name = "Drucker";
    public static float Item5_Preis = 25000;
    public static float Item5_Faktor = 0.24F;
    public static int Item5_Anzahl = 0;
    public static float Item5_Pc_Anfang = 50;
    public static float Item5_Pc = 0;
    
    public static String Item6_Name= "Zeitmschine";
    public static float Item6_Preis = 500000;
    public static float Item6_Faktor = 0.25F;
    public static int Item6_Anzahl = 0;
    public static float Item6_Pc_Anfang = 100;
    public static float Item6_Pc = 0;
    
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
                System.out.println(Geld);
                System.out.println("-------------------");
            }else if(Zahl_1 == 1){
                item_kaufen(Item1_Name);
                System.out.println(Item1_Name);
                System.out.println("Anzahl: " + Item1_Anzahl);
                System.out.println("Preis: " + Item1_Preis);
                System.out.println("Pc: " + Item1_Pc);
                System.out.println("-------------------");
            }else if(Zahl_1 == 2){
                item_kaufen(Item2_Name);
                System.out.println(Item2_Name);
                System.out.println("Anzahl: " + Item2_Anzahl);
                System.out.println("Preis: " + Item2_Preis);
                System.out.println("Pc: " + Item2_Pc);
                System.out.println("-------------------");
            }else if(Zahl_1 == 3){
                item_kaufen(Item3_Name);
                System.out.println(Item3_Name);
                System.out.println("Anzahl: " + Item3_Anzahl);
                System.out.println("Preis: " + Item3_Preis);
                System.out.println("Pc: " + Item3_Pc);
                System.out.println("-------------------");
            }else if(Zahl_1 == 4){
                item_kaufen(Item4_Name);
                System.out.println(Item4_Name);
                System.out.println("Anzahl: " + Item4_Anzahl);
                System.out.println("Preis: " + Item4_Preis);
                System.out.println("Pc: " + Item4_Pc);
                System.out.println("-------------------");
            }else if(Zahl_1 == 5){
                item_kaufen(Item5_Name);
                System.out.println(Item5_Name);
                System.out.println("Anzahl: " + Item5_Anzahl);
                System.out.println("Preis: " + Item5_Preis);
                System.out.println("Pc: " + Item5_Pc);
                System.out.println("-------------------");
            }else if(Zahl_1 == 6){
                item_kaufen(Item6_Name);
                System.out.println(Item6_Name);
                System.out.println("Anzahl: " + Item6_Anzahl);
                System.out.println("Preis: " + Item6_Preis);
                System.out.println("Pc: " + Item6_Pc);
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
