import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter data");
		String data=sc.next();
		data=data.toUpperCase();
		int[]count= {
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
		};
		char ch=' ';
		int index ;
		String result="";
		
		for(int i=0;i<data.length();i++);
		ch = data.charAt(1);
		if(ch>='A' && ch<='Z') {
			index=(int)(ch -65);
			count[index]++;
		}
	
	for(int i=0;i<26;i++) {
		if(count[i]>0)
			System.out.println("["+(char)(i+65)+"]--->"+count[i]);
		}
		

	}

}
