public class calculate
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public int multi(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }
}
class result
{
    public static void main(String args[]){
        calculate c=new calculate();
        System.out.println("Addition="+c.add(5,3));
        System.out.println("Substraction="+c.sub(7,3));
        System.out.println("Multiplication="+c.multi(5,3));
        System.out.println("Division="+c.div(10,5));
    }
}