package ua.radchenko.c.builder1;

public class ConcreteBuilder2 extends Builder {

	@Override
	public void buildPart1(int part1) {
		product.setPart1(part1);

	}

	@Override
	public void buildPart2(String part2) {
		product.setPart2(part2);

	}

}
