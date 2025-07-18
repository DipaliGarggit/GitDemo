package Intro;

public class StaticVar {
	
	String name;
	String address;
	String city="Indore";
	static int i=0;
	
	public StaticVar(String name,String address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.address=address;
		System.out.println(city);
		i++;
		System.out.println(i);
	}
	
	public void getAddress() {
		//System.out.println(city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar str = new StaticVar("Rahul","SapnaSangeeta");
		StaticVar str1 = new StaticVar("Rony ","Palasia");
		str.getAddress();
		str1.getAddress();
	}

}
