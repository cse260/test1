package test1;

public class Fibonacci {
	public static void main (String arg[]) {
		int i=1;
		while(of(i)<=200) {
			System.out.println(of(i));
			i++;
		}
	}
	static int of(int i) {
		if(i==1||i==2)
			return 1;
		else 
			return of(i-1)+of(i-2);
	}
}
