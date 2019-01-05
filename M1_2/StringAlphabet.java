package module1_2;

import java.util.Scanner;

public class StringAlphabet {
    public static void main(String[] args) {

        displayString();

    }

    // find the letters index and display them
    private static void displayString () {
        String alphabet = "abcdefghijklmnopqrstvxyz";
        Scanner userInput = new Scanner(System.in);
        System.out.print("Insert letters: ");
        String user = userInput.nextLine();
        String empty = "";
        for(int i=0; i<user.length(); i++) {
            for(int j=0; j<alphabet.length(); j++) {
                if(user.charAt(i) == alphabet.charAt(j)) {
                    empty = empty.concat(Integer.toString(j)).concat(" ");
                }
            }
        }
        System.out.print("Index position of the letter: " + empty);
    }
}
