import java.util.Scanner;

public class CiclosFor {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int age, maritalStatus, height, gender;
            int matchCount = 0;
            int totalAge = 0, totalHeight = 0;
            int totalPeople = 2;
            for (int i = 1; i <= totalPeople; i++) {
                System.out.println("Ingrese la edad de la persona #" + i + ":");
                age = input.nextInt();
                
                System.out.println("Ingrese el estado civil de la persona #" + i + " (1: Soltero, 2: Casado):");
                maritalStatus = input.nextInt();
                
                System.out.println("Ingrese la estatura en centímetros de la persona #" + i + ":");
                height = input.nextInt();
                
                System.out.println("Ingrese el sexo de la persona #" + i + " (1: Hombre, 2: Mujer):");
                gender = input.nextInt();
                
                if (age > 18 && maritalStatus == 1 && height > 170 && gender == 1) {
                    matchCount++;
                    totalAge += age;
                    totalHeight += height;
                }
            }   if (matchCount > 0) {
                double averageAge = (double) totalAge / matchCount;
                double averageHeight = (double) totalHeight / matchCount;
                double matchPercentage = (matchCount / (double) totalPeople) * 100;
                
                System.out.printf("Promedio de edad de los que cumplen: %.2f años%n", averageAge);
                System.out.printf("Promedio de estatura de los que cumplen: %.2f cm%n", averageHeight);
                System.out.printf("Porcentaje de personas que cumplen con las condiciones: %.2f%%%n", matchPercentage);
            } else {
                System.out.println("Ninguna persona cumple con los criterios establecidos.");
            }
        }
    }
}
