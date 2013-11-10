package moneyclicker;

import java.io.*;
import static moneyclicker.Confiq.*;
import static moneyclicker.Itemfunc.*;

/**
 * @author Henning
 */
public class Func {
    
    public static void reset(){
        
        Geld = 0;
        Geld_Pc = 0;

        Item1_Preis = 2;
        Item1_Faktor = 0.2;
        Item1_Anzahl = 0;
        Item1_Pc = 0;

        Item2_Preis = 250;
        Item2_Faktor = 0.21;
        Item2_Anzahl = 0;
        Item2_Pc = 0;

        Item3_Preis = 1000;
        Item3_Faktor = 0.22;
        Item3_Anzahl = 0;
        Item3_Pc = 0;

        Item4_Preis = 7500;
        Item4_Faktor = 0.23;
        Item4_Anzahl = 0;
        Item4_Pc = 0;

        Item5_Preis = 25000;
        Item5_Faktor = 0.24;
        Item5_Anzahl = 0;
        Item5_Pc = 0;

        Item6_Preis = 500000;
        Item6_Faktor = 0.25;
        Item6_Anzahl = 0;
        Item6_Pc = 0;
    }
    
    public static boolean save(String filename){
        String filedir = System.getenv("APPDATA") + File.separator + "Moneyclicker";
            try{
                File file = new File(filedir);
                file.mkdirs();
                
                BufferedWriter myWriter = new BufferedWriter(new FileWriter( filedir + File.separator + filename ,false));
                
                myWriter.write (Geld + "\n") ;

                myWriter.write (Item1_Anzahl + "\n") ;
                myWriter.write (Item1_Preis + "\n") ;

                myWriter.write (Item2_Anzahl + "\n") ;
                myWriter.write (Item2_Preis + "\n") ;

                myWriter.write (Item3_Anzahl + "\n") ;
                myWriter.write (Item3_Preis + "\n") ;

                myWriter.write (Item4_Anzahl + "\n") ;
                myWriter.write (Item4_Preis + "\n") ;

                myWriter.write (Item5_Anzahl + "\n") ;
                myWriter.write (Item5_Preis + "\n") ;
                
                myWriter.write (Item6_Anzahl + "\n") ;
                myWriter.write (Item6_Preis + "\n") ;
                
                myWriter.close();
                System.out.println("File saved");
                return true;
             }
             catch( IOException eIO ) {
                System.out.println("Fehler: " + eIO ) ;
                return false;
             }
    }
    
    public static boolean open(String filename){
        String filedir = System.getenv("APPDATA") + File.separator + "Moneyclicker" + File.separator + filename;
            try{
                BufferedReader myReader = new BufferedReader(new FileReader(filedir));
                
                Geld = Float.parseFloat(myReader.readLine());
                
                Item1_Anzahl = Integer.parseInt(myReader.readLine());
                Item1_Preis = Float.parseFloat(myReader.readLine());
                
                Item2_Anzahl = Integer.parseInt(myReader.readLine());
                Item2_Preis = Float.parseFloat(myReader.readLine());
                
                Item3_Anzahl = Integer.parseInt(myReader.readLine());
                Item3_Preis = Float.parseFloat(myReader.readLine());
                
                Item4_Anzahl = Integer.parseInt(myReader.readLine());
                Item4_Preis = Float.parseFloat(myReader.readLine());
                
                Item5_Anzahl = Integer.parseInt(myReader.readLine());
                Item5_Preis = Float.parseFloat(myReader.readLine());
                
                Item6_Anzahl = Integer.parseInt(myReader.readLine());
                Item6_Preis = Float.parseFloat(myReader.readLine());
                
                myReader.close();
                pc_berechnen();
                System.out.println("File opened");
                return true;
        }
        catch( IOException eIO ) {
                System.out.println("Fehler: " + eIO ) ;
                return false;
        }
    }
    
    public static boolean delete_save(String filename){
        String filedir = System.getenv("APPDATA") + File.separator + "Moneyclicker" + File.separator + filename;
        File file = new File(filedir);
        
        if(file.exists()){
            file.delete();
            System.out.println("File deleted");
            return true;
        }else{
            return false;
        }

        
    }
}