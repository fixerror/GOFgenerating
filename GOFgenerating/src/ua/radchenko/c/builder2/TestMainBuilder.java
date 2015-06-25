package ua.radchenko.c.builder2;

public class TestMainBuilder {

	public static void main(String[] args) {
		//Create Product1
		Product product1=new Product.Builder(10, "String").build();
		product1.info();
		//Create Product2
		Product product2=new Product.Builder(10, "String").setPart3(11).build();
		product2.info();
		//Create Product3
		Product product3=new Product.Builder(10, "String").setPart3(11).setPart4(12).build();
		product3.info();

	}

}
