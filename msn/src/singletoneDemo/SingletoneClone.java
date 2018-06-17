package singletoneDemo;

class SuperClass implements Cloneable{
	int i=10;
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}

class Singleton extends SuperClass{
	public static Singleton sing=new Singleton();
	private Singleton() {
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return sing;
		
	}
}
public class SingletoneClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Singleton ins1=Singleton.sing;
		Singleton ins2=(Singleton) ins1.clone();
		System.out.println(ins1.hashCode());
		System.out.println(ins2.hashCode());

	}

}
