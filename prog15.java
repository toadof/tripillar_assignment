import java.util.*;
class shape{
	void f(){
		System.out.print("SHAPES\n");
	}
}
class circle extends shape{
	void f(){
		System.out.print("CIRCLES\n");
	}
	
}
class rectangele extends shape{
		void f(){
			System.out.print("RECTANGLE\n");
		}
		void f(String a){
		System.out.print(a+" RECTANGLE\n");
	}
}
public class prog15 	{
		public static void main(String[] args){
		shape a=new shape();
		shape b=new circle();
		rectangele c=new rectangele();
		a.f();
		b.f();
		c.f();
		c.f("BLUE");
	}}

