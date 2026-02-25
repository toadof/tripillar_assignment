import java.util.*;
class animal{
	void pets(){
		System.out.print("Animal that are usuall pets are:\n");
	}

}
class dog extends animal{
	void dogs(){
		System.out.print("dogs");
	}
}
public class prog13{
	
	public static void main(String[] args){
		dog obj=new dog();
		obj.pets();
		obj.dogs();



	}}

