import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int targetNumber, sumResult = 0, counter = 0;
            System.out.println("Ingrese el número hasta el cual desea realizar la suma:");
            targetNumber = input.nextInt();
            while (counter <= targetNumber) {
                sumResult += counter;
                counter++;
            }   System.out.println("La suma de los primeros " + targetNumber + " números naturales es: " + sumResult);
        }
    }
}
