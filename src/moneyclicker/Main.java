package moneyclicker;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        geld.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                geld_addieren();
                System.out.println("Geld: " + runden(Geld,2) + "€");
                System.out.println("+ " + runden(Geld_Pc,2) + "€ pro klick");
            }
        });
        
        item1.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                item_kaufen(Confiq.Item1_Name);
                System.out.println("Anzahl: " + Item1_Anzahl + " " + Confiq.Item1_Name + "n");
                System.out.println("Preis: " + runden(Item1_Preis,2) + "€");
                System.out.println("+ " + runden(Item1_Pc,2) + " pro klick");
                System.out.println("-------------------");
            }
        });
        
        item2.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                item_kaufen(Confiq.Item2_Name);
                System.out.println("Anzahl: " + Item2_Anzahl + " " + Confiq.Item2_Name + "s");
                System.out.println("Preis: " + runden(Item2_Preis,2) + "€");
                System.out.println("+ " + runden(Item2_Pc,2) + " pro klick");
                System.out.println("-------------------");
            }
        });
        
        item3.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                item_kaufen(Confiq.Item3_Name);
                System.out.println("Anzahl: " + Item3_Anzahl + " " + Confiq.Item3_Name + "en");
                System.out.println("Preis: " + runden(Item3_Preis,2) + "€");
                System.out.println("+ " + runden(Item3_Pc,2) + " pro klick");
                System.out.println("-------------------");
            }
        });
        
        item4.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                item_kaufen(Confiq.Item4_Name);
                System.out.println("Anzahl: " + Item4_Anzahl + " " + Confiq.Item4_Name + "en");
                System.out.println("Preis: " + runden(Item4_Preis,2) + "€");
                System.out.println("+ " + runden(Item4_Pc,2) + " pro klick");
                System.out.println("-------------------");
            }
        });
        
        item5.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                item_kaufen(Confiq.Item5_Name);
                System.out.println("Anzahl: " + Item5_Anzahl + " " + Confiq.Item5_Name);
                System.out.println("Preis: " + runden(Item5_Preis,2) + "€");
                System.out.println("+ " + runden(Item5_Pc,2) + " pro klick");
                System.out.println("-------------------");
            }
        });
        
        item1.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                item_kaufen(Confiq.Item1_Name);
                System.out.println("Anzahl: " + Item1_Anzahl + " " + Confiq.Item1_Name + "n");
                System.out.println("Preis: " + runden(Item1_Preis,2) + "€");
                System.out.println("+ " + runden(Item1_Pc,2) + " pro klick");
                System.out.println("-------------------");
            }
        });
        
        item6.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                item_kaufen(Confiq.Item6_Name);
                System.out.println("Anzahl: " + Item6_Anzahl + " " + Confiq.Item6_Name + "n");
                System.out.println("Preis: " + runden(Item6_Preis,2) + "€");
                System.out.println("+ " + runden(Item6_Pc,2) + " pro klick");
                System.out.println("-------------------");
            }
        });


        
        
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
            if(Zahl_1 == 9){
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
