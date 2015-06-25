package ua.radchenko.b.factorymethod1;

public class TestFactoryMethod {

	public static void main(String[] args) {
		// create ConcreteProduct1
		Product product1 = ConcreteCreator.factoryMethod("concreteproduct1");
		product1.info();
		// create ConcreteProduct2
		Product product2 = ConcreteCreator.factoryMethod("concreteproduct2");
		product2.info();

	}

}
