// Array is a collection of similar data.
// It is Homogeneous data element(which has similar data type)
// Elements are storing in contiguous memory location based on indexing.
// Indexing is starting from 0 to n-1
class Array{


    public static void main(String[] args){

        int[] marks={91,92,93,94};
           System.out.println(marks); // Here it gives the address of an array because we are not applying indexing 
                                      // concept to get the values of array.

           System.out.println(marks[0]);
           System.out.println(marks[1]);
           System.out.println(marks[2]);
           System.out.println(marks[3]);
           System.out.println(marks[4]);

    }
}