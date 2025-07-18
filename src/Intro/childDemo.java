package Intro;

public class childDemo extends parentDemo {
	String name = "QAParentClass";

	public void getStringname() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData() {
		super.getData();
		System.out.println("I am a child class class");
	}

	public childDemo() {
		// TODO Auto-generated constructor stub
		System.out.println("chlid class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childDemo ch = new childDemo();
		ch.getStringname();
		ch.getData();
	}

}
