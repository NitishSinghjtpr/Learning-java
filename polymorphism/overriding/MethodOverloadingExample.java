


    public class MethodOverloadingExample {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double numbers
    double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();

        System.out.println("Addition of two integers: " + obj.add(10, 20));
        System.out.println("Addition of three integers: " + obj.add(10, 20, 30));
        System.out.println("Addition of two doubles: " + obj.add(5.5, 4.5));
        System.out.println("Concatenation of strings: " + obj.add("Hello ", "World"));
    }
}


