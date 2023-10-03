package p1;
import java.util.*;
public class zoho5pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character:");
		char ch=sc.next().charAt(0);
		int a=(int)(Character.toUpperCase(ch));
//		
		for(int i=a;i>=65;i--) {
			for(int j=65;j<=i;j++) {
				System.out.print((char)(i));
				
				}
			System.out.println();
		}

	}

}
