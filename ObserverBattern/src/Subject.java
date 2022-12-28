import java.util.ArrayList;
import java.util.List;

public class Subject {
private List<Observer> observers =new ArrayList<Observer>();
private int state;

public int getState() {
	return state;
}
public void setState(int value) {
	this.state=value;
	notifyListeners();
}
public void attach(Observer observer) {
	observers.add(observer);
}
public void notifyListeners() {
	
for(Observer obs :observers) {
	
	obs.update();
}
}
}
