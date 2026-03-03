class a extends Thread{
    public void run(){
        System.out.println("thread class");
    }
}

class b implements Runnable{
    public void run(){
        System.out.println("runnable interface");
    }
}

class main12{
    public static void main(String[] a){
        a t1=new a();
        Thread t2=new Thread(new b());
        t1.start();
        t2.start();
    }
}