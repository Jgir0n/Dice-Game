package HWtest;

import java.util.Scanner;
import HW5.Dice;

public class TestDice {

    public static void main(String[] args) {
        Dice dice = new Dice();
        int rollCount = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("This is a Dice roll test\n");

        String ans;

        // Ask first
        do {
            // Validate input
            do {
                System.out.print("Would you like to roll? (Y/N): ");
                ans = scan.nextLine().trim();
            } while (!ans.equalsIgnoreCase("Y") && !ans.equalsIgnoreCase("N"));

            // Roll only if answer is Y
            if (ans.equalsIgnoreCase("Y")) {
                dice.roll();
                System.out.println();
                System.out.println("The dice come up " + dice.getDie1());
                System.out.println();
                rollCount++;
            }

        } while (ans.equalsIgnoreCase("Y"));

        // Last roll info if player said N
        System.out.println("Your last roll value was: " + dice.getValue());
        System.exit(0);
    }
}

