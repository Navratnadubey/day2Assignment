//Write a program to calculate Cosine series
//cos x=1-((x^2)/2!)+((x^4)/4!)-((x^6)/6!)------------------((x^n)/n!)
package day2Assignment;
import java.util.Scanner;
public class pg_No_01 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value");
		double x=input.nextDouble();
	    x=Math.toRadians(x);
		double fact=1;
		double sum=1;
		double num=1;
		for(double i=2;i<=18;i++) {
			fact=fact*i;
			if(i%2==0) {
				num=-num*x*x;
				sum=sum+((num/fact));

			}
		}
		System.out.println("The sum of the series putting the value of x: "+sum);
	}

}
