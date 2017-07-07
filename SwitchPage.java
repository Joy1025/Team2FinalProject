package CSE360;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

/*
 * When the start quiz button is clicked
 * swtich from login page to exam page
 * Lin Sun
 * Kyle Sun
 * Jingyi Li
 */

public class SwitchPage extends JPanel implements ActionListener{

	private Login loginPage;
	private ExamPanel examPage;
	
	public SwitchPage() throws FileNotFoundException{
		loginPage = new Login();
		examPage = new ExamPanel();
		JButton next_button = new JButton("START QUIZ");
		JButton back_button = new JButton("GO BACK");
		
		next_button.addActionListener(this);
		back_button.addActionListener(this);
		
		loginPage.add(next_button);
		examPage.add(back_button);
		add(loginPage);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 for (Component component : getComponents())
	            if (loginPage == component) {
	                remove(loginPage);
	                add(examPage);

	            } else {
	                remove(examPage);
	                add(loginPage);
	            }

	        repaint();
	        revalidate();
	}
}
