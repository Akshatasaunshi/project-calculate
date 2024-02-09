
class calculate1 extends area{
    void add(){
        int a = 10;
        int b = 20;
        int res = a+b;
        System.out.println("Addition "+res);
    }
    void substract(){
        int a = 10;
        int b = 20;
        int diff = a-b;
        System.out.println("Substraction "+diff);
    }
    void multi(){
        int a = 10;
        int b = 20;
        int pro = a *b;
        System.out.println("product "+pro);
    }
    void division(){
        int a = 10;
        int b = 20;
        int div = a/b;
        System.out.println("division "+div);
    }
    public static void main(String args[]){
       // System.out.println("Enter two numbers");
        //Scanner s=new Scanner(System.in);
        //int a=s.nextInt();
        //int b=s.nextInt();
        
        calculate1 c=new calculate1();
        c.add();
        c.substract();
        c.multi();
        c.division();
        System.out.println("area of square is "+c.sq_area(3));
        System.out.println("area of triangle is "+c.tri_area(4,5));
    }
}