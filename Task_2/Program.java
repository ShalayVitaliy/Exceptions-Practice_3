package Task_2;

import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        try {
            int[] intArray = new int[10];
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = new Random().nextInt(1,10);
                
            }
            System.out.println(Arrays.toString(intArray));
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         
    }
}
