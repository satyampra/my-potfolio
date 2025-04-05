public class MethodOverloadingExample {

   
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
        
    }
    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();

       
        int intResult = example.add(10, 20);
        System.out.println("Sum of integers: " + intResult);

       
        double doubleResult = example.add(5.5, 3.2);
        System.out.println("Sum of floating-point numbers: " + doubleResult);
    }
}