import java.util.ArrayList;

/*
Find missing in second array
Given two integer arrays a and b, the task is to find the numbers which are present in the first array a, but not present in the second array b.

Note: Numbers to be returned should in order as they appear in array a.

Examples :

Input: a[] = [1, 2, 3, 4, 5, 10], b[] = [2, 3, 1, 0, 5]
Output: [4, 10]
Explanation: 4 and 10 are present in first array, but not in second array.
Input: a[] = [4, 3, 5, 9, 11], b[] = [4, 9, 3, 11, 10]
Output: [5]
Explanation: Second array does not contain element 5.
Input: a[] = [9], b[] = [7, 9, 4, 9, 9, 9]
Output: []
 */
class solutionFindMissing {
    public static ArrayList<Integer> Method_1 ( int[] a , int[] b ) {

        ArrayList<Integer> ans = new ArrayList<>();

        int lenB = b.length ;

        for ( int x : a ) {
            int j = 0 ;
            boolean check = false ;
            while ( j < lenB ) {
                if ( x==b[j] ) {
                    check = true ;
                    break;
                }
                j++;
            }
            if ( !check ) ans.add(x);
        }
        return ans ;
    }
}


public class FindMissingInSecondArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 10};
        int[] b = {2, 3, 1, 0, 5};
        System.out.println(solutionFindMissing.Method_1(a,b));
    }
}
