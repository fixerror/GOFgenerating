package ua.radchenko.b.factorymethod3;

public class ConcreteCreatorP1 extends AbstractCreator {

	@Override
	public Product getProduct() {
		return new ConcreteProduct1();
	}


}
