package ua.radchenko.b.factorymethod2;

public class TestFactoryMethod {

	public static void main(String[] args) {
		
		// create ConcreteProduct1
		Product product1 = ConcreteCreator.getConcreteProduct1();
		product1.info();
		// create ConcreteProduct2
		Product product2 = ConcreteCreator.getConcreteProduct2();
		product2.info();
	}

}
