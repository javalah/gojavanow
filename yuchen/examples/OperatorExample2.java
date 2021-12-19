package yuchen.examples;
public class OperatorExample2 {
  public static void main(String[] args) {
    int x = 5;
    int y = 3;
    System.out.print("the fact that 5 equals 3 is ");
    System.out.println(x == y); 
    x = 5;
    y = 3;
    System.out.print("the fact that 5 does not equal 3 is ");
    System.out.println(x != y); 
    x = 5;
    y = 3;
    System.out.print("the fact that 5 is greater than 3 is ");
    System.out.println(x > y); 
    x = 5;
    y = 3;
    System.out.print("the fact that 5 is smaller than 3 is ");
    System.out.println(x < y); 
    x = 5;
    y = 5;
    System.out.print("the fact that 5 is greater or equal to 5 is ");
    System.out.println(x >= y); 
    x = 7;
    y = 5;
    System.out.print("the fact that 7 is smaller or equal to 5 is ");
    System.out.println(x <= y); 
  }
}
