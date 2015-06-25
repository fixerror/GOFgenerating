package ua.radchenko.b.factorymethod4;

public abstract class AbstractCreator<T extends Product> {
	public abstract T getProduct();

}
