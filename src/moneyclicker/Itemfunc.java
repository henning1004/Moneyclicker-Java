package moneyclicker;

import java.lang.Math;

/**
* @author Henning
*/

public class Itemfunc {
    
    public static double pc_berechnen (){
        itempc_berechnen(Confiq.Item1_Name);
        itempc_berechnen(Confiq.Item2_Name);
        itempc_berechnen(Confiq.Item3_Name);
        itempc_berechnen(Confiq.Item4_Name);
        itempc_berechnen(Confiq.Item5_Name);
        itempc_berechnen(Confiq.Item6_Name);
        Confiq.Geld_Pc = Confiq.Geld_Pc_Anfang + Confiq.Item1_Pc + Confiq.Item2_Pc + Confiq.Item3_Pc + Confiq.Item4_Pc + Confiq.Item5_Pc + Confiq.Item6_Pc;
        return Confiq.Geld_Pc;
    }
    
    public static double geld_addieren(){        
        pc_berechnen();
        Confiq.Geld += Confiq.Geld_Pc;
        return Confiq.Geld;
    }
    
    public static double itempreis_berechnen(String Item_Name){
            if(Item_Name.equals(Confiq.Item1_Name)){
                Confiq.Item1_Preis = Confiq.Item1_Preis + (Confiq.Item1_Preis * Confiq.Item1_Faktor);
                return Confiq.Item1_Preis;
            }
            else if(Item_Name.equals(Confiq.Item2_Name)){
                Confiq.Item2_Preis = Confiq.Item2_Preis + (Confiq.Item2_Preis * Confiq.Item2_Faktor);
                return Confiq.Item2_Preis;
            }
            else if(Item_Name.equals(Confiq.Item3_Name)){
                Confiq.Item3_Preis = Confiq.Item3_Preis + (Confiq.Item3_Preis * Confiq.Item3_Faktor);
                return Confiq.Item3_Preis;
            }
            else if(Item_Name.equals(Confiq.Item4_Name)){
                Confiq.Item4_Preis = Confiq.Item4_Preis + (Confiq.Item4_Preis * Confiq.Item4_Faktor);
                return Confiq.Item4_Preis;
            }
            else if(Item_Name.equals(Confiq.Item5_Name)){
                Confiq.Item5_Preis = Confiq.Item5_Preis + (Confiq.Item5_Preis * Confiq.Item5_Faktor);
                return Confiq.Item5_Preis;
            }
            else{
                Confiq.Item6_Preis = Confiq.Item6_Preis + (Confiq.Item6_Preis * Confiq.Item6_Faktor);
                return Confiq.Item6_Preis;
            }

    }
    
    public static boolean item_kaufen(String Item_Name){
            if(Item_Name.equals(Confiq.Item1_Name)){
                if(Confiq.Geld>=Confiq.Item1_Preis){
                    Confiq.Item1_Anzahl++;
                    Confiq.Geld-=Confiq.Item1_Preis;
                }
                else{
                    return false;
                }
            }
            else if(Item_Name.equals(Confiq.Item2_Name)){
                if(Confiq.Geld>=Confiq.Item2_Preis){
                    Confiq.Item2_Anzahl++;
                    Confiq.Geld-=Confiq.Item2_Preis;
                }
                else{
                    return false;
                }
            }
            else if(Item_Name.equals(Confiq.Item3_Name)){
                if(Confiq.Geld>=Confiq.Item3_Preis){
                    Confiq.Item3_Anzahl++;
                    Confiq.Geld-=Confiq.Item3_Preis;
                }
                else{
                    return false;
                }
            }
            else if(Item_Name.equals(Confiq.Item4_Name)){
                if(Confiq.Geld>=Confiq.Item4_Preis){
                    Confiq.Item4_Anzahl++;
                    Confiq.Geld-=Confiq.Item4_Preis;                    
                }
                else{
                    return false;
                }
            }
            else if(Item_Name.equals(Confiq.Item5_Name)){
                if(Confiq.Geld>=Confiq.Item5_Preis){
                    Confiq.Item5_Anzahl++;
                    Confiq.Geld-=Confiq.Item5_Preis;
                }
                else{
                    return false;
                }
            }
            else{
                if(Confiq.Geld>=Confiq.Item6_Preis){
                    Confiq.Item6_Anzahl++;
                    Confiq.Geld-=Confiq.Item6_Preis;
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
            if(Item_Name.equals(Confiq.Item1_Name)){
                Confiq.Item1_Pc = Confiq.Item1_Pc_Anfang * Confiq.Item1_Anzahl;
                return Confiq.Item1_Pc;
            }
            else if(Item_Name.equals(Confiq.Item2_Name)){
                Confiq.Item2_Pc = Confiq.Item2_Pc_Anfang * Confiq.Item2_Anzahl;
                return Confiq.Item2_Pc;
            }
            else if(Item_Name.equals(Confiq.Item3_Name)){
                Confiq.Item3_Pc = Confiq.Item3_Pc_Anfang * Confiq.Item3_Anzahl;
                return Confiq.Item3_Pc;
            }
            else if(Item_Name.equals(Confiq.Item4_Name)){
                Confiq.Item4_Pc = Confiq.Item4_Pc_Anfang * Confiq.Item4_Anzahl;
                return Confiq.Item4_Pc;
            }
            else if(Item_Name.equals(Confiq.Item5_Name)){
                Confiq.Item5_Pc = Confiq.Item5_Pc_Anfang * Confiq.Item5_Anzahl;
                return Confiq.Item5_Pc;
            }
            else{
                Confiq.Item6_Pc = Confiq.Item6_Pc_Anfang * Confiq.Item6_Anzahl;
                return Confiq.Item6_Pc;
            }
    }
    
    public static double runden(double wert, int stellen){
           double gerundet = Math.round(wert * Math.pow(10d, stellen));
            return gerundet / Math.pow(10d, stellen);
    } 

}