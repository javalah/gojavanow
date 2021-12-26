package jianfeng.examples;

public class MyMathWork {
    public static void main(String[] args) {

        MyMather mather = new MyMather(1, 100);

        //print 1~100 sum
        int sum = mather.sumAll();

        System.out.println("sum of 1~100 :" + sum);
        
    }
}
