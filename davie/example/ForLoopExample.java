package davie.example;

public class ForLoopExample {
    public static void main(String[] args) {
        // java for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // another example
        for (int x = 0; x <= 10; x = x + 2) {
            System.out.println(x);
        }
        // For-Each loop
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String i : cars) {
            System.out.println(i);
        }
        // java while loop
        int y = 0;
        while (y < 5) {
            System.out.println(y);
            y++;
        }
        // the do/while loop
        {
            int i = 0;
            do {
                System.out.println(i);
                i++;
            } while (i < 5);
        }
    }
}
