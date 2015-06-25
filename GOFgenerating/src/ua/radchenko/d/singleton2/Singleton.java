package ua.radchenko.d.singleton2;

public class Singleton {
	 private Singleton() { } // private constructor
	 private static class SingletonHolder { // nested class
		  private final static Singleton INSTANCE = new Singleton();
		 }

	 public static Singleton getInstance() {
		 return SingletonHolder.INSTANCE;
	 }
	 
}
