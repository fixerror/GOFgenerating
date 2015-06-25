package ua.radchenko.c.builder1;

public class Product {
	private int part1;
	private String part2;

	public void setPart1(int part1) {
		this.part1 = part1;
	}

	public void setPart2(String part2) {
		this.part2 = part2;
	}

	public void info() {
		System.out.println("part1= " + part1 + "   part2= " + part2);
	}

}
