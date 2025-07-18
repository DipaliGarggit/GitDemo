package Intro;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o= new Overloading();
		o.add(3,4);
		o.add2(1, 10, 9);
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add2(int a,int b,int c) {
		System.out.println(a+b+c);
		
	}
	
}
