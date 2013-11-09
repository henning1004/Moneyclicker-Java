package moneyclicker;

import java.io.*;

/**
 * @author Henning
 */
public class Func {
    
    public static void reset(){
        
        Confiq.Geld = 0;
        Confiq.Geld_Pc = 0;

        Confiq.Item1_Preis = 2;
        Confiq.Item1_Faktor = 0.2;
        Confiq.Item1_Anzahl = 0;
        Confiq.Item1_Pc = 0;

        Confiq.Item2_Preis = 250;
        Confiq.Item2_Faktor = 0.21;
        Confiq.Item2_Anzahl = 0;
        Confiq.Item2_Pc = 0;

        Confiq.Item3_Preis = 1000;
        Confiq.Item3_Faktor = 0.22;
        Confiq.Item3_Anzahl = 0;
        Confiq.Item3_Pc = 0;

        Confiq.Item4_Preis = 7500;
        Confiq.Item4_Faktor = 0.23;
        Confiq.Item4_Anzahl = 0;
        Confiq.Item4_Pc = 0;

        Confiq.Item5_Preis = 25000;
        Confiq.Item5_Faktor = 0.24;
        Confiq.Item5_Anzahl = 0;
        Confiq.Item5_Pc = 0;

        Confiq.Item6_Preis = 500000;
        Confiq.Item6_Faktor = 0.25;
        Confiq.Item6_Anzahl = 0;
        Confiq.Item6_Pc = 0;
    }
    
    public static boolean save(String filename){
        String filedir = System.getenv("APPDATA") + File.separator + "Moneyclicker";
            try{
                File file = new File(filedir);
                file.mkdirs();
                
                BufferedWriter myWriter = new BufferedWriter(new FileWriter( filedir + File.separator + filename ,false));
                
                myWriter.write (Confiq.Geld + "\n") ;

                myWriter.write (Confiq.Item1_Anzahl + "\n") ;
                myWriter.write (Confiq.Item1_Preis + "\n") ;

                myWriter.write (Confiq.Item2_Anzahl + "\n") ;
                myWriter.write (Confiq.Item2_Preis + "\n") ;

                myWriter.write (Confiq.Item3_Anzahl + "\n") ;
                myWriter.write (Confiq.Item3_Preis + "\n") ;

                myWriter.write (Confiq.Item4_Anzahl + "\n") ;
                myWriter.write (Confiq.Item4_Preis + "\n") ;

                myWriter.write (Confiq.Item5_Anzahl + "\n") ;
                myWriter.write (Confiq.Item5_Preis + "\n") ;
                
                myWriter.write (Confiq.Item6_Anzahl + "\n") ;
                myWriter.write (Confiq.Item6_Preis + "\n") ;
                
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
                
                Confiq.Geld = Float.parseFloat(myReader.readLine());
                
                Confiq.Item1_Anzahl = Integer.parseInt(myReader.readLine());
                Confiq.Item1_Preis = Float.parseFloat(myReader.readLine());
                
                Confiq.Item2_Anzahl = Integer.parseInt(myReader.readLine());
                Confiq.Item2_Preis = Float.parseFloat(myReader.readLine());
                
                Confiq.Item3_Anzahl = Integer.parseInt(myReader.readLine());
                Confiq.Item3_Preis = Float.parseFloat(myReader.readLine());
                
                Confiq.Item4_Anzahl = Integer.parseInt(myReader.readLine());
                Confiq.Item4_Preis = Float.parseFloat(myReader.readLine());
                
                Confiq.Item5_Anzahl = Integer.parseInt(myReader.readLine());
                Confiq.Item5_Preis = Float.parseFloat(myReader.readLine());
                
                Confiq.Item6_Anzahl = Integer.parseInt(myReader.readLine());
                Confiq.Item6_Preis = Float.parseFloat(myReader.readLine());
                
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