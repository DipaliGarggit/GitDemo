package Intro;

import java.util.ArrayList;


public class collectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,5,5,5,4,6,6,9,4};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i=0;i<a.length;i++) {
			
			int k=0;
			if(!arr.contains(a[i])) {
				arr.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						k++;
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
			}
		
		}
		
		
	}

}
