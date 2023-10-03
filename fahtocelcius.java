package p1;

import java.util.Scanner;

public class fahtocelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		float f,c;
//		System.out.println("enter the fahreneit");
//		Scanner sc=new Scanner(System.in);
//		f=sc.nextFloat();
//		c=(f-32)*5/9;
//		System.out.printf("temperature of celcius"+c);
//      
		
		//CELCIUS TO FARHENHEIT
		
		float f,c;
		System.out.println("enter the value celcius");
		Scanner sc=new Scanner(System.in);
		c=sc.nextFloat();
		f=c*9/5+32;
		System.out.println("celcius to fahrenheit"+f);
	}

}
