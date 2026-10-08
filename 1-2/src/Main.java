import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Įveskite kambario ilgį (m): ");
        double length = sc.nextFloat();

        System.out.print("Įveskite kambario plotį (m): ");
        double width = sc.nextFloat();

        System.out.print("Įveskite plytelių kainą už 1 m²: ");
        double price = sc.nextDouble();

        double area = length * width;
        double areaWithExtra = area * 1.05; // +5% atsarga
        double totalCost = areaWithExtra * price;

        System.out.printf("Bendra plytelių kaina: %.2f €%n", totalCost);

        sc.close();
    }
}