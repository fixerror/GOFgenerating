package ua.radchenko.b.factorymethod2;

public class ConcreteCreator {

	public static ConcreteProduct1 getConcreteProduct1(){
		return new ConcreteProduct1();
	}
	public static ConcreteProduct2 getConcreteProduct2(){
		return new ConcreteProduct2();
	}
}
