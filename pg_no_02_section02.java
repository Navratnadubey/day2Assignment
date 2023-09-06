//A
//C B
//E D C
//G F E D
//I H G F E
//G F E D
//E D C
//C B
//A
package day2Assignment;
import java.util.Scanner;
public class pg_no_02_section02 {
     public static void main(String args[]) {
    	 Scanner input=new Scanner(System.in);
    	 int n=input.nextInt();
    	 for(int i=1;i<=n;i++) {
    		 for(int j=i*2-1;j>=i;j--) {
    			 System.out.print((char)(j+64));
    		 }
    		 System.out.println();
    	 }
    	 for(int i=n-1;i>0;i--) {
    		 for(int j=i*2-1;j>=i;j--) {
    			 System.out.print((char)(j+64));
    		 }
    		 System.out.println();
    	 }
     }
}
