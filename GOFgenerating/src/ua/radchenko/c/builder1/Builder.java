package ua.radchenko.c.builder1;

public abstract class Builder {
	Product product;

	public Product getResult() {
		return product;
	}

	public void createNewProduct() {
		product = new Product();
	}

	public abstract void buildPart1(int part1);

	public abstract void buildPart2(String part1);
}
