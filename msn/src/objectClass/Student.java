package objectClass;

public class Student {
	int id;
	String name;
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	
	public boolean equals(Object o) {
		if(o instanceof Student) {
		Student s=(Student) o;
		if(id==s.id && name.equals(s.name)) {
			return true;
		}else
			return false;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(22, "nahari");
		Student s2=new Student(33, "parahari");
		Student s3=new Student(22, "nahari");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

	}

}
