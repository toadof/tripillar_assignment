class a{
    int c=0;
    synchronized void m(){
        c++;
        System.out.println(c);
    }
}

class main13{
    public static void main(String[] a){
        a o=new a();
        Thread t1=new Thread(()->{for(int i=0;i<5;i++) o.m();});
        Thread t2=new Thread(()->{for(int i=0;i<5;i++) o.m();});
        t1.start();
        t2.start();
    }
}