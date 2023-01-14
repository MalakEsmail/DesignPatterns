
public class ConcreteFactoryProductA extends Factory{

	@Override
	protected Product createProduct() {
		return new ProductA();
	}
	
}
