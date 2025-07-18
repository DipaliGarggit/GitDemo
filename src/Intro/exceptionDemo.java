package Intro;

public class exceptionDemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		int b=0;
		try {
			//int k =a/b;
			//System.out.println(k);
			int arr[]=new int[5];
			System.out.println(arr[7]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("IndexOutOfBoundExceptionss");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("I catched the exception");
		}
		finally {
			System.out.println("delete cookies");
		}
	}

}
