
public class ObserverPatternDemo {

	public static void main(String[] args) {
		
			Subject subject=new Subject();
			new OctalObserver(subject);
			new BinaryObserver(subject);
			System.out.println("------------ 15---------------");
			subject.setState(15);
			System.out.println("------------ 10---------------");
			subject.setState(10);
			
	}

}
