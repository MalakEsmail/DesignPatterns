
public abstract class Factory {
	protected Product create()
	{
		Product product=createProduct();
		product.printName();
		return product;
	}
	protected abstract Product createProduct();
}
