 public class overloadExample
 {
   

    // 1st method - do integer numbers add karega
    int add(int a, int b) {
        return a + b;
    }

    // 2nd method - teen integer numbers add karega
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // 3rd method - do double numbers add karega
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        overloadExample obj = new overloadExample();

        System.out.println("Sum of 2 integers: " + obj.add(10, 20));
        System.out.println("Sum of 3 integers: " + obj.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + obj.add(5.5, 4.5));
    }
}

