
public class NumWords {
	public static void main(String args[]) {
        int num = Integer.parseInt(args [0]);

		int num1 = num / 100;
		int num2 = (num % 100) / 10;
		int num3 = num % 10;
        
		System.out.println(num1 + " hundreds, " + num2 +
		                   " tens, and " + num3 + " ones.");
	
			
	}
}

