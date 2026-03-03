class main3{
    public static void main(String[] a){
        String s="hello";
        s=s+" world";
        System.out.println(s);

        StringBuilder b=new StringBuilder("hello");
        b.append(" world");
        System.out.println(b);

        StringBuffer c=new StringBuffer("hello");
        c.append(" world");
        System.out.println(c);
    }
}