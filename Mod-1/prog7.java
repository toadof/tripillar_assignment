import java.util.*;
public class prog7 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=6;
		for(int i=0;i<a;i++){
			for(int j=a;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
				System.out.print("*");
			for(int x=1;x<=i;x++)
				System.out.print("*");
			System.out.println(" ");

			
		}
	}
}