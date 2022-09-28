import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

        //Initializing and storing in array
        int[] marks = new int[4];
        marks[0] = 2;
        marks[1] = 2;
        marks[3] = 5;
        marks[2] = 8;
        System.out.println(marks[0]);
        //Length of array
        System.out.println(marks.length); //In arrays length is its property, and we don't call it as a function
        //sort
        Arrays.sort(marks);
        //If we already know what we got to put inside an array
        int[] numbers= {1,2,3,4,5,6};
        //2D array
        int[][] finalNumbers= {{2,3,6},{1,6,2}};
    }
}
