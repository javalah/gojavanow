package yuchen.examples;

import java.util.Scanner;

public class MyCoolDrawer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width : ");
        int w = sc.nextInt();
        System.out.println("Enter Height : ");
        int h = sc.nextInt();
        System.out.print("Enter Symbol : ");
        char c = sc.next().charAt(0);
        sc.close();
        MyCoolDrawer drawer = new MyCoolDrawer();
        drawer.PrintRectangle(w, h, c, 2);
    }

    public void PrintDiamond() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        System.out.print("Enter Symbol : ");

        char c = sc.next().charAt(0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)

            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++)

            {
                System.out.print(c);
            }
            System.out.println();

        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= n - i; j++)

            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++)

            {
                System.out.print(c);
            }
            System.out.println();
        }
        sc.close();
    }

    public void PrintCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        int r = sc.nextInt();
        System.out.print("Enter Symbol : ");
        char c = sc.next().charAt(0);
        sc.close();

        int offset = 2;

        int x0 = r + offset;
        int y0 = r + offset;

        for (int y = 1; y <= r * 2 + offset; y++) {
            for (int x = 1; x <= r * 2 + offset; x++) {
                boolean isPrintedChar = false;
                if (x >= offset && x <= 2 * r + offset && y >= offset && y <= r * 2 + offset) {
                    if (r * (r - 1) <= (x - x0) * (x - x0) + (y - y0) * (y - y0)
                            && (x - x0) * (x - x0) + (y - y0) * (y - y0) <= r * (r + 1)) {
                        isPrintedChar = true;
                    }
                }

                if (isPrintedChar) {
                    PrintChar(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void PrintRectangle() {

    }

    public void PrintRectangle(int width, int height, char symbol, int offset) {
        width = width > 0 ? width : 20;
        height = height > 0 ? height : 10;
        offset = offset > 0 ? offset : 2;
        for (int y = 1; y <= height + 1 + offset; y++) {
            for (int x = 1; x <= width + offset + 1; x++) {
                boolean printSymbol = false;
                if ((x == offset + 1 || x == width + offset + 1) && y >= offset + 1 && y <= height + offset + 1) {
                    printSymbol = true;
                }
                if ((y == offset + 1 || y == height + offset + 1) && x >= offset + 1 && x <= width + offset + 1) {
                    printSymbol = true;
                }
                if (printSymbol == true) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
                // System.out.print(symbol);
            }
            System.out.println();
        }
    }

    private boolean PrintChar(char c) {
        System.out.print(c);
        return true;
    }
}
