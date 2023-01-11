
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		Circle circle =new Circle();
		Rectangle rect=new Rectangle();
		circle.draw();
		rect.draw();
		RedShapeDecorator redShape=new RedShapeDecorator(new Circle());
		redShape.draw();
	}

}
