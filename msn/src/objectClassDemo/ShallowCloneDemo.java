package objectClassDemo;
class Roll{
	int roll;
	Roll(int roll){
		this.roll=roll;
	}
	@Override
	public String toString() {
		return " [" + roll + "]";
	}
	
}

class Student implements Cloneable{
	String name;
	Roll roll;
	Student(Roll roll,String name ){
		this.roll=roll;
		this.name=name;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
	
	
}
public class ShallowCloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Roll r=new Roll(12);
		Student s1=new Student(r, "gaura");
		System.out.println(s1);
		
		Student s2=(Student) s1.clone();
		s1.roll.roll=23;
		s1.name="saswat";
		//System.out.println(s1);
		System.out.println(s2);

	}

}
