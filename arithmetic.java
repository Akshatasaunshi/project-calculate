public class arithmetic {
    int sq(int a){
        return a*a;
    }
    int cu(int a){
        return a*a*a;
    }
    int mod(int a , int b){
        return a%b;
    }
    double pow(float a ,float b){
        return Math.pow(4,6);
    }
    
    public static void main(String args[]){
        arithmetic arth= new arithmetic();
        System.out.println("Square is: "+arth.sq(5));
        System.out.println("Cube  is: "+arth.cu(3));
        System.out.println("Modulus is: "+arth.mod(5,8));
        System.out.println("Power is: "+arth.pow(2,4));

    }
}