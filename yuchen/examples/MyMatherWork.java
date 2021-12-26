package yuchen.examples;

public class MyMatherWork {
  public static void main(String[] args) {

    // print out sum even
    int sum = sumEven(1, 100);
    System.out.println("sum even now!");
    System.out.println("the sum of all even numbers from 1 to 100 =" + sum);

    //new mather
    MyMather m = new MyMather(1, 1000);

    // sum odd
    System.out.println("sum odd now!");
    //MyMather p = new MyMather(4, 5);

    sum = m.sumOdd();
    System.out.println("the sum of all odd numbers from 1 to 1000 =" + sum);

    // sum all
    System.out.println("sum all now!");
    //MyMather v = new MyMather(4, 5);

    sum = m.sumAll();
    System.out.println("the sum of every number from 1 to 1000=" + sum);

  }

  public static int sumEven(int startValue, int endValue) {
    int sum = 0;
    // int startvalue = 4;
    for (int i = startValue; i <= endValue; i++) {
      if (i % 2 == 0) {
        sum = sum + i;
        // System.out.println(sum);
      }
    }
    return sum;
  }
}