package examen;

public class recursiva {

	public static void main(String[] args) {
		int num=5;
		System.out.println(factorial(num));
	}
	public static int factorial(int n) {
		int res;
		if(n==0) {
			res=1;
		}else {
			res=n*factorial(n-1);
		}
		return res;
	}
}
