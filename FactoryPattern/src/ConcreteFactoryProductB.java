
public class ConcreteFactoryProductB extends Factory{

	@Override
	protected Product createProduct() {
		return new ProductB();
	}

}
