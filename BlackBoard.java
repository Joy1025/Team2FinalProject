package CSE360;

import java.util.Observable;
import java.util.Observer;
import java.util.*;

public class BlackBoard extends Observable implements Observer {
	private boolean[] correctorNot= new boolean[10];
	private long[] time = new long[10];
	private int count;
	private int numcorrect;
	
	public boolean[] getCorrectorNot(){
		return correctorNot;
	}
	public void setCorrectorNot(boolean[] correctorNot){
		this.correctorNot=correctorNot;
	}
	public long[] getTime(){
		return time;
	}
	public void setTime(long[] time){
		this.time=time;
	}

	//get how many question answered
	public int getQuesAnswered() {
		return count;
	}
	public int getNumcorrect() {
		return numcorrect;
	}
	public void setNumcorrect() {
		for(int i=0; i<correctorNot.length;i++){
			if(correctorNot[i]==true){
				numcorrect++;
			}
		}
	}
	@Override
	public void update(Observable o, Object arg) {
		time = ((ExamBrain)o).getlastElaspsedTime();
		int[] selectionList=((ExamBrain)o).getSelectionList();
		int[] answerList=((ExamBrain)o).getCorrectAnswer();
		for(int i = 0; i<correctorNot.length;i++){
			if(selectionList[i]==answerList[i]){
				correctorNot[i]=true;
			}
			count++;//increase the # of question answered. 
		}
		
	}
}
