package jianfeng.examples;
public class HailStoneSequence {
    public static void main(String[] args) {
      
    int count = 100;
    int t1 = 50;
    for (int i = 0; i < count; i++) {
      System.out.println(t1);
        if(t1 % 2 == 0){
            t1 = t1/2;
        } else {
            t1 = 3*t1 + 1;
        }
      }
    }
  }