package ua.radchenko.a.abstractfactory;

public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public AbstractProductA createA() {
		System.out.println("ConcreteFactory1 : createA()");
		AbstractProductA abproductA=new ProductA1();	
		return abproductA;
	}

	@Override
	public AbstractProductB createB() {
		System.out.println("ConcreteFactory1 : createB()");
		AbstractProductB abproductB=new ProductB1();
		return abproductB;
	}

}
