import java.util.*;
public class prog3 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a=70;
		
		switch(a/10){
		case 10:System.out.print("A");
			break;
		case 9:System.out.print("A");
			break;
		case 8:System.out.print("B");
			break;
		case 7:System.out.print("C");
			break;
		case 6:System.out.print("D");
			break;
		case 5:System.out.print("E");
			break;
		default:
			System.out.print("F");
			break;
		}
	}
}