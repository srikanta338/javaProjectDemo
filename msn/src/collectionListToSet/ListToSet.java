package collectionListToSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list=new ArrayList<String>();
		list.add("anil");
		list.add("saad");
		list.add("manoj");
		list.add("millon");
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("........................");
		Set<String>set=new HashSet<String>(list);
		for(String s:set) {
			System.out.println(s);
		}
		

	}

}
