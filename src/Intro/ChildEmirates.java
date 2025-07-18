package Intro;

public class ChildEmirates extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirates c = new ChildEmirates();
		c.engine();
		c.safetygl(5);
		c.bodycolor();
		
	}
	
	public void safetygl(int a) {
		System.out.println("Dont follow safety guidelines");
	}

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
