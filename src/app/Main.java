package app;

public class Main {
    static int a = 8;
    static int b = 2;
    public static void main(String[] args) {
        System.out.println("My app outside");
        System.out.println("Version 2.0");

        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
    }

    private static int add(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a / b;
    }
}
