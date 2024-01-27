class FindLargestNumber {
    public static void main(String[] args) {
    
        int num1 = 25;
        int num2 = 42;
        int num3 = 18;

        int largestNumber = findLargest(num1, num2, num3);

        System.out.println("The largest number is: " + largestNumber);
    }
    private static int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
} {
    
}
