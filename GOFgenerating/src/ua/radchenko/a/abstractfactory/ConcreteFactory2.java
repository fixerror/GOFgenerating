package ua.radchenko.a.abstractfactory;

public class ConcreteFactory2 implements AbstractFactory {

	@Override
	public AbstractProductA createA() {
		System.out.println("ConcreteFactory2 : createA()");
		AbstractProductA abproductA=new ProductA2();	
		return abproductA;
	}

	@Override
	public AbstractProductB createB() {
		System.out.println("ConcreteFactory2 : createB()");
		AbstractProductB abproductB=new ProductB2();
		return abproductB;
	}

}
