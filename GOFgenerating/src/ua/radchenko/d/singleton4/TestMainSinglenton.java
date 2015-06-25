package ua.radchenko.d.singleton4;

public class TestMainSinglenton {

	public static void main(String[] args) {
		try {
			for(int i=0;i<11;i++ ){
			Singleton singl=Singleton.getInstance(i);
			System.out.println(i);
			}
		} catch (SingletonException e) {
			e.printStackTrace();
		}

	}

}
