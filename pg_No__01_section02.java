/*
Print the following patterns:
5
4 5
3 4 5
2 3 4 5
1 2 3 4 5
 */
package day2Assignment;
import java.util.Scanner;
public class pg_No__01_section02 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no. of row");
		int x=input.nextInt();
		for(int i=1;i<=x;i++) {
			for (int j=i;j>0;j--) {
				System.out.print(x-j+1);
			}
			System.out.println();
		}
	}

}
