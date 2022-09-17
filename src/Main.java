import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] userChoice = new int[6];

        Scanner inputUser = new Scanner(System.in);
        System.out.println("Type in 6 numbers: ");

        for (int i = 0; i < userChoice.length; i++) {
            userChoice[i] = inputUser.nextInt();
        }

        System.out.println("Type in the number to see if it already exists within the array");

        Scanner inputUserToCheck = new Scanner(System.in);
        int toCheck = inputUserToCheck.nextInt();


        for (int i = 0; i < userChoice.length; i++) {
            if (userChoice[i]== toCheck) {
                System.out.println(toCheck + " has already been entered.");
            }
        }


        for (int i = 0; i < userChoice.length; i++) {
            if (i == 0) {
                System.out.print("[ " + userChoice[i]);
            } else if (i == userChoice.length - 1) {
                System.out.print(", " + userChoice[i] + " ]");
            } else {
                System.out.print(", " + userChoice[i]);
            }
        }
//        System.out.println("\n" +  userChoice.length);

        int smallest = userChoice[0];
        int largest = userChoice[0];

        for (int i = 0; i < userChoice.length; i++) {
            if (userChoice[i] > largest) {
                largest = userChoice[i];
            }
            if (userChoice[i] <= smallest) {
                smallest = userChoice[i];
            }
        }
        System.out.println("\n The smallest number of the array is : " + smallest + "." +
                " \n The largest number of the array is : " + largest);
    }
}

