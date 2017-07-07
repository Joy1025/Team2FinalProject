package CSE360;

/*
 * Lin Sun
 * Kyle Sun
 * Jingyi Li
 */
public class Answer {
	private String answer;
	private String icon;

	public Answer()
	{
		answer = "answerTest";
		icon = "iconTest";
	}
	
	public Answer(String q4)
	{
		answer = q4;
		icon = "Test";
	}
	
	public void setAnswer(String q3)
	{
		answer = q3;
	}
	
	public void setIcon(String q5)
	{
		icon = q5;
	}
	
	public String getAnswer()
	{
		return answer;
	}
	
	public String getIcon()
	{
		return icon;
	}
}
