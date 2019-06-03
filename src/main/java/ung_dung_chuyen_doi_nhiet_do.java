import java.util.Scanner;

public class ung_dung_chuyen_doi_nhiet_do {
    public static double celciusToFahrenheit(double celcius) {
        double farenheit = (9 * celcius) / 5 + 32;
        return farenheit;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        double celcius = 5 * (fahrenheit - 32) / 9;
        return celcius;
    }

    public static void main(String[] args) {
        int choice;
        double fahrenheit, celsius;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("input fahrenheit:");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelcius(fahrenheit));
                    break;
                case 2:
                    System.out.println("input celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celciusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }

        } while (choice != 0);

    }
}
