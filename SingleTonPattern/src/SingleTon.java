
public class SingleTon {
	private static SingleTon singleTon;
	private SingleTon() {}
	
	public static SingleTon getInstance() {
		if(singleTon==null) {
			synchronized (SingleTon.class) {
			if(singleTon==null) {
				return new SingleTon();
			}
			}
		}
		return singleTon;
	}
	 public void printHello() {
	       System.out.println("Hello SingleTon design pattern");
	   }

}
