import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź liczbę:");
        numbers[0] = scan.nextInt();
        System.out.println("Wprowadź drugą liczbę:");
        numbers[1] = scan.nextInt();
        System.out.println("Wprowadź trzecią liczbę");
        numbers[2] = scan.nextInt();
        System.out.println("Wprowadź czwartą liczbę");
        numbers[3] = scan.nextInt();
        System.out.println("Wprowadź piątą liczbę");
        numbers[4] = scan.nextInt();

        int summary = numbers[0] + numbers[2] + numbers[4];
        System.out.println("Suma pierwszej, trzeciej i piątej liczby to: " + summary);


    }
}
