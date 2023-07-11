package _06_Hospital;

public class Patient {
	private boolean isCared = false;
 public void checkPulse() {
	 setFeelsCaredFor(true);
 }
public void setFeelsCaredFor(Boolean bool) {
	isCared = bool;
}
public boolean feelsCaredFor() {
	return isCared;
}


 
}
