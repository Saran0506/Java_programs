package p1;
import java.util.*;

public class if_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         int h1=175;
//         int h2=150;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two number");
		int h1=sc.nextInt();
		int h2=sc.nextInt();
         if(h1>h2) {
        	 System.out.println("h1 is greatest");
         }
         else if(h1==h2) {
        	 System.out.println("both are same");
         }
         else {
        	 System.out.println("h2 is greatest");
         }
	}

}
