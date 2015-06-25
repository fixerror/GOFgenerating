package ua.radchenko.c.builder2;

public class Product {
	private int part1;
	private String part2;
	private int part3;
	private int part4;

	public Product(Builder builder) {
		part1 = builder.part1;
		part2 = builder.part2;
		part3 = builder.part3;
		part4 = builder.part4;
	}

	public void info() {
		System.out.println("part1= " + part1 + "   part2= " + part2
				+ "   part3= " + part3 + "   part4= " + part4);
	}

	public static class Builder {
		private int part1;
		private String part2;
		private int part3 = 0;
		private int part4 = 0;

		public Builder(int part1, String part2) {
			this.part1 = part1;
			this.part2 = part2;
		}

		public Builder setPart3(int val) {
			part3 = val;
			return this;
		}

		public Builder setPart4(int val) {
			part4 = val;
			return this;
		}

		Product build() {
			return new Product(this);
		}
	}

}
