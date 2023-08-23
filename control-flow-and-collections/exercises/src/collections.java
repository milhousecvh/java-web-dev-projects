import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class collections {

    public static void main(String[] args) {

        int[] integers = {1, 1, 2, 3, 5, 8};


        int[] odds = new int[integers.length];

        int index = 0;
        for (int number : integers) {
            if (number % 2 == 1) {
                odds[index] = number;
                index++;
            }
        }
        System.out.println(Arrays.toString(odds));


        String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] words = quote.split(" ");
        System.out.println(Arrays.toString(words));
        String[] sentences = quote.split("\\.");
        System.out.println(Arrays.toString(sentences));


//        public static int sumEven(ArrayList <Integer>) {
//        int total = 0;
//        for (int integer : integers) {
//            if (integer % 2 == 0) {
//                total += integer;
//            }
//        }
//        return total;
//        }



    }
}