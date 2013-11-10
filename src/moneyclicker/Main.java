package moneyclicker;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static moneyclicker.Func.*;
import static moneyclicker.Itemfunc.*;
import static moneyclicker.Confiq.*;
/**
 * @author Danny
 * @author Henning
 */

public class Main {
  
    public static JButton geld_button;
    public static JLabel geld_label;
    public static JLabel geldpc_label;
        
    public static void main(String[] args) {
        
        // MAINFRAME
        final JFrame mainFrame = new JFrame("Moneyclicker");
        mainFrame.getContentPane().setBackground(Color.WHITE);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        
        mainFrame.setSize( 1366, 768 );
        mainFrame.setLayout(new FlowLayout(50,150,1));
        mainFrame.setResizable(true);
        
      // PANEL 0
        JPanel panel0= new JPanel();
        panel0.setBackground(Color.WHITE);
        panel0.setPreferredSize(new Dimension(1050, 70));
        
      // PANEL 1
        final JPanel panel1  = new JPanel();
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
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.WHITE);
        panel2.setPreferredSize(new Dimension(1050, 150));
        
        ImageIcon flasche_bild = new ImageIcon("src/images/flasche.png");
        JButton item1 = new JButton(flasche_bild);  
        item1.setSize(200 ,200);
        item1.setOpaque(false);
        item1.setContentAreaFilled(false);
        item1.setBorderPainted(false); 
        panel2.add( item1 );
        
        ImageIcon oma_bild = new ImageIcon("src/images/oma.png");
        JButton item2 = new JButton(oma_bild); 
        item2.setOpaque(false);
        item2.setContentAreaFilled(false);
        item2.setBorderPainted(false); 
        panel2.add( item2 );
        
        ImageIcon fabrik_bild = new ImageIcon("src/images/fabrik.png");
        JButton item3 = new JButton(fabrik_bild);  
        item3.setOpaque(false);
        item3.setContentAreaFilled(false);
        item3.setBorderPainted(false); 
        panel2.add( item3 );
        
        ImageIcon bank_bild = new ImageIcon("src/images/bank.png");
        JButton item4 = new JButton(bank_bild);  
        item4.setOpaque(false);
        item4.setContentAreaFilled(false);
        item4.setBorderPainted(false); 
        panel2.add( item4 );
        
        ImageIcon drucker_bild = new ImageIcon("src/images/Drucker.png");
        JButton item5 = new JButton(drucker_bild);   
        item5.setOpaque(false);
        item5.setContentAreaFilled(false);
        item5.setBorderPainted(false); 
        panel2.add( item5 );
        
        ImageIcon zeitmaschine_bild = new ImageIcon("src/images/zeitmaschine.png");
        JButton item6 = new JButton(zeitmaschine_bild);   
        item6.setOpaque(false);
        item6.setContentAreaFilled(false);
        item6.setBorderPainted(false); 
        panel2.add( item6 );
      
      // PANEL 3
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.WHITE);
        panel3.setPreferredSize(new Dimension(1050, 50));
        
        JButton save  = new JButton("Speichern");  
        panel3.add( save );
        JButton open  = new JButton("Laden");      
        panel3.add( open );
        JButton delete= new JButton("Löschen");     
        panel3.add( delete );
        
      // PANEL 4
        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.WHITE);
        panel4.setPreferredSize(new Dimension(1050, 150));
        
        ImageIcon reset_bild = new ImageIcon("src/images/reset.jpg");
        JButton reset = new JButton(reset_bild);
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
        
        geld_button_timer();
        geld_label_timer();
        
    }
    
}
