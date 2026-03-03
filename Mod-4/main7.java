class a{
    public void finalize(){
        System.out.println("object destroyed");
    }
}

class main7{
    public static void main(String[] a){
        a ore=new a();
        ore=null;
        System.gc();
    }
}