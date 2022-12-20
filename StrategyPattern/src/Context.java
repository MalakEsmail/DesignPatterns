
public class Context {
private Strategy strategy;

public Context(Strategy str) {
	this.strategy=str;
}
 public int excuteOperation(int num1,int num2)
 {
	return strategy.doOperation(num1,  num2);
 }

}
