/*Form the Largest Number
Given an array of integers arr[] representing non-negative integers, arrange them so that after concatenating all of them in order, it results in the largest possible number. Since the result may be very large, return it as a string */

/*
Examples:

Input: arr[] = [3, 30, 34, 5, 9]
Output: 9534330
Explanation: Given numbers are [3, 30, 34, 5, 9], the arrangement [9, 5, 34, 3, 30] gives the largest value.
Input: arr[] = [54, 546, 548, 60]
Output: 6054854654
Explanation: Given numbers are [54, 546, 548, 60], the arrangement [60, 548, 546, 54] gives the largest value.
Input: arr[] = [3, 4, 6, 5, 9]
Output: 96543
Explanation: Given numbers are [3, 4, 6, 5, 9], the arrangement [9, 6, 5, 4, 3] gives the largest value.
*/


import static java.lang.Math.min;

class solution_1 {

    public static int compare(String a, String b) {
        int len = min(a.length(), b.length());

        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i))
                return a.charAt(i) - b.charAt(i);
        }
        return a.length() - b.length();
    }

    public static String intToString(int x) {
        if (x == 0) return "0";
        char[] temp = new char[10];
        int i = 0;

        while (x != 0) {
            temp[i++] = (char) ((x % 10) + '0');
            x /= 10;
        }

        int left = 0;
        int right = i - 1;
        while (left < right) {
            char t = temp[left];
            temp[left++] = temp[right];
            temp[right--] = t;
        }

        return new String(temp, 0, i);
    }

    public static String FormTheLargest(int[] arr) {
        String[] ans = new String[arr.length];
        int k = 0;

        for (int x : arr)
            ans[k++] = intToString(x);

        for ( int i = 0 ; i < arr.length - 1 ; i++ ) {

            for ( int j = i + 1 ; j < arr.length ; j++ ) {
                int a = compare(ans[i],ans[j]);
                if ( a < 0 ) {
                    String temp = ans[i] ;
                    ans[i] = ans[j] ;
                    ans[j] = temp ;
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for ( String x : ans )  {
            res.append(x) ;
        }

        return new String(res);

    }
}


public class FormTheLargestNumber {
    public static void main(String[] args) {
        int[] arr = {54, 546, 548, 60};
        System.out.println("ANSWER = [ " + solution_1.FormTheLargest(arr) + " ]");
    }
}
