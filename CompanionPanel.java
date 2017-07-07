package CSE360;
/*
CSE360 Summer 2017
Kyle Sun
Jingyi Li
Lin Sun
*/
import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class CompanionPanel extends JLabel implements Runnable {
    private JLabel companion;
    private JLabel message;
    private CompanionBrain brain;
    
    /** Create a CompanionPanel that contains a companion to help
    take the quiz. The companion reacts to the users' quiz activities.*/
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
    
    /** Move the ghost around the screen and bounces it off the frame boundaries.
    Updates the ghost's image and message based off how the user is doing on the
    quiz. */
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException i) {
                i.printStackTrace();
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
            message.setText("<html><font color = 'black'>" + brain.message + "</font></html>");
        }
    }
}
