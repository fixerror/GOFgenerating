package ua.radchenko.c.builder1;

public class ConcreteBuilder1 extends Builder{

	public void buildPart1(int part1) {
		product.setPart1(part1);
	}

	public void buildPart2(String part2) {
		product.setPart2(part2);
	}

}
