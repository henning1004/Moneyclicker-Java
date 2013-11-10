package moneyclicker;

import javax.swing.ImageIcon;
import static moneyclicker.Confiq.*;
import static moneyclicker.Main.*;

/**
* @author Henning
*/

public class Itemfunc {
    
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