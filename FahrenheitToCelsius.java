import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        float temperature = sc.nextFloat();
        float celsius = (temperature-32)*5/9;
        System.out.println("The Celsius is " + celsius);
    }
}
