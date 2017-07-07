
package CSE360;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.*;

/*
 * main 
 * 
 * Lin Sun
 * Kyle Sun
 * Jingyi Li
 */
 
public class Project2 extends JFrame{

	private static JLayeredPane layeredPane;
	private static int FRAME_WIDTH = 800;
    private static int FRAME_HEIGHT = 800;
    
    public Project2 () throws FileNotFoundException {
    
     layeredPane = new JLayeredPane();
     layeredPane.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));  
     GridLayout grid = new GridLayout (1,1);   
     setLayout(grid);
 
     SwitchPage switchPage = new SwitchPage();
     switchPage.setBounds(0, 0, FRAME_WIDTH , FRAME_HEIGHT);
     
     CompanionPanel companion = new CompanionPanel();
     companion.setBounds(0,0,FRAME_WIDTH, FRAME_HEIGHT);
     //switch panel on bottom, companion on top
     layeredPane.setOpaque(false);               
     layeredPane.add(companion, new Integer(1));
     JScrollPane scroll = new JScrollPane(switchPage);
     layeredPane.add(scroll, new Integer(0));
     scroll.setBounds(0,0,FRAME_WIDTH, FRAME_HEIGHT);
     this.add(layeredPane);

     Thread compThread = new Thread(companion);
     compThread.start();

     this.setTitle("CSE360 Quiz");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
     this.setVisible(true);
     this.setContentPane(layeredPane);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Project2 quiz = new Project2();
    }
}
