package stringDemo;

public class BiggestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" hum tumahare hain tumhare sanam janemaan mohabattaki hai kasam ";
		String[] s1=s.split(" ");
//		for(String s2:s1) {
//			System.out.println(s2);
//		}
		String s3="";
		for(int i=0;i<s1.length;i++) {
			for(int j=i+1; j<s1.length;j++) {
				if(s1[i].length()>=s1[j].length()) {
					s3=s1[i];
					
				}
			}
			
		}
		System.out.println(s3+ " "+ s3.length());

	}

}
