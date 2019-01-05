package module1_2;
import java.util.Scanner;

public class ArrayFirstAndLastElementTest {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // set the array length
        System.out.println("Enter array length");
        int arrayLen = userInput.nextInt();
        int array_1[] = new int[arrayLength];

        // create the array with user input
        for(int i=0; i<arrayLen; i++) {
            System.out.println("Enter number " + (i+1) + " :");
            array[i]=userInput.nextInt();
        }

        // test first and last element
        if(array_1[0] == array_1[arrayLen-1]) {
            System.out.println("First and last element ARE equal");
        } else {
            System.out.println("First and last element are NOT equal");
        }
    }

}
