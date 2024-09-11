package studio2;

import java.util.Scanner;

public class PI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int numDarts = in.nextInt();
		int inCircle = 0;
		for (int darts = 1; darts <= numDarts; darts++) {
			double x = Math.random();
			double y = Math.random();
			double distance = Math.sqrt(((x-0.5)*(x-0.5)+(y-0.5)*(y-0.5)));
			if (distance <= 0.25) {
				inCircle++;
				System.out.println(inCircle);
			}
		}
		double pi = 4*(inCircle/numDarts);
		System.out.println(pi);

	}

}
