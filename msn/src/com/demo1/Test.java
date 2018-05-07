package com.demo1;
class Parent{
	void m1() {
		System.out.println("parent call...");
	}
}
class Child extends Parent{
	void m2() {
		System.out.println("child call.....");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1=new Parent();
		p1.m1();
		//p1.m2();//ce
		Parent p2=new Child();
		p2.m1();
		//p2.m2();//ce
		Child c1=new Child();
		c1.m1();
		c1.m2();
		Child c2=(Child) new Parent();
		//c2.m1();// java.lang.ClassCastException
		c2.m2();
		

	}

}
