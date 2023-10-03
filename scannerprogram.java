package p1;

import java.util.Scanner;

public class scannerprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter a string");
		String s=in.nextLine();
		System.out.println("you entered string:"+s);
		
		System.out.println("enter a integer");
		int a=in.nextInt();
		System.out.println("you entered integer:"+a);
		
		System.out.println("enter the float");
		float f=in.nextFloat();
		System.out.println("you entered float:"+f);
		
		
		

	}

}
