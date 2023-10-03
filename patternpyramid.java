
package p1;
import java.util.*;

public class patternpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row=sc.nextInt();
		
		for(int i=1;i<row;i++) {
			
			for( int k=1;k<=i-1;k++) {
				System.out.print(" ");
			}
			
			for(int j=5;j>=i;j--) {
				System.out.print("* ");
			}
			
		
		System.out.println();
		
	}
	
     for(int k=1;k<=row;k++) {
    	 for(int m=4;m>=k;m--) {
    		 System.out.print(" ");
    	 }
    	 for(int l=1;l<=k;l++)
    	 {
    		 System.out.print("* ");
    		 }
    	 System.out.println();
    	 }
		
//		
	}
}
		


