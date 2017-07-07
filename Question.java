package CSE360;

/*
 * Lin Sun
 * Kyle Sun
 * Jingyi Li
 */
public class Question {
	private String question;
	private String icon;

	public Question(String q1)
	{
		question = q1;
		icon = "iconTest";
	}
	
	public String getQuestion()
	{
		return question;
	}
	
	public String getIcon()
	{
		return icon;
	}
	
	public void setQuestion(String q2)
	{
		question = q2;
	}

	public void setIcon(String temp) {
		// TODO Auto-generated method stub
		icon = temp;
	}
	
}
