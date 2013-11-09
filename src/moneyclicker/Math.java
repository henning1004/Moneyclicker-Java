package moneyclicker;

/**
* @author Henning
*/

public class Math {
    
    public static float pc_berechnen (){
        itempc_berechnen(Main.Item1_Name);
        itempc_berechnen(Main.Item2_Name);
        itempc_berechnen(Main.Item3_Name);
        itempc_berechnen(Main.Item4_Name);
        itempc_berechnen(Main.Item5_Name);
        itempc_berechnen(Main.Item6_Name);
        Main.Geld_Pc = Main.Geld_Pc_Anfang + Main.Item1_Pc + Main.Item2_Pc + Main.Item3_Pc + Main.Item4_Pc + Main.Item5_Pc + Main.Item6_Pc;
        return Main.Geld_Pc;
    }
    
    public static float geld_addieren(){        
        pc_berechnen();
        Main.Geld += Main.Geld_Pc;
        return Main.Geld;
    }
    
    public static float itempreis_berechnen(String Item_Name){
            if(Item_Name.equals(Main.Item1_Name)){
                Main.Item1_Preis = Main.Item1_Preis + (Main.Item1_Preis * Main.Item1_Faktor);
                return Main.Item1_Preis;
            }
            else if(Item_Name.equals(Main.Item2_Name)){
                Main.Item2_Preis = Main.Item2_Preis + (Main.Item2_Preis * Main.Item2_Faktor);
                return Main.Item2_Preis;
            }
            else if(Item_Name.equals(Main.Item3_Name)){
                Main.Item3_Preis = Main.Item3_Preis + (Main.Item3_Preis * Main.Item3_Faktor);
                return Main.Item3_Preis;
            }
            else if(Item_Name.equals(Main.Item4_Name)){
                Main.Item4_Preis = Main.Item4_Preis + (Main.Item4_Preis * Main.Item4_Faktor);
                return Main.Item4_Preis;
            }
            else if(Item_Name.equals(Main.Item5_Name)){
                Main.Item5_Preis = Main.Item5_Preis + (Main.Item5_Preis * Main.Item5_Faktor);
                return Main.Item5_Preis;
            }
            else{
                Main.Item6_Preis = Main.Item6_Preis + (Main.Item6_Preis * Main.Item6_Faktor);
                return Main.Item6_Preis;
            }

    }
    
    public static boolean item_kaufen(String Item_Name){
            if(Item_Name.equals(Main.Item1_Name)){
                if(Main.Geld>=Main.Item1_Preis){
                    Main.Item1_Anzahl++;
                    Main.Geld-=Main.Item1_Preis;
                }
                else{
                    return false;
                }
            }
            else if(Item_Name.equals(Main.Item2_Name)){
                if(Main.Geld>=Main.Item2_Preis){
                    Main.Item2_Anzahl++;
                    Main.Geld-=Main.Item2_Preis;
                }
                else{
                    return false;
                }
            }
            else if(Item_Name.equals(Main.Item3_Name)){
                if(Main.Geld>=Main.Item3_Preis){
                    Main.Item3_Anzahl++;
                    Main.Geld-=Main.Item3_Preis;
                }
                else{
                    return false;
                }
            }
            else if(Item_Name.equals(Main.Item4_Name)){
                if(Main.Geld>=Main.Item4_Preis){
                    Main.Item4_Anzahl++;
                    Main.Geld-=Main.Item4_Preis;                    
                }
                else{
                    return false;
                }
            }
            else if(Item_Name.equals(Main.Item5_Name)){
                if(Main.Geld>=Main.Item5_Preis){
                    Main.Item5_Anzahl++;
                    Main.Geld-=Main.Item5_Preis;
                }
                else{
                    return false;
                }
            }
            else{
                if(Main.Geld>=Main.Item6_Preis){
                    Main.Item6_Anzahl++;
                    Main.Geld-=Main.Item6_Preis;
                }
                else{
                    return false;
                }
            }
            itempreis_berechnen(Item_Name);
            itempc_berechnen(Item_Name);
            return true;
            
    }
    
    public static float itempc_berechnen(String Item_Name){
            if(Item_Name.equals(Main.Item1_Name)){
                Main.Item1_Pc = Main.Item1_Pc_Anfang * Main.Item1_Anzahl;
                return Main.Item1_Pc;
            }
            else if(Item_Name.equals(Main.Item2_Name)){
                Main.Item2_Pc = Main.Item2_Pc_Anfang * Main.Item2_Anzahl;
                return Main.Item2_Pc;
            }
            else if(Item_Name.equals(Main.Item3_Name)){
                Main.Item3_Pc = Main.Item3_Pc_Anfang * Main.Item3_Anzahl;
                return Main.Item3_Pc;
            }
            else if(Item_Name.equals(Main.Item4_Name)){
                Main.Item4_Pc = Main.Item4_Pc_Anfang * Main.Item4_Anzahl;
                return Main.Item4_Pc;
            }
            else if(Item_Name.equals(Main.Item5_Name)){
                Main.Item5_Pc = Main.Item5_Pc_Anfang * Main.Item5_Anzahl;
                return Main.Item5_Pc;
            }
            else{
                Main.Item6_Pc = Main.Item6_Pc_Anfang * Main.Item6_Anzahl;
                return Main.Item6_Pc;
            }
    }
}