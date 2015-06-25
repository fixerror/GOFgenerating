package ua.radchenko.a.abstractfactory;


public class TestAbstractFactory {

	public static void main(String[] args) {
		Client client = new Client();
		//create ConcreteFactory1
		client.makeFactoryWork(new ConcreteFactory1());
		// method info() ProductA1&ProductB1
 		client.info();
 		//create ConcreteFactory2
 		client.makeFactoryWork(new ConcreteFactory2());
 	    // method info() ProductA1&ProductB1
 		client.info();
	}

}
