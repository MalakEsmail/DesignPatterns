
public abstract class ShapeDecorator implements Shape{
	protected Shape decoratedShape;
	public ShapeDecorator(Shape shapeDecorator) {
	this.decoratedShape=shapeDecorator;
	}
	@Override
	public void draw() {
		decoratedShape.draw();
	}

}
