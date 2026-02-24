import java.util.*;
public class prog6 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=1;
		for(int i=2;i*i<=a;i++){
			if(a%i==0)
				count++;
		}
		if(count>1)
			System.out.println("NOT PRIME");
		else
			System.out.println("PRIME");
	}
}