package moneyclicker;

import java.io.*;

/**
 * @author Henning
 */
public class Func {
    
    public static void reset(){
        
        Main.Geld = 0;
        Main.Geld_Pc = 0;

        Main.Item1_Preis = 2;
        Main.Item1_Faktor = 0.2F;
        Main.Item1_Anzahl = 0;
        Main.Item1_Pc = 0;

        Main.Item2_Preis = 250;
        Main.Item2_Faktor = 0.21F;
        Main.Item2_Anzahl = 0;
        Main.Item2_Pc = 0;

        Main.Item3_Preis = 1000;
        Main.Item3_Faktor = 0.22F;
        Main.Item3_Anzahl = 0;
        Main.Item3_Pc = 0;

        Main.Item4_Preis = 7500;
        Main.Item4_Faktor = 0.23F;
        Main.Item4_Anzahl = 0;
        Main.Item4_Pc = 0;

        Main.Item5_Preis = 25000;
        Main.Item5_Faktor = 0.24F;
        Main.Item5_Anzahl = 0;
        Main.Item5_Pc = 0;

        Main.Item6_Preis = 500000;
        Main.Item6_Faktor = 0.25F;
        Main.Item6_Anzahl = 0;
        Main.Item6_Pc = 0;
    }
    
    public static boolean save(String filename){
        String filedir = System.getenv("APPDATA") + File.separator + "Moneyclicker";
            try{
                File file = new File(filedir);
                file.mkdirs();
                
                BufferedWriter myWriter = new BufferedWriter(new FileWriter( filedir + File.separator + filename ,false));
                
                myWriter.write (Main.Geld + "\n") ;

                myWriter.write (Main.Item1_Anzahl + "\n") ;
                myWriter.write (Main.Item1_Preis+ "\n") ;

                myWriter.write (Main.Item2_Anzahl + "\n") ;
                myWriter.write (Main.Item2_Preis + "\n") ;

                myWriter.write (Main.Item3_Anzahl + "\n") ;
                myWriter.write (Main.Item3_Preis + "\n") ;

                myWriter.write (Main.Item4_Anzahl + "\n") ;
                myWriter.write (Main.Item4_Preis + "\n") ;

                myWriter.write (Main.Item5_Anzahl + "\n") ;
                myWriter.write (Main.Item5_Preis + "\n") ;
                
                myWriter.write (Main.Item6_Anzahl + "\n") ;
                myWriter.write (Main.Item6_Preis + "\n") ;
                
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
                
                Main.Geld = Float.parseFloat(myReader.readLine());
                
                Main.Item1_Anzahl = Integer.parseInt(myReader.readLine());
                Main.Item1_Preis = Float.parseFloat(myReader.readLine());
                
                Main.Item2_Anzahl = Integer.parseInt(myReader.readLine());
                Main.Item2_Preis = Float.parseFloat(myReader.readLine());
                
                Main.Item3_Anzahl = Integer.parseInt(myReader.readLine());
                Main.Item3_Preis = Float.parseFloat(myReader.readLine());
                
                Main.Item4_Anzahl = Integer.parseInt(myReader.readLine());
                Main.Item4_Preis = Float.parseFloat(myReader.readLine());
                
                Main.Item5_Anzahl = Integer.parseInt(myReader.readLine());
                Main.Item5_Preis = Float.parseFloat(myReader.readLine());
                
                Main.Item6_Anzahl = Integer.parseInt(myReader.readLine());
                Main.Item6_Preis = Float.parseFloat(myReader.readLine());
                
                myReader.close();
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