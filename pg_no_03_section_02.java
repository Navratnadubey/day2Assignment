
package day2Assignment;
import java.util.Scanner;
public class pg_no_03_section_02 {
     public static void main(String args[]) {
    	 Scanner input=new Scanner(System.in);
    	 int n=input.nextInt();
    	 for(int i=1;i<=n;i++) {
    		 
    		 for(int j=n;j>=1;j--) {
    			 if(j==i) {
    				 System.out.print(j);
    			 }else {
    				 System.out.print(" ");
    			 }
    		 }
    		 for(int j=2;j<=n;j++) {
    			 if(i==j) {
    				 System.out.print(j);
    			 }else {
    				 System.out.print(" ");
    			 }
    		 }
    		 System.out.println();
    	 }
    	 for(int i=n;i>=1;i--) {
    		 for(int j=5;j>1;j--) {
    			 if(j==i) {
    				 System.out.print(" "+(j-1));
    			 }else {
    				 System.out.print(" ");
    			 }
    		 }
    		 for(int j=2;j<=i-1;j++) {
    			 if(j==(i-1)) {
    				 System.out.print(j);	 
    			 }else {
    				 System.out.print(" ");
    			 }
    			 
    		 }
    		 System.out.println();
    	 }
    	 
     }
}

