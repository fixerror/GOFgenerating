package ua.radchenko.b.factorymethod4;

public class ConcreteCreatorP1 extends AbstractCreator<ConcreteProduct1> {

	@Override
	public ConcreteProduct1 getProduct() {
		return new ConcreteProduct1();
	}


}
