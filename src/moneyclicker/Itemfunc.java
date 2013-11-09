package moneyclicker;

import static moneyclicker.Confiq.*;

/**
* @author Henning
*/

public class Itemfunc {
    
    public static double pc_berechnen (){
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

}