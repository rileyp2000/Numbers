/**
 * @user: rileyp
 * @date: Sep 6, 2017
 * @name: Numbers.java
 */

/**
 * @author rileyp
 *
 */
import java.util.Scanner;
public class Numbers {

	/**
	 * @param args
	 * @user: rileyp
	 * @date: Sep 6, 2017
	 * @method: main
	 */
	public static void main(String[] args) {
		Scanner kybd = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n1 = kybd.nextInt();
		System.out.println("Enter another number: ");
		int n2 = kybd.nextInt();
		System.out.printf("The addition of %d and %d is %d\n", n1, n2, add(n1,n2));
		kybd.close();

	}
	
	public static int add(int n1, int n2) {
		return n1 + n2;
		
	}

}
