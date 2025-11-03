package boletin3;

public class ej7 {

	public static void main(String[] args) {
		int i = 0, n = 0, p = 1;
		while (i < 10) {
			n++;
			if (n % 2 != 0) {
				i++;
				p = p * n;
				System.out.println(p);
			}
		}
	}

}
