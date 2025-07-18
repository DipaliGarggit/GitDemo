package Intro;

public class Practice {

	public static void main(String[] args) {

	
		int d[][]= {{6,7,8},{9,0,11},{2,1,3}};
		int x=d[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (d[i][j]>x){
					x=d[i][j];
				}
			}

		}
		System.out.println(x);

	}

}
