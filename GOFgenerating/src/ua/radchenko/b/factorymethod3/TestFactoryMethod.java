package ua.radchenko.b.factorymethod3;

public class TestFactoryMethod {

	public static void main(String[] args) {
		// create ConcreteProduct1
		Client client = new Client();
		client.operation(new ConcreteCreatorP1());

		// create ConcreteProduct1
		client.operation(new ConcreteCreatorP2());

	}

}
