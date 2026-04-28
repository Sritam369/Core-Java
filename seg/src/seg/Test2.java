package seg;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

        String[] arr = {"flower", "flow", "flight"};
        String result = "";

        if (arr.length == 0) {
            System.out.println(result);
            return;
        }

        String first = arr[0];

        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            for (int j = 1; j < arr.length; j++) {

                // check bounds + mismatch
                if (i >= arr[j].length() || arr[j].charAt(i) != ch) {
                    System.out.println(result);
                    return;
                }
            }

            result = result + ch;  // build prefix
        }

        System.out.println(result);
    }
}


