class a extends Thread{
    public void run(){
        try{
            Thread.sleep(1000);
        }catch(Exception e){}
    }
}

class main14{
    public static void main(String[] a){
        a t=new a();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
    }
}