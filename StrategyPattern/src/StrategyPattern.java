
public class StrategyPattern {
	// StrategyPattern : class behavior or its algorithms can be changed at run time .

	public static void main(String[] args) {
		
		Context context1= new Context( new AddOperation());
			System.out.println("result is : "+context1.excuteOperation(4, 2));
			
			Context context2= new Context( new SubtractOperation());
			System.out.println("result is : "+context2.excuteOperation(4, 2));
				
			Context context3= new Context( new MultiplyOperation());
			System.out.println("result is : "+context3.excuteOperation(4, 2));

			
	}

}
