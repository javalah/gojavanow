package yuchen.examples;

public class MyMather {
  int v1, v2;

  public MyMather(int startValue, int endValue) {
    v1 = startValue;
    v2 = endValue;
  }

  public int sumOdd(int startValue, int endValue) {
    int sum = 0;
    // int startvalue = 4;
    for (int i = startValue; i <= endValue; i++) {
      if (i % 2 == 1) {
        sum = sum + i;
        // System.out.println(sum);
      }
    }
    return sum;

  }

  public int sumOdd() {
    int sum = 0;
    // int startvalue = 4;
    for (int i = v1; i <= v2; i++) {
      if (i % 2 == 1) {
        sum = sum + i;
        // System.out.println(sum);
      }
    }
    return sum;

  }

  public int sumEven(int startValue, int endValue) {
    int sum = 0;
    // int startvalue = 4;
    for (int i = v1; i <= v2; i++) {
      if (i % 2 == 0) {
        sum = sum + i;
        // System.out.println(sum);
      }
    }
    return sum;
  }

  public int sumAll(int startValue, int endValue) {
    int sum = 0;
    // int startvalue = 4;
    for (int i = startValue; i <= endValue; i++) {
      if (i % 1 == 0) {
        sum = sum + i;
        // System.out.println(sum);

      }
    }
    return sum;
  }

  public int sumAll() {
    int sum = 0;
    // int startvalue = 4;
    for (int i = v1; i <= v2; i++) {
      if (i % 1 == 0) {
        sum = sum + i;
        // System.out.println(sum);

      }
    }
    return sum;
  }
}
