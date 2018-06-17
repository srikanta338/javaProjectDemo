package stringDemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		String s1="abc";
		String s3=new String("abc");
		
		String s4=s3;
		System.out.println(s.equals(s3));
		System.out.println(s==s1);
		System.out.println(s1==s3);
		System.out.println(s4.equals(s1));
		System.out.println(s4==s1);
		

	}

}
