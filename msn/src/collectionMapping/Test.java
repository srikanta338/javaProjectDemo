package collectionMapping;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//class Color{
//	String cname;
//	String name;
//	public Color(String cname, String name) {
//		super();
//		this.cname = cname;
//		this.name = name;
//	}
//	
//}
//class Name{
//	HashSet<String>hs=new HashSet<>();
//	
//}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hs=new HashSet<>();
		hs.add("ankua");
		hs.add("patani");
		hs.add("prafula");
		HashSet<String>hs1=new HashSet<>();
		hs1.add("patani");
		hs1.add("prafula");
		hs1.add("rusia");
		HashMap<String, HashSet<String>>hm=new HashMap<>();
		hm.put("red1",hs );
		hm.put("green", hs1);
		//System.out.println(hm);
		for(Map.Entry<String, HashSet<String>> m:hm.entrySet()) {
			System.out.println(m.getKey()+ " : "+m.getValue());
		}

	}

}
