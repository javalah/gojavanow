package jianfeng.examples;

import java.util.Scanner;

public class HailStoneSequence2 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Start Value: ");
    int n = input.nextInt();
    System.out.print("Print Count: ");
    int count = input.nextInt();
    input.close();

    System.out.println("Start Print HailStone Sequence Now!");
    PrintHailStoneSequence(n,count);

  }

  public static void PrintHailStoneSequence(int n, int count) {

    count = count > 0 ? count : 50;
    int t1 = n;

    for (int i = 0; i < count; i++) {
      System.out.println(t1);
      if (t1 % 2 == 0) {
        t1 = t1 / 2;
      } else {
        t1 = 3 * t1 + 1;
      }
    }
  }

}