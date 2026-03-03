abstract class shape{
    abstract double area();
}

class circle extends shape{
    double r;
    circle(double r){
        this.r=r;
    }
    double area(){
        return 3.14*r*r;
    }
}

class rectangle extends shape{
    double l,b;
    rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    double area(){
        return l*b;
    }
}

class main1{
    public static void main(String[] a){
        shape s1=new circle(5);
        shape s2=new rectangle(4,6);
        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}