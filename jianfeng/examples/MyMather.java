package jianfeng.examples;

public class MyMather {
    int v1, v2;
    public MyMather(int startValue, int endValue) {
        v1= startValue;
        v2 = endValue;
    }

    public int sumEven(int startValue, int endValue){
        return 0;
    }

    public int sumEven(){
        return 0;
    }

    public int sumOdd(int startValue, int endValue){
        return 0;
    }

    public int sumAll(int startValue, int endValue){
        return 0;
    }

    public int sumAll(){
        int sum = 0;

        for(int i = v1; i <= v2 ; i++){
            sum = sum +i;
        }
        return sum;
    }


}
