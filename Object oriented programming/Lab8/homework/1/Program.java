import java.util.*;

public class Program {
	public static void main(String[] args) {
		Vector<Integer> x = new Vector<Integer>();
		Vector<Double> y = new Vector<Double>();
		
		System.out.print("enter n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print(String.format("enter a[%d] = ", i));
			int tmp = sc.nextInt();
			x.add(tmp);
		}
		
		for (Integer value : x) {
			y.add(2 * Math.pow(value, 2) + 1);
		}
		
		System.out.println(x);
		System.out.println(y);
	}
}
