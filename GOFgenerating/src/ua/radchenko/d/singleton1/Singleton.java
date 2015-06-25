package ua.radchenko.d.singleton1;

public class Singleton {
	private final static Singleton INSTANCE = new Singleton();
	 private Singleton() { } // private constructor
	 public static Singleton getInstance() {
	  return INSTANCE;
	 }
	 
}
