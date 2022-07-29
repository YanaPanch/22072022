package Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String answer;
        Scanner scanner = new Scanner(System.in);
        Envelope envelope1 = new Envelope();
        Envelope envelope2 = new Envelope();
        EnvelopeComparator comparator = new EnvelopeComparator();

        while (true) {
            System.out.print("Enter side A for the first envelope: ");
            envelope1.setA(input());
            System.out.print("Enter side B for the first envelope: ");
            envelope1.setB(input());
            System.out.print("Enter side A for the second envelope: ");
            envelope2.setA(input());
            System.out.print("Enter side B for the second envelope: ");
            envelope2.setB(input());
            comparator.compare(envelope1, envelope2);
            System.out.println("Do you want to repeat?(y/yes)");
            answer = scanner.next();

            if ((answer.compareToIgnoreCase("y") == 0) || (answer.compareToIgnoreCase("yes") == 0)) {
                continue;
            } else {
                break;
            }
        }
    }

    private static double input() {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter double values");
            scanner.next();
        }

        double number = scanner.nextDouble();
        if (number < 0) {
            System.out.println("You entered a negative value but we will fix it");
            number = -number;
        }

        return number;
    }

}
