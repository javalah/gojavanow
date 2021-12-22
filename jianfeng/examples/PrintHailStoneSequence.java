package jianfeng.examples;

public class PrintHailStoneSequence {
    int n,count;
    public PrintHailStoneSequence(int startValue, int printCount){
        n = startValue;
        count = printCount;
    }

    public void PrintSequence(){
        count = count > 0 ? count : 50;
        int t1 = n;
    
        for (int i = 1; i <= count; i++) {
          System.out.println(t1);
          if (t1 % 2 == 0) {
            t1 = t1 / 2;
          } else {
            t1 = 3 * t1 + 1;
          }
        }
    }

    public void PrintSum(){
        count = count > 0 ? count : 50;
        int sum = 0;
        int s = n;
    
        while (s <= count) {
          sum += s;
          System.out.println(sum);
          s++;
        }
    }
    
}
