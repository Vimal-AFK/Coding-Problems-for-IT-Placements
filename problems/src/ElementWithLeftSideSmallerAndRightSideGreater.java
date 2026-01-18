/*
Element with left side smaller and right side greater
Given an unsorted array of arr. Find the first element in an array such that all of its left elements are smaller and all right elements of its are greater than it.

Note: Return -1 if there is no such element.

Examples :

Input: arr = [4, 2, 5, 7]
Output: 5
Explanation: Elements on left of 5 are smaller than 5 and on right of it are greater than 5.
Input: arr = [11, 9, 12]
Output: -1
Explanation: As no element here which we can say smaller in left & greater in right.
 */

class solution_element_1 {
    public static int method( int[] arr ) {
        int n = arr.length ;
        if ( n < 3 ) return -1 ;
        int leftEle = 0 ;
        int rightEle = 0 ;

        for ( int i = 0 ; i < n -1 ; i++ ) {
            if ( arr[i] < arr[i+1] ) {
                leftEle = i+1 ;
                break ;
            }
        }

        for ( int i = n - 1 ; i > 1 ; i--) {
            if ( arr[i] > arr[i-1] ) {
                rightEle = i-1 ;
                break;
            }
        }

        if ( rightEle != leftEle ) return -1 ;

        return arr[leftEle];
    }
}

public class ElementWithLeftSideSmallerAndRightSideGreater {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 7};
        System.out.println(solution_element_1.method(arr));
    }
}
