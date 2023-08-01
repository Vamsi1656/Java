// Array is a collection of similar data.
// It is Homogeneous data element(which has similar data type)
// Elements are storing in contiguous memory location based on indexing.
// Indexing is starting from 0 to n-1
class Array{

    public static void main(String args[]){

          int[] values={10,20,30,40,50};
          System.out.println(values); // Here it gives the address of an array because we are not applying indexing 
                                      // concept to get the values of array.

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        System.out.println(values[3]);
        System.out.println(values[4]);
        System.out.println(values[10]); // Here we get an error because we have only 5 indexing values 
                                        // But we give 10 so it shows an error Array indexing out of bound
    }
}