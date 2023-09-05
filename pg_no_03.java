/*
 3. Input the lower bound and upper bound then print all the Fibonacci numbers within the
bound
Test case : Input lower =5 and upper= 40

Output: 5 8 13 21 34          
 */
package day2Assignment;
import java.util.Scanner;
public class pg_no_03 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Input lower : ");
		int x=input.nextInt();
		System.out.println("Enter the upper bound : ");
		int y=input.nextInt();
		int a=0;
	   	int b=1;
		 for(int i=0;i<y;i++)    
		 {    
		        int c=a+b;
		        if(c>=x&&c<=y) {
		        	System.out.print(" "+c);    
		        }
		  a=b;    
		  b=c;    
	}

}
}
