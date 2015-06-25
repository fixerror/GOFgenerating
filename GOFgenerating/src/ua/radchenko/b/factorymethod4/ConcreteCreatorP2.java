package ua.radchenko.b.factorymethod4;

public class ConcreteCreatorP2 extends AbstractCreator<ConcreteProduct2> {

	@Override
	public ConcreteProduct2 getProduct() {
		return new ConcreteProduct2();
	}

}
