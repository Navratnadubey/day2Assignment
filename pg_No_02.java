//Write a program to accept a coordinate point in a XY coordinate system
//and determine in which quadrant the coordinate point lies.
//Test Case: Input : x=0 y=5
//Output : Y axis
//Input : x=5 y=5
//Output : Ist Quadrant
package day2Assignment;
import java.util.Scanner;
public class pg_No_02 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please Enter the value of x : ");
		int x=input.nextInt();
		System.out.println("Please Enter the value of y : ");
		int y=input.nextInt();
		if(x>0 && y>0) {
			System.out.println("Ist Quadrant");
		}else if(x<0 && y>0) {
			System.out.println("IInd Quadrant");
		}else if(x<0 && y<0) {
			System.out.println("IIIrd Quadrant");
		}else if(x>0 && y<0) {
			System.out.println("IIIIrth Quadrant");
		}else if(x==0&&y>0) {
			System.out.println("Y axis");
		}else if (x>0&&y==0) {
			System.out.println("X axis");
		}else {
			System.out.println("Origin");
		}
	}

}



