class main9{
    public static void main(String[] a){
        try{
            int x=10/0;
        }catch(Exception e){
            System.out.println("cannot divide by zero");
        }finally{
            System.out.println("finally block executed");
        }
    }
}