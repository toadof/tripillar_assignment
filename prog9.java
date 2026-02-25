import java.util.*;
public class prog9{
	static boolean pali(String n){
		for(int i=0,j=n.length()-1;i<n.length();i++,j--)
			if(n.charAt(i)!=n.charAt(j))
				return false;
		return true;

	}

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		String a="racecar";
		System.out.print(pali(a));

	}
}