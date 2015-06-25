package ua.radchenko.b.factorymethod3;

public class ConcreteCreatorP2 extends AbstractCreator {

	@Override
	public Product getProduct() {
		return new ConcreteProduct2();
	}

}
