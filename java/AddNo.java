import java.util.Scanner;

public class AddNo {

	public static void main(String[] args) {
		
		Scanner abc = new Scanner(System.in);
		int n,l,index=0,p=1,res=0,c=0;
		System.out.println("enter number");
		n=abc.nextInt();
		while(n!=0) {
			l=n%10;
			n=n/10;
			index++;
			l=1+c;
			if(index==2) {
				l=l+7;
			}
			if(l>=10) {
				c=l/10;
				l=l%10;
			}
			res=res+l*p;
			p=p*10;
		}
		System.out.println("c--->"+c);
		if(c==1) {
			res=c*p+res;
		}
		System.out.println(res);
				
			}
			
		
		
	}


