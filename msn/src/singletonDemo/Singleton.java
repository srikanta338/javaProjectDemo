package singletonDemo;

public class Singleton {
	
	private static Singleton instance=null;
	String s;
	private Singleton() {
		s="i am boss";
	}
	
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton a=Singleton.getInstance();
		Singleton b=Singleton.getInstance();
		Singleton c=Singleton.getInstance();
		a.s=(a.s).toUpperCase();
		System.out.println(a.s);
		System.out.println(b.s);
		System.out.println(c.s);
		

	}

}
