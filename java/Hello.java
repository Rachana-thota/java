import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
	int n=8907,rem,z=1,t;
	t=n;
	while(n!=0) {
		n=n/10;
		z=z*10;
	}
	z=z/10;
	n=t;
	while(n!=0) {
		rem=n/z;
		n=n%z;
		z=z/10;
		System.out.println(rem);
		
	}
	}
		
		

	}


