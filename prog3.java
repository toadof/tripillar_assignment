import java.util.*;
public class prog3 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int op=sc.nextInt();
		switch(op){
		case 1:System.out.print(a);
			break;
		case 2:System.out.print(b);
			break;
		case 3:System.out.print(c);
			break;
		case 4:System.out.print(d);
			break;
		case 5:System.out.print(e);
			break;
		default:break;
		}
	}
}