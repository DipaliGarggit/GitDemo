package Intro;

import java.util.HashMap;

public class hashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(0,"Rahul");
		hm.put(1, "Shetty");
		hm.put(2,"Academy");
		hm.put(42,"Academy");
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
	}

}
