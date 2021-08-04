package FlixBus;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Flixbus coding challenge question 5
 *
 * Write a function solution that, given an integer N, returns the maximum possible value obtainable
 * by deleting one '5' digit from the decimal representation of N. It is guaranteed that N
 * will contain at least one '5' digit.
 *
 * Examples: Given N = 15958, the function should return 1958
 *           Given N = -5859, the function should return -589
 *           Given N = -5000, the function should return 0
 *
 * Assume that:
 * N is an integer within the range [-999,995 to 999,995]
 * N contains at least one '5' digit in its decimal representation
 * N consists of at least two digits in its decimal representation
 */
public class Main {

    public static void main(String[] args) {
//        int N = 15958;
//        int N = -5859;
//        int N = -5000;
        int N = -5000;

//        Possible extreme cases
//        int N = 50;
//        int N = 5005;
//        int N = 555;
//        int N = 555;

        System.out.println(solution(N));
    }

    private static int solution(int N) {
        // Break to char array
        char[] number = String.valueOf(N).toCharArray();

        // Add to char list
        ArrayList<Character> numberList = new ArrayList<>();
        for (char numChar : number) {
            numberList.add(numChar);
        }

        // Loop through the number char array
        // if 5, then clone the number char array
        // then delete 5 at the current index,
        // cast the modified char array into int,
        // then store it in a new int array
        // Finally, return the max of the new array of numbers

        ArrayList<Integer> modifiedNumberList = new ArrayList<>();

        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) == '5') {
                ArrayList<Character> numberListClone = (ArrayList) numberList.clone();

                // Delete 5 at index
                numberListClone.remove(i);

                // convert number list clone into string
                String str = "";
                for (char numChar : numberListClone) {
                    str += numChar;                 // this line is not efficient, since strings are immutable and a new str instance is always created
                }
//                char[] numberListCloneArray = numberListClone.;
//                new String(numberListCloneArray);

                modifiedNumberList.add(Integer.parseInt(str));
            }
        }

        // return the max of from the list of modified numbers
        return Collections.max(modifiedNumberList);
    }
}
