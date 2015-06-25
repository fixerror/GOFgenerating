package ua.radchenko.b.factorymethod1;

public class ConcreteCreator {

	public static Product factoryMethod(String type) {
		TypeProduct product=TypeProduct.valueOf(type.toUpperCase());
		switch(product){
		case CONCRETEPRODUCT1: return new ConcreteProduct1();
		case CONCRETEPRODUCT2: return new ConcreteProduct2();
		default : throw new EnumConstantNotPresentException(
				TypeProduct.class, product.name());

		}
	}

}
