// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	    int lim = Integer.parseInt(args [0]);
	    
		int a, b, c;
		a = (int)(Math.random() * lim);
		b = (int)(Math.random() * lim);
		c = (int)(Math.random() * lim);
		
		int min, middle, max;
		min = Math.min(a, b);
		min = Math.min(min, c);
		max = Math.max(a, b);
		max = Math.max(max, c);
		middle = a + b + c - min - max;
		
	    
		System.out.println(a + " " + b + " " + c );
		System.out.println(min + " " + middle + " " + max);
	}
}
