package p1;

public class prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=10;
		int n=5;
		m=m++ + ++n - n--;
		n=n++;
		System.out.println(m);
		System.out.println(n);

	}

}
