package ua.radchenko.d.singleton3;

import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
	private static Singleton instance = null;
	private static ReentrantLock lock = new ReentrantLock();

	private Singleton() {
	}

	public static Singleton getInstance() {
		lock.lock(); // блокировка
		try {
			if (instance == null) {
				instance = new Singleton();
			}
		} finally {
			lock.unlock(); // снятие блокировки
		}
		return instance;
	}

}