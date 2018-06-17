package stringDemo;

import java.util.HashSet;
import java.util.Scanner;

public class WeightOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int weight=0;
		char prv=' ';
		HashSet<Integer>hs=new HashSet<Integer>();
		for(int i=0;i<s.length();i++) {
			char curr=s.charAt(i);
			if(curr!=prv) {
				weight=0;
			}
			weight+= curr- 'a'+1;
			hs.add(weight);
			prv=curr;
		}
		System.out.println(weight);

	}

}
