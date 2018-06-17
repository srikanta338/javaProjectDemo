package parenthesisDemo;

import java.util.HashMap;

import java.util.Stack;

public class Expression {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("{(a)(b))}"));
		

	}

	public static boolean isValid(String s) {
		// TODO Auto-generated method stub
		Stack<Character>st=new Stack<>();
		HashMap<Character, Character>hm=new HashMap<>();
		hm.put('(', ')');
		hm.put('{', '}');
		hm.put('[', ']');
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(hm.keySet().contains(c)) {
				st.push(c);
			}else if(hm.values().contains(c)) {
				if(!st.isEmpty() && hm.get(st.peek())==c) {
					st.pop();
					
				}else {
					return false;
				}
			}
				
		}
		return st.empty();
		
		
	}

}
