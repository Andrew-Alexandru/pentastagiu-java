package module1_2;

import java.util.Arrays;
import java.util.Scanner;

public class CompareTwoArrays {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // set the array one length
        System.out.println("Enter the length for array one:");
        int arrayoneLen = userInput.nextInt();
        int arrayone[] = new int[arrayoneLen];

        // create the array one with user input
        for(int i=0; i<arrayoneLen; i++) {
            System.out.println("Enter number " + (i+1) + " :");
            arrayone[i]=userInput.nextInt();
        }
        // set the array two length
        System.out.println("Enter the length for array number two:");
        int arraytwolen = userInput.nextInt();
        int arraytwo[] = new int[arrayTwoLength];

        // create the array two with user input
        for(int i=0; i<arraytwolen; i++) {
            System.out.println("Enter number " + (i+1) + " :");
            arraytwo[i]=userInput.nextInt();
        }

        // display the arrays
        System.out.println("The first array you entered is: ");
        for(int i=0; i<arrayoneLen; i++) {
            System.out.print(arrayone[i] + " ");
        }
        System.out.println(" ");
        System.out.println("The second array you entered is: ");
        for(int i=0; i<arraytwolen; i++) {
            System.out.print(arraytwo[i] + " ");
        }
        System.out.println(" ");
        // test first and last element
        if(Arrays.equals(arrayone, arraytwo)){
            System.out.println("Both arrays are equal");
        } else {
            System.out.println("The arrays are not equal");
        }
    }

}
