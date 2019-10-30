package com.test;

/*class A{
	public String m1() {
		System.out.println("String method called");
		return "String";
	}
	public Integer m2() {
		System.out.println("Integer method called");
		return 1;
	}
	public Object m() {
		System.out.println("Object method called");
		return 2;
	}
}
*/
class A{
	/*
	 * public void m1(String s) { System.out.println("Parent"); }
	 */
	
	public void m1(Integer s) {
		System.out.println("Integer");
	}
	
	public void m1(int i) {
		System.out.println("int");
	}
	 
	public void m1(Object m) {
		System.out.println("Object");
	}
}

public class Test {
	
	public static void main(String[] args) {
		A a = new A();
		a.m1(1);
		
		
		
		
		
		//B b1 = new A();
	}

}
