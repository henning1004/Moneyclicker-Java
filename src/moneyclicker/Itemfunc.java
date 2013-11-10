package moneyclicker;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static moneyclicker.Confiq.*;
import static moneyclicker.Func.delete_save;
import static moneyclicker.Func.open;
import static moneyclicker.Func.reset;
import static moneyclicker.Func.save;
import static moneyclicker.Main.*;

/**
* @author Henning
*/

public class Itemfunc {
    
    public static JPanel panel0;
    public static JPanel panel1;
    public static JPanel panel2;
    public static JPanel panel3;
    public static JPanel panel4;
    public static JButton geld_button;
    public static JButton item1;
    public static JButton item2;
    public static JButton item3;
    public static JButton item4;
    public static JButton item5;
    public static JButton item6;
    public static JButton save;
    public static JButton open;
    public static JButton delete;
    public static JButton reset;
    public static JLabel geld_label;
    public static JLabel geldpc_label;
    
    
    public static void gui(){
        // MAINFRAME
        final JFrame mainFrame = new JFrame("Moneyclicker");
        mainFrame.getContentPane().setBackground(Color.WHITE);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        
        mainFrame.setSize( 1366, 768 );
        mainFrame.setLayout(new FlowLayout(50,150,1));
        mainFrame.setResizable(true);
        
      // PANEL 0
        panel0 = new JPanel();
        panel0.setBackground(Color.WHITE);
        panel0.setPreferredSize(new Dimension(1050, 70));
        
      // PANEL 1
        panel1  = new JPanel();
        panel1.setBackground(Color.WHITE);
        panel1.setPreferredSize(new Dimension(1050, 300));
        
        ImageIcon geld_bild = new ImageIcon("src/images/1c.png");
        geld_button  = new JButton (geld_bild);  
        geld_button.setOpaque(false);
        geld_button.setContentAreaFilled(false);
        geld_button.setBorderPainted(false); 
        panel1.add(geld_button);
        
        geld_label = new JLabel ();
        geld_label.setText(new Double(Geld).toString() + "€");
        panel1.add(geld_label);
        
        geldpc_label = new JLabel ();
        geldpc_label.setText("pro Klick: " + new Double(Geld_Pc).toString() + "€");
        panel1.add(geldpc_label);
        
        
        
      // PANEL 2
        panel2 = new JPanel();
        panel2.setBackground(Color.WHITE);
        panel2.setPreferredSize(new Dimension(1050, 150));
        
        ImageIcon flasche_bild = new ImageIcon("src/images/flasche.png");
        item1 = new JButton(flasche_bild);  
        item1.setSize(200 ,200);
        item1.setOpaque(false);
        item1.setContentAreaFilled(false);
        item1.setBorderPainted(false); 
        panel2.add( item1 );
        
        ImageIcon oma_bild = new ImageIcon("src/images/oma.png");
        item2 = new JButton(oma_bild); 
        item2.setOpaque(false);
        item2.setContentAreaFilled(false);
        item2.setBorderPainted(false); 
        panel2.add( item2 );
        
        ImageIcon fabrik_bild = new ImageIcon("src/images/fabrik.png");
        item3 = new JButton(fabrik_bild);  
        item3.setOpaque(false);
        item3.setContentAreaFilled(false);
        item3.setBorderPainted(false); 
        panel2.add( item3 );
        
        ImageIcon bank_bild = new ImageIcon("src/images/bank.png");
        item4 = new JButton(bank_bild);  
        item4.setOpaque(false);
        item4.setContentAreaFilled(false);
        item4.setBorderPainted(false); 
        panel2.add( item4 );
        
        ImageIcon drucker_bild = new ImageIcon("src/images/Drucker.png");
        item5 = new JButton(drucker_bild);   
        item5.setOpaque(false);
        item5.setContentAreaFilled(false);
        item5.setBorderPainted(false); 
        panel2.add( item5 );
        
        ImageIcon zeitmaschine_bild = new ImageIcon("src/images/zeitmaschine.png");
        item6 = new JButton(zeitmaschine_bild);   
        item6.setOpaque(false);
        item6.setContentAreaFilled(false);
        item6.setBorderPainted(false); 
        panel2.add( item6 );
      
      // PANEL 3
        panel3 = new JPanel();
        panel3.setBackground(Color.WHITE);
        panel3.setPreferredSize(new Dimension(1050, 50));
        
        save  = new JButton("Speichern");  
        panel3.add( save );
        open  = new JButton("Laden");      
        panel3.add( open );
        delete= new JButton("Löschen");     
        panel3.add( delete );
        
      // PANEL 4
        panel4 = new JPanel();
        panel4.setBackground(Color.WHITE);
        panel4.setPreferredSize(new Dimension(1050, 150));
        
        ImageIcon reset_bild = new ImageIcon("src/images/reset.jpg");
        reset = new JButton(reset_bild);
        reset.setOpaque(false);
        reset.setContentAreaFilled(false);
        reset.setBorderPainted(false); 
        panel4.add( reset );
        
        mainFrame.add( panel0 );
        mainFrame.add( panel1 ); 
        mainFrame.add( panel2 );
        mainFrame.add( panel3 );
        mainFrame.add( panel4 );
        mainFrame.setVisible(true);
    }
    
