package CSE360;

import java.util.Observable;
import java.util.Observer;

public class BlackBoard extends Observable implements Observer {
	private boolean[] correctorNot= new boolean[10];
	private double[] time = new double[10];
	private int count;
	private int numcorrect;
	
	public boolean[] getCorrectorNot(){
		return correctorNot;
	}
	public void setCorrectorNot(boolean[] correctorNot){
		this.correctorNot=correctorNot;
		count++;//increase the # of question answered. 
	}
	public double[] getTime(){
		return time;
	}
	public void setTime(double[] time){
		this.time=time;
	}
	public void updateall(boolean[] correct, double[] newtime) {
		setTime(newtime);
		setCorrectorNot(correct);	
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
		java.lang.System.out.println("update called");
		//need change based on examPanel
	}
}
