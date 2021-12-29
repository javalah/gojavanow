package yuchen.examples;

import java.util.Scanner;


public class PrintRectangle {
  public void PrintRectangle1() {
      
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Length : ");
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
}private boolean PrintChar(char c) {
        System.out.print(c);
        return true;
    }

  
  }
  

