package ua.radchenko.c.builder1;

public class TestMainBuilder {

	public static void main(String[] args) {
		Director director = new Director();

		Builder builder1 = new ConcreteBuilder1();
		director.setConstruct(builder1);
		director.constructorProduct(10, "String1");
		Product product = director.getProduct();
		product.info();
		director.constructorProduct(11, "String2");
		Product product2 = director.getProduct();
		product2.info();

		Builder builder2 = new ConcreteBuilder2();
		director.setConstruct(builder2);
		director.constructorProduct(12, "String3");
		Product product3 = director.getProduct();
		product3.info();

	}

}
