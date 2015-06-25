package ua.radchenko.d.singleton4;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;


public class Singleton {
	private static final int MAX_AVAILABLE = 10; // лимит экземпляров списка
	 private static Semaphore semaphore= new Semaphore(MAX_AVAILABLE, true);
	 private static ArrayList<Singleton> instances =
	   new ArrayList<Singleton >(MAX_AVAILABLE);
	 private Singleton() { }
	 public static Singleton getInstance(int index) throws SingletonException{
	  if (index >= 0 && index < instances.size()) { // доступ к элементу списка
	   return instances.get(index);
	  }
	  if (semaphore.tryAcquire()) { // уменьшение значение семафора на 1
		  Singleton tmp = new Singleton();
	   instances.add(tmp);
	   return tmp;
	  }
	  throw new SingletonException("Превышен лимит на число экземпляров");
	 }

}