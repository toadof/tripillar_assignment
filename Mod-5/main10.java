class myexception extends Exception{
    myexception(String s){
        super(s);
    }
}

class main10{
    static void m(int x) throws myexception{
        if(x<0)
            throw new myexception("negative not allowed");
        else
            System.out.println("valid");
    }
    public static void main(String[] a){
        try{
            m(-5);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}