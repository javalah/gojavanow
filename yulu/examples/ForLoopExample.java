package yulu.examples;

public class ForLoopExample {
    public static void main(String[] args) {
        // Java For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // Another Example
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        // For-Each Loop
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String i : cars) {
            System.out.println(i);
        }
        // Java While Loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        // the Do/While Loop
        int ii = 0;
        do {
            System.out.println(ii);
            ii++;
        } while (ii < 5);
    }
}