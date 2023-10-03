package p1;
import java.util.*;
public class zoho1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Multiplication table");
		for(i=1;i<=10;i++)
		{
			System.out.println(num + "x" + i + "="+(num*i));
		}
		System.out.println("Subtraction table");
		for(i=1;i<=10;i++)
		{
			System.out.println(num + "-" + i + "="+(num-i));
		}
		          
		    }
		}
