package p1;

import java.util.Scanner;

public class swap2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the x and y value");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.printf("before swapping x=%d y=%d\n",x,y);
		temp=x;
		x=y;
		y=temp;
		System.out.printf("after swapping x=%d y=%d",x,y);

	}
}
