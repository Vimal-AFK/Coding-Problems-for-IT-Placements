public class BubbleSort {


    public static void bubbleSort( int[] arr ) {
        int n = arr.length ;
        boolean swapped = false ;
        for ( int i = 0 ; i < arr.length ; i++ ) {

            for ( int j = 0 ; j < arr.length - i  - 1 ; j++ ) {
                if ( arr[j] > arr[j+1] ) {
                    int temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                    swapped = true ;
                }
            }

            if ( swapped == false ) {
                System.out.println("Got Breaked");
                break ;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println();
        int[] arr = { 1,2,3,4,5};
        bubbleSort(arr);
        for ( int x : arr  )
        System.out.print(x);
    }
}
