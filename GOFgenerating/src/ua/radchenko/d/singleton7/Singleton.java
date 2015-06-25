package ua.radchenko.d.singleton7;

public class Singleton {
	private static Singleton instance = null;
	private volatile static boolean instanceCreated = false;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (!instanceCreated) {
			synchronized (Singleton.class) {
				// или любой другой тип блокировки
				// например, Lock или Semaphore
				try {
					if (!instanceCreated) {
						instance = new Singleton();
						instanceCreated = true;
					}
				} catch (Exception e) {
					// обработка исключительной ситуации
					// при инициализации
				}
			}
		}
		return instance;
	}
}