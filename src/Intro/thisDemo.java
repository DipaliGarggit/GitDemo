package Intro;

public class thisDemo {

	int a=10;
	
	public void getData() {
		int a=5;
		System.out.println(a);
		System.out.println(this.a+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo th = new thisDemo();
		th.getData();
	}

}
