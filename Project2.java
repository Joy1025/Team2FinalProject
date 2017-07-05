
package CSE360;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class Project2 extends JFrame {

    public Project2 () {
     GridLayout grid = new GridLayout (1,1);   
     setLayout(grid);
     CompanionPanel companion = new CompanionPanel();
     Thread compThread = new Thread(companion);
     compThread.start();
     this.add(companion);
    }

    public static void main(String[] args) {
        Project2 u = new Project2();
        u.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        u.setSize(500, 500);
        u.setVisible(true);
    }
    
}