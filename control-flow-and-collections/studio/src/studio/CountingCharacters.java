package studio;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> letters = new HashMap<>();

        System.out.println("Tell me a quote:");
        String quote = input.nextLine();

        String lowercase = quote.toLowerCase();
        String onlyLetters = lowercase.replaceAll("[^a-xA-Z]", "");

//        System.out.println(onlyLetters);

        for (char c : onlyLetters.toCharArray()) {
            letters.put(c, letters.getOrDefault(c, 0) + 1);
        }


//
//        for (char c : quote.toCharArray()) {
//            letters.put(c, letters.getOrDefault(c, 0) + 1);
//        }
        System.out.println(letters);
    }

}