    public static void action(){
        // ActionListener
        geld_button.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                geld_addieren();
                System.out.println("Geld: " + runden(Geld,2) + "€"+ " (+ " + runden(Geld_Pc,2) + "€ pro klick)");
            }
        });
        
        item1.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                item_kaufen(Confiq.Item1_Name);
                System.out.println("Anzahl: " + Item1_Anzahl + " " + Confiq.Item1_Name + "n"+ " (+ " + runden(Item1_Pc,2) + " pro klick)");
                System.out.println("Preis: " + runden(Item1_Preis,2) + "€");
            }
        });
        
        item2.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                item_kaufen(Confiq.Item2_Name);
                System.out.println("Anzahl: " + Item2_Anzahl + " " + Confiq.Item2_Name + "s"+" (+ " + runden(Item2_Pc,2) + " pro klick)");
                System.out.println("Preis: " + runden(Item2_Preis,2) + "€");
               
            }
        });
        
        item3.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                item_kaufen(Confiq.Item3_Name);
                System.out.println("Anzahl: " + Item3_Anzahl + " " + Confiq.Item3_Name + "en"+" (+ " + runden(Item3_Pc,2) + " pro klick)");
                System.out.println("Preis: " + runden(Item3_Preis,2) + "€");
            }
        });
        
        item4.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                item_kaufen(Confiq.Item4_Name);
                System.out.println("Anzahl: " + Item4_Anzahl + " " + Confiq.Item4_Name + "en"+" (+ " + runden(Item4_Pc,2) + " pro klick)");
                System.out.println("Preis: " + runden(Item4_Preis,2) + "€");
            }
        });
        
        item5.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                item_kaufen(Confiq.Item5_Name);
                System.out.println("Anzahl: " + Item5_Anzahl + " " + Confiq.Item5_Name+" (+ " + runden(Item5_Pc,2) + " pro klick)");
                System.out.println("Preis: " + runden(Item5_Preis,2) + "€");
            }
        });
        
        item6.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                item_kaufen(Confiq.Item6_Name);
                System.out.println("Anzahl: " + Item6_Anzahl + " " + Confiq.Item6_Name + "n"+" (+ " + runden(Item6_Pc,2) + " pro klick)");
                System.out.println("Preis: " + runden(Item6_Preis,2) + "€");
            }
        });
        
        save.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                save("save1.csv");
            }
        });
        
        open.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                open("save1.csv");
            }
        });
        
        delete.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                delete_save("save1.csv");
            }
        });
        
        reset.addActionListener( new ActionListener() { 
            @Override
            public void actionPerformed( ActionEvent e ) { 
                reset();
            }
        });
    }
    
    public static double pc_berechnen(){
        itempc_berechnen(Item1_Name);
        itempc_berechnen(Item2_Name);
        itempc_berechnen(Item3_Name);
        itempc_berechnen(Item4_Name);
        itempc_berechnen(Item5_Name);
        itempc_berechnen(Item6_Name);
        Geld_Pc = Geld_Pc_Anfang + Item1_Pc + Item2_Pc + Item3_Pc + Item4_Pc + Item5_Pc + Item6_Pc;
        return Geld_Pc;
    }
    
    public static double geld_addieren(){        
        pc_berechnen();
        Geld += Geld_Pc;
        return Geld;
    }
    
    public static double itempreis_berechnen(String Item_Name){
            if(Item_Name.equals(Item1_Name)){
                Item1_Preis = Item1_Preis + (Item1_Preis * Item1_Faktor);
                return Item1_Preis;
            }
            else if(Item_Name.equals(Item2_Name)){
                Item2_Preis = Item2_Preis + (Item2_Preis * Item2_Faktor);
                return Item2_Preis;
            }
            else if(Item_Name.equals(Item3_Name)){
                Item3_Preis = Item3_Preis + (Item3_Preis * Item3_Faktor);
                return Confiq.Item3_Preis;
            }
            else if(Item_Name.equals(Item4_Name)){
                Item4_Preis = Item4_Preis + (Item4_Preis * Item4_Faktor);
                return Confiq.Item4_Preis;
            }
            else if(Item_Name.equals(Item5_Name)){
                Item5_Preis = Item5_Preis + (Item5_Preis * Item5_Faktor);
                return Item5_Preis;
            }
            else{
                Item6_Preis = Item6_Preis + (Item6_Preis * Item6_Faktor);
                return Item6_Preis;
            }

    }
    
    public static boolean item_kaufen(String Item_Name){
            if(Item_Name.equals(Item1_Name)){
                if(Geld>=Item1_Preis){
                    Item1_Anzahl++;
                    Geld-=Item1_Preis;
                }
                else{
                    return false;
                }
            }
            else if(Item_Name.equals(Item2_Name)){
                if(Geld>=Item2_Preis){
                    Item2_Anzahl++;
                    Geld-=Item2_Preis;
                }
                else{
                    return false;
                }
            }
            else if(Item_Name.equals(Item3_Name)){
                if(Geld>=Item3_Preis){
                    Item3_Anzahl++;
                    Geld-=Item3_Preis;
                }
                else{
                    return false;
                }
            }
            else if(Item_Name.equals(Item4_Name)){
                if(Geld>=Item4_Preis){
                    Item4_Anzahl++;
                    Geld-=Item4_Preis;                    
                }
                else{
                    return false;
                }
            }
            else if(Item_Name.equals(Item5_Name)){
                if(Geld>=Item5_Preis){
                    Item5_Anzahl++;
                    Geld-=Item5_Preis;
                }
                else{
                    return false;
                }
            }
            else{
                if(Geld>=Item6_Preis){
                    Item6_Anzahl++;
                    Geld-=Item6_Preis;
                }
                else{
                    return false;
                }
            }
            itempreis_berechnen(Item_Name);
            itempc_berechnen(Item_Name);
            pc_berechnen();
            return true;
            
    }
    
    public static double itempc_berechnen(String Item_Name){
            if(Item_Name.equals(Item1_Name)){
                Item1_Pc = Item1_Pc_Anfang * Item1_Anzahl;
                return Item1_Pc;
            }
            else if(Item_Name.equals(Item2_Name)){
                Item2_Pc = Item2_Pc_Anfang * Item2_Anzahl;
                return Item2_Pc;
            }
            else if(Item_Name.equals(Item3_Name)){
                Item3_Pc = Item3_Pc_Anfang * Item3_Anzahl;
                return Item3_Pc;
            }
            else if(Item_Name.equals(Item4_Name)){
                Item4_Pc = Item4_Pc_Anfang * Item4_Anzahl;
                return Item4_Pc;
            }
            else if(Item_Name.equals(Item5_Name)){
                Item5_Pc = Item5_Pc_Anfang * Item5_Anzahl;
                return Item5_Pc;
            }
            else{
                Item6_Pc = Item6_Pc_Anfang * Item6_Anzahl;
                return Item6_Pc;
            }
    }
    
    public static double runden(double wert, int stellen){
           double gerundet = Math.round(wert * Math.pow(10d, stellen));
           return gerundet / Math.pow(10d, stellen);
    } 

    public static void geld_button_timer(){
        final java.util.Timer timer = new java.util.Timer();
                java.util.TimerTask task = new java.util.TimerTask() {
                @Override
                public void run() {
                    String img_Pfad;
                    if(Geld_Pc<0.02D){
                        img_Pfad = "src/images/1c.png";
                    }
                    else if(Geld_Pc<0.05D){
                        img_Pfad = "src/images/2c.png";
                    }
                    else if(Geld_Pc<0.10D){
                        img_Pfad = "src/images/5c.png";
                    }
                    else if(Geld_Pc<0.20D){
                        img_Pfad = "src/images/10c.png";
                    }
                    else if(Geld_Pc<0.50D){
                        img_Pfad = "src/images/20c.png";
                    }
                    else if(Geld_Pc<1){
                        img_Pfad = "src/images/50c.png";
                    }
                    else if(Geld_Pc<2){
                        img_Pfad = "src/images/geld.png";
                    }
                    else if(Geld_Pc<5){
                        img_Pfad = "src/images/2e.png";
                    }	
                    else if(Geld_Pc<10){
                        img_Pfad = "src/images/5e.png";
                    }
                    else if(Geld_Pc<20){
                        img_Pfad = "src/images/10e.png";
                    }
                    else if(Geld_Pc<50){
                        img_Pfad = "src/images/20e.png";
                    }
                    else if(Geld_Pc<100){
                        img_Pfad = "src/images/50e.png";
                    }
                    else if(Geld_Pc<200){
                        img_Pfad = "src/images/100e.png";
                    }
                    else if(Geld_Pc<500){
                        img_Pfad = "src/images/200e.png";
                    }
                    else{
                        img_Pfad = "src/images/500e.png";
                    }

                    ImageIcon geld_bild = new ImageIcon(img_Pfad);
                    geld_button.setIcon(geld_bild);

                }
        };
        timer.scheduleAtFixedRate(task, 0, 100);
    }
    
    public static void geld_label_timer(){
        final java.util.Timer timer = new java.util.Timer();
                java.util.TimerTask task = new java.util.TimerTask() {
                @Override
                public void run() {
                    geld_label.setText(new Double(runden(Geld,2)).toString() + "€");
                    geldpc_label.setText("pro Klick: " + new Double(runden(Geld_Pc,2)).toString() + "€");
                }
        };
        timer.scheduleAtFixedRate(task, 0, 20);
    }
}