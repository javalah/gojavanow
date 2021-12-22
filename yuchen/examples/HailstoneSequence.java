package yuchen.examples;

public class HailstoneSequence {
  public static void main(String[] args) {
    int t1 = 30;
    int t2;

    for(int i= 0; i< 100; i++){
      if(t1 % 2 == 0){
        t2 = t1/2;
      } else {
        t2 = 3*t1 +1 ;
      }
      System.out.println(t2);
      t1 = t2;
    }
  }
    
  
}
