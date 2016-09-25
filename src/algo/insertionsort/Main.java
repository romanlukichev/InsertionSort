package algo.insertionsort;

public class Main {

    public static void main(String[] args) {
	  int[] myArray = {4 , 11 , 9 , 0 , 19 , 12 , 3 , 86 , -5 , 52 };

        // output array
        System.out.print("{ ");
        for(int i=0 ; i<myArray.length ; i++){
            System.out.print(myArray[i] + " ");

        }
        System.out.print(" }");

        // sort array
        int[] myArray2 = insertionSort(myArray);

        System.out.println(" ");

        // output array
        System.out.print("{ ");
        for(int i=0 ; i<myArray2.length ; i++){
            System.out.print(myArray2[i] + " ");

        }
        System.out.print(" }");


    }

    public static int[] insertionSort(int[] a){

        for(int i=1 ; i<a.length ; i++){
            // i  is the first position of unsorted area

            int element = a[i] ; // element variable contains the data we intend on bringing over to sorted area
            int j = i-1; // j points to the last index position of the sorted area

            while ( j>=0 && a[j]>element ){
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = element;
        }

        return a;
    }
}
