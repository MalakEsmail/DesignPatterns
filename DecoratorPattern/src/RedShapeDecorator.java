
public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape shapeDecorator) {
		super(shapeDecorator);
	}

	   @Override
	   public void draw() {
	      decoratedShape.draw();	       
	      setRedBorder(decoratedShape);
	   }
	 private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Red");
	   }
}
