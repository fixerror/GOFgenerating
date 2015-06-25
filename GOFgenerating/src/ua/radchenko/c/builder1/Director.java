package ua.radchenko.c.builder1;

public class Director {
	private Builder builder;

	public void setConstruct(Builder br) {
		builder = br;
	}

	public Product getProduct() {
		return builder.getResult();
	}

	public void constructorProduct(int part1, String part2) {
		builder.createNewProduct();
		builder.buildPart1(part1);
		builder.buildPart2(part2);
	}

}
