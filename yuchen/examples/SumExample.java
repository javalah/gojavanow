package yuchen.examples;

public class SumExample {
  public static void main(String[] args){
  int i = 0;
  int x = i;
  int sum = 0;
  while (i < x +1001) {
    sum = sum + i;
    System.out.println(sum);
    i++;
  }  
}
}