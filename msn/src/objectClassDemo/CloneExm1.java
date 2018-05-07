package objectClassDemo;
class SimpleClone implements Cloneable{
	int i=10;
	int j=20;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
public class CloneExm1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		SimpleClone s1=new SimpleClone();
		System.out.println(s1.i+" "+s1.j);
		
		SimpleClone s2=(SimpleClone) s1.clone();
		System.out.println(s2.i+" "+s2.j);

	}

}
