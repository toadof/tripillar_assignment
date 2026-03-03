class a{
    static int c=0;
    a(){
        c++;
    }
    static void m(){
        System.out.println(c);
    }
}

class main6{
    public static void main(String[] a){
        new a();
        new a();
        a.m();
    }
}