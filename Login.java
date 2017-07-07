package CSE360;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Login page
 *
 * Lin Sun
 * Kyle Sun
 * Jingyi Li
 */
public class Login extends JPanel{

	private String user;
	private JTextField name_text;
	private JLabel text;
	private JButton exit_button;
    public  boolean nextpage = false;
	
	public Login(){
		name_text = new JTextField();
		text = new JLabel ("Username");
		exit_button = new JButton("EXIT QUIZ");
		this.setLayout(new GridLayout(4,1));
		this.add(text);
		this.add(name_text);
		
		Font bigFont = name_text.getFont().deriveFont(Font.PLAIN,50f);
		name_text.setFont(bigFont);
		this.add(exit_button);

		name_text.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				user = name_text.getText();
				System.out.println(user);
			}
		});
		
		exit_button.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});	
	}
}
