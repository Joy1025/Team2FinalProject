package CSE360;
/*
CSE360 Summer 2017
Kyle Sun
Jingyi Li
Lin Sun
*/
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class CompanionPanel extends JLabel implements Runnable {
    
    /** The ghost moves and bounces around the screen.*/
    private JLabel companion;
    private JLabel message;
    private CompanionBrain brain;
    /** Create a Ghost with the provided file paths for the ghost image moving
    right and left.*/
    public CompanionPanel() {
        setOpaque(false);
        brain = new CompanionBrain(500, 500);
        companion = new JLabel(new ImageIcon("src/CSE360/Project2Images/ghost_station.gif"));
        message = new JLabel("<html>"+ brain.message +"</html>");
        add(companion);
        add(message);
        this.addComponentListener(new ComponentAdapter(){
            @Override
            public void componentResized(ComponentEvent e) {
                brain.setFrame(getWidth(), getHeight());
            }
        });
    }
    
    /** Move the ghost around the screen and bounces it off the frame boundaries. */
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException i) {
                java.lang.System.exit(1);
            }
            brain.updateState();
            companion.setIcon(new ImageIcon(brain.img));
            companion.setBounds(brain.x, brain.y, 64, 64);
            if (brain.y > brain.frameHeight/2) {
                message.setBounds(brain.x - 64, brain.y - 36, 250, 64);
            } else {
                message.setBounds(brain.x - 64, brain.y + 40, 250, 64);
            }
            message.setText("<html>"+ brain.message +"</html>");
        }
    }
}
