package ua.radchenko.a.abstractfactory;


public class Client {

	private AbstractProductA  abstractProductA;
	private AbstractProductB  abstractProductB;
	public void makeFactoryWork(AbstractFactory factory) {
		abstractProductA = factory.createA();
		abstractProductB = factory.createB();

	}
	
	public void info(){
		abstractProductA.info();
		abstractProductB.info();
	}
}
