package p1;

import java.util.Scanner;

public class swap2numberwithout3rdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the x and y value");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.printf("before swapping x=%d y=%d\n",x,y);
		x=x+y;
		y=x-y;
		x=x-y;
	
		System.out.printf("after swapping x=%d y=%d",x,y);

	}

}
