package moneyclicker;

import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
import static moneyclicker.Func.*;
import static moneyclicker.Itemfunc.*;
import static moneyclicker.Confiq.*;

/**
 * @author Danny
 * @author Henning
 */

public class Main {
    
   
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Moneyclicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        frame.setLayout( new FlowLayout() );
 
        JPanel panel = new JPanel();
        JButton geld = new JButton("Geld");
        JButton item1 = new JButton(Item1_Name);
        JButton item2 = new JButton(Item2_Name);
        JButton item3 = new JButton(Item3_Name);
        JButton item4 = new JButton(Item4_Name);
        JButton item5 = new JButton(Item5_Name);
        JButton item6 = new JButton(Item6_Name);
        panel.add( geld );
        panel.add( item1 );
        panel.add( item2 );
        panel.add( item3 );
        panel.add( item4 );
        panel.add( item5 );
        panel.add( item6 );
 
        panel.setPreferredSize( new Dimension( 120, 300 ) );
 
        frame.add( panel );
 
        frame.setSize( 300, 350 );
        frame.setVisible(true);
        
        
        
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
                System.out.println("Geld: " + runden(Geld,2) + "€");
                System.out.println("+ " + runden(Geld_Pc,2) + "€ pro klick");
                System.out.println("-------------------");
                
            }else if(Zahl_1 == 1){
                item_kaufen(Confiq.Item1_Name);
                System.out.println("Anzahl: " + Item1_Anzahl + Confiq.Item1_Name + "n");
                System.out.println("Preis: " + runden(Item1_Preis,2) + "€");
                System.out.println("+ " + runden(Item1_Pc,2) + " pro klick");
                System.out.println("-------------------");
            }else if(Zahl_1 == 2){
                item_kaufen(Confiq.Item2_Name);
                System.out.println("Anzahl: " + Item2_Anzahl + Item2_Name + "s");
                System.out.println("Preis: " + runden(Item2_Preis,2) + "€");
                System.out.println("+ " + Item2_Pc + " pro klick");
                System.out.println("-------------------");
            }else if(Zahl_1 == 3){
                item_kaufen(Confiq.Item3_Name);
                System.out.println("Anzahl: " + Item3_Anzahl + Item3_Name + "en");
                System.out.println("Preis: " + runden(Item3_Preis,2) + "€");
                System.out.println("+ " + Item3_Pc + " pro klick");
                System.out.println("-------------------");
            }else if(Zahl_1 == 4){
                item_kaufen(Confiq.Item4_Name);
                System.out.println("Anzahl: " + Item4_Anzahl + Item4_Name + "en");
                System.out.println("Preis: " + runden(Item4_Preis,2) + "€");
                System.out.println("+ " + Item4_Pc + " pro klick");
                System.out.println("-------------------");
            }else if(Zahl_1 == 5){
                item_kaufen(Confiq.Item5_Name);
                System.out.println("Anzahl: " + Item5_Anzahl + Item5_Name);
                System.out.println("Preis: " + runden(Item5_Preis,2) + "€");
                System.out.println("+ " + Item5_Pc + " pro klick");
                System.out.println("-------------------");
            }else if(Zahl_1 == 6){
                item_kaufen(Confiq.Item6_Name);
                System.out.println("Anzahl: " + Item6_Anzahl + Item6_Name+"n");
                System.out.println("Preis: " + runden(Item6_Preis,2) + "€");
                System.out.println("+ " + Item6_Pc + " pro klick");
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
