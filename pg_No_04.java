/*
Print first 10 even fibonacii numbers
 */
package day2Assignment;
import java.util.Scanner;
public class pg_No_04 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the value : ");
		int x=input.nextInt();
		int a=0;
		int b=1;
		int c;
		int count=0;
		int i=0;
		while(count<x){
			c=a+b;
			if(c%2==0) {
				System.out.print(" "+c);
				count++;
			}
			
			a=b;    
			b=c; 
			i++;

		}
	}

}

