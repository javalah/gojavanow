package jianfeng.examples;

import java.util.Scanner;

public class HailStoneSequence3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Start Value: ");
    int n = input.nextInt();
    System.out.print("Print Count: ");
    int count = input.nextInt();
    input.close();

    System.out.println("Start Print HailStone Sequence Now!");

    PrintHailStoneSequence p = new PrintHailStoneSequence(n, count);
    p.PrintSequence();
    System.out.println("Start Print Sum Value!");
    p.PrintSum();

  }

}