package ua.radchenko.b.factorymethod3;

public class Client {


	public void operation(AbstractCreator abstractcreator) {
		Product product = abstractcreator.getProduct();
		product.info();
	}
}
