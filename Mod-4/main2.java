interface payment{
    void pay(double a);
}

class creditcardpayment implements payment{
    public void pay(double a){
        System.out.println("paid "+a+" using credit card");
    }
}

class upipayment implements payment{
    public void pay(double a){
        System.out.println("paid "+a+" using upi");
    }
}

class main2{
    public static void main(String[] a){
        payment p1=new creditcardpayment();
        payment p2=new upipayment();
        p1.pay(1000);
        p2.pay(500);
    }
}