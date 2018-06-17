package collectionListToSet;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>ts=new TreeSet<>(new TreeCom());
		ts.add(34);
		ts.add(23);
		ts.add(3);
		ts.add(2);
		ts.add(24);
		ts.add(25);
		ts.add(64);
		ts.add(13);
		System.out.println(ts);

	}

}

class TreeCom implements Comparator<Integer>{
	
	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		if(i1>i2) {
			return -1;
		}else if(i1<i2) {
			return 1;
		}else return 0;
	}
}
