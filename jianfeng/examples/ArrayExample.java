package jianfeng.examples;

public class ArrayExample {
    public static void main(String[] args) {
      String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
      System.out.println("cars[0] = "+cars[0]);
      //change index of 0
      cars[0]="Opel";
      System.out.println("cars[0] = Opel? :"+cars[0]);
      //print length
      System.out.println("cars.length = "+cars.length);
      // loop through array
      for (int i = 0; i < cars.length; i++) {
        System.out.println("cars["+i+"] = "+cars[i]);
      }
      //loop array by each
      for (String i : cars) {
        System.out.println(i);
      }

      //multidementional array
      int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
      System.out.println("myNumbers = { {1, 2, 3, 4}, {5, 6, 7} }");
      int x = myNumbers[1][2];
      System.out.println("myNumbers[1][2] = " + x); // Outputs 7

      //loop in multidimentional array
      for (int i = 0; i < myNumbers.length; ++i) {
        for(int j = 0; j < myNumbers[i].length; ++j) {
          System.out.println("myNumbers["+i+"]["+j+"] = "+myNumbers[i][j]);
        }
      }

    }
  }
  