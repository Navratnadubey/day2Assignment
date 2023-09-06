package day2Assignment;
import java.util.Scanner;
public class pg_no_04_section_02 {
  public static void main(String args[]) {
	  Scanner input=new Scanner(System.in);
	  int n=input.nextInt();
	  for(int i=1;i<=n;i++) {
		  for(int j=1;j<=i;j++) {
			  if(j==i) {
				  System.out.print("*");
			  }else {
				  System.out.print(" ");
			  }
		  }
		  for(int j=1;j<=2*n-2;j++) {
			  if(i==1) {
				  System.out.print("*");
			  }else if(i==n) {
				  System.out.print("*");
			  }else {
				  System.out.print(" ");
			  }
		  }
		  for(int j=1;j<=n;j++) {
			  if(j==i) {
				  System.out.print("*");
			  }
		  }
		  System.out.println();
	  }
  }
}
