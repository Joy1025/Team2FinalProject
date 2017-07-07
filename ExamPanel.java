package CSE360;
/*
 * Lin Sun
 * Kyle Sun
 * Jingyi Li
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ExamPanel extends JPanel{
	private ExamBrain thisExam;
	private JScrollPane questionPane;
	private JPanel questionPanel1;
	private JComboBox selectionBox1;
	private JPanel questionPanel2;
	private JComboBox selectionBox2;
	private JPanel questionPanel3;
	private JComboBox selectionBox3;
	private JPanel questionPanel4;
	private JComboBox selectionBox4;
	private JPanel questionPanel5;
	private JComboBox selectionBox5;
	private JPanel questionPanel6;
	private JComboBox selectionBox6;
	private JPanel questionPanel7;
	private JComboBox selectionBox7;
	private JPanel questionPanel8;
	private JComboBox selectionBox8;
	private JPanel questionPanel9;
	private JComboBox selectionBox9;
	private JPanel questionPanel10;
	private JComboBox selectionBox10;
	private long startTime;
	
public ExamPanel() throws FileNotFoundException
{
	thisExam = new ExamBrain();
	startTime = System.currentTimeMillis(); // record the start time.
	ArrayList<Question> questionList = thisExam.getQuestionList();
	//retrieve the answers to show on the panel
	ArrayList<Answer> answerListA = thisExam.getAnswerList(1);
	ArrayList<Answer> answerListB = thisExam.getAnswerList(2);
	ArrayList<Answer> answerListC = thisExam.getAnswerList(3);
	ArrayList<Answer> answerListD = thisExam.getAnswerList(4);
	ArrayList[] answerList = {answerListA, answerListB, answerListC, answerListD};
	JPanel AnswerPanel = new JPanel();

	JLabel questionText = new JLabel();
	String[] abcd = {"A","B","C","D"};
	JPanel QuestionPanel = new JPanel();
	QuestionPanel.setLayout(new BoxLayout(QuestionPanel,BoxLayout.Y_AXIS));

	questionPanel1 = new JPanel();
	selectionBox1 = new JComboBox(abcd);
	selectionBox1.addActionListener(new SelectionListener1());
	questionPanel1.setLayout(new BoxLayout(questionPanel1,BoxLayout.Y_AXIS));
	String temp = questionList.get(0).getQuestion();
	questionText = new JLabel(temp);
	 String iconad = questionList.get(0).getIcon();
	 JLabel icon = new JLabel();
		icon =	new JLabel(new ImageIcon((new ImageIcon("QandA/"+ iconad + ".png")).getImage().getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH)));	
	
	questionPanel1.add(questionText);
	questionPanel1.add(icon); 
	questionPanel1.add(selectionBox1);
	// adding answers here in the answerPanel todo--add icon

	//
	questionPanel2 = new JPanel();
	selectionBox2 = new JComboBox(abcd);
	selectionBox2.addActionListener(new SelectionListener2());
	questionPanel2.setLayout(new BoxLayout(questionPanel2,BoxLayout.Y_AXIS));
	 temp = questionList.get(1).getQuestion();
	questionText = new JLabel(temp);
	  iconad = questionList.get(1).getIcon();
	  icon = new JLabel();
		icon =	new JLabel(new ImageIcon((new ImageIcon("QandA/"+ iconad + ".png")).getImage().getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH)));	
	//to do add answers
	questionPanel2.add(questionText);
	questionPanel2.add(icon); 
	questionPanel2.add(selectionBox2);
	
	//
	questionPanel3 = new JPanel();
	selectionBox3 = new JComboBox(abcd);
	selectionBox3.addActionListener(new SelectionListener3());
	questionPanel3.setLayout(new BoxLayout(questionPanel3,BoxLayout.Y_AXIS));
	 temp = questionList.get(2).getQuestion();
	questionText = new JLabel(temp);
	  iconad = questionList.get(2).getIcon();
	  icon = new JLabel();
		icon =	new JLabel(new ImageIcon((new ImageIcon("QandA/"+ iconad + ".png")).getImage().getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH)));
	//to do add answers
	questionPanel3.add(questionText);
	questionPanel3.add(icon); 
	questionPanel3.add(selectionBox3);

	//
	questionPanel4 = new JPanel();
	selectionBox4 = new JComboBox(abcd);
	selectionBox4.addActionListener(new SelectionListener4());
	questionPanel4.setLayout(new BoxLayout(questionPanel4,BoxLayout.Y_AXIS));
	 temp = questionList.get(3).getQuestion();
	questionText = new JLabel(temp);
	  iconad = questionList.get(3).getIcon();
	  icon = new JLabel();
		icon =	new JLabel(new ImageIcon((new ImageIcon("QandA/"+ iconad + ".png")).getImage().getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH)));
	//to do add answers
	questionPanel4.add(questionText);
	questionPanel4.add(icon); 
	questionPanel4.add(selectionBox4);

	
	//
	questionPanel5 = new JPanel();
	selectionBox5 = new JComboBox(abcd);
	selectionBox5.addActionListener(new SelectionListener5());
	questionPanel5.setLayout(new BoxLayout(questionPanel5,BoxLayout.Y_AXIS));
	 temp = questionList.get(4).getQuestion();
	questionText = new JLabel(temp);
	  iconad = questionList.get(4).getIcon();
	  icon = new JLabel();
		icon =	new JLabel(new ImageIcon((new ImageIcon("QandA/"+ iconad + ".png")).getImage().getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH)));
	//to do add answers
	questionPanel5.add(questionText);
	questionPanel5.add(icon); 
	questionPanel5.add(selectionBox5);

	//
	questionPanel6 = new JPanel();
	selectionBox6 = new JComboBox(abcd);
	selectionBox6.addActionListener(new SelectionListener6());
	questionPanel6.setLayout(new BoxLayout(questionPanel6,BoxLayout.Y_AXIS));
	 temp = questionList.get(5).getQuestion();
	questionText = new JLabel(temp);
	  iconad = questionList.get(5).getIcon();
	  icon = new JLabel();
		icon =	new JLabel(new ImageIcon((new ImageIcon("QandA/"+ iconad + ".png")).getImage().getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH)));
	//to do add answers
	questionPanel6.add(questionText);
	questionPanel6.add(icon); 
	questionPanel6.add(selectionBox6);

	//
	questionPanel7 = new JPanel();
	selectionBox7 = new JComboBox(abcd);
	selectionBox7.addActionListener(new SelectionListener7());
	questionPanel7.setLayout(new BoxLayout(questionPanel7,BoxLayout.Y_AXIS));
	 temp = questionList.get(6).getQuestion();
	questionText = new JLabel(temp);
	  iconad = questionList.get(6).getIcon();
	  icon = new JLabel();
		icon =	new JLabel(new ImageIcon((new ImageIcon("QandA/"+ iconad + ".png")).getImage().getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH)));
	//to do add answers
	questionPanel7.add(questionText);
	questionPanel7.add(icon); 
	questionPanel7.add(selectionBox7);

	//
	questionPanel8 = new JPanel();
	selectionBox8 = new JComboBox(abcd);
	selectionBox8.addActionListener(new SelectionListener8());
	questionPanel8.setLayout(new BoxLayout(questionPanel8,BoxLayout.Y_AXIS));
	 temp = questionList.get(7).getQuestion();
	questionText = new JLabel(temp);
	  iconad = questionList.get(7).getIcon();
	  icon = new JLabel();
		icon =	new JLabel(new ImageIcon((new ImageIcon("QandA/"+ iconad + ".png")).getImage().getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH)));
	//to do add answers
	questionPanel8.add(questionText);
	questionPanel8.add(icon);
	questionPanel8.add(selectionBox8);
	
	//
	questionPanel9 = new JPanel();
	selectionBox9 = new JComboBox(abcd);
	selectionBox9.addActionListener(new SelectionListener9());
	questionPanel9.setLayout(new BoxLayout(questionPanel9,BoxLayout.Y_AXIS));
	 temp = questionList.get(8).getQuestion();
	questionText = new JLabel(temp);
	  iconad = questionList.get(8).getIcon();
	  icon = new JLabel();
		icon =	new JLabel(new ImageIcon((new ImageIcon("QandA/"+ iconad + ".png")).getImage().getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH)));
	//to do add answers
	questionPanel9.add(questionText);
	questionPanel9.add(icon);
	questionPanel9.add(selectionBox9);

	//
	questionPanel10 = new JPanel();
	selectionBox10 = new JComboBox(abcd);
	selectionBox10.addActionListener(new SelectionListener10());
	questionPanel10.setLayout(new BoxLayout(questionPanel10,BoxLayout.Y_AXIS));
	 temp = questionList.get(9).getQuestion();
	questionText = new JLabel(temp);
	  iconad = questionList.get(9).getIcon();
	  icon = new JLabel();
		icon =	new JLabel(new ImageIcon((new ImageIcon("QandA/"+ iconad + ".png")).getImage().getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH)));
	//to do add answers
	questionPanel10.add(questionText);
	questionPanel10.add(icon);
	questionPanel10.add(selectionBox10);
	//

	JPanel[] quesionPanel = {questionPanel1,questionPanel2,questionPanel3,questionPanel4,questionPanel5,questionPanel6,questionPanel7,questionPanel8,questionPanel9,questionPanel10};
	for (int j = 0; j<quesionPanel.length; j++)
	{
		AnswerPanel = new JPanel();
		AnswerPanel.setLayout(new GridLayout(4,2));
		for(int i = 0;i<4;i++)
		{
			String[] txtabcd = {"A ","B ", "C ", "D "};
			JLabel answerText = new JLabel();
			Answer tempChoice = new Answer();
			tempChoice = (Answer) answerList[i].get(j);
			answerText = new JLabel( txtabcd[i] + tempChoice.getAnswer());
			AnswerPanel.add(answerText);
		}
		quesionPanel[j].add(AnswerPanel);
		QuestionPanel.add(quesionPanel[j]);
	}

    this.add(QuestionPanel);	
}

//selectionbox listener
private class SelectionListener1 implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i = selectionBox1.getSelectedIndex();
		long nowTime = System.currentTimeMillis();
		long elapsedTime = nowTime - startTime; 
		thisExam.updateResult(1, i+1, elapsedTime );
	}
}

//selectionbox listener
private class SelectionListener2 implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i = selectionBox2.getSelectedIndex();
		long nowTime = System.currentTimeMillis();
		long elapsedTime = nowTime - startTime; 
		thisExam.updateResult(2, i+1, elapsedTime );		
	}
}

//selectionbox listener
private class SelectionListener3 implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i = selectionBox3.getSelectedIndex();
		long nowTime = System.currentTimeMillis();
		long elapsedTime = nowTime - startTime; 
		thisExam.updateResult(3, i+1, elapsedTime );		
	}
}

//selectionbox listener
private class SelectionListener4 implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i = selectionBox4.getSelectedIndex();
		long nowTime = System.currentTimeMillis();
		long elapsedTime = nowTime - startTime; 
		thisExam.updateResult(4, i+1, elapsedTime );		
	}
}


//selectionbox listener
private class SelectionListener5 implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i = selectionBox5.getSelectedIndex();
		long nowTime = System.currentTimeMillis();
		long elapsedTime = nowTime - startTime; 
		thisExam.updateResult(5, i+1, elapsedTime );	}
}

//selectionbox listener
private class SelectionListener6 implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i = selectionBox6.getSelectedIndex();
		long nowTime = System.currentTimeMillis();
		long elapsedTime = nowTime - startTime; 
		thisExam.updateResult(6, i+1, elapsedTime );	}
}

//selectionbox listener
private class SelectionListener7 implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i = selectionBox7.getSelectedIndex();
		long nowTime = System.currentTimeMillis();
		long elapsedTime = nowTime - startTime; 
		thisExam.updateResult(7, i+1, elapsedTime );	}
}

//selectionbox listener
private class SelectionListener8 implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i = selectionBox8.getSelectedIndex();
		long nowTime = System.currentTimeMillis();
		long elapsedTime = nowTime - startTime; 
		thisExam.updateResult(8, i+1, elapsedTime );	}
}

//selectionbox listener
private class SelectionListener9 implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i = selectionBox9.getSelectedIndex();
		long nowTime = System.currentTimeMillis();
		long elapsedTime = nowTime - startTime; 
		thisExam.updateResult(9, i+1, elapsedTime );	}
}

//selectionbox listener
private class SelectionListener10 implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i = selectionBox10.getSelectedIndex();
		long nowTime = System.currentTimeMillis();
		long elapsedTime = nowTime - startTime; 
		thisExam.updateResult(10, i+1, elapsedTime );		
	}
}

}
