package thisUse;

public class ThisDemo {
	int a;
	int b;
	ThisDemo(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public void dis() {
		System.out.println("succsess "+ a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo td=new ThisDemo(12, 23);
		td.dis();

	}

}
