import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek knygų vidutiniškai perskaito per mėnesį");
        int v = sc.nextInt(); // average books read per month
        System.out.println("Kiek vidutiniškai lankytojų yra per metus");
        int n = sc.nextInt(); // average visitors per year

        double k = (double) (v * 12) / n;

        System.out.println("Vidutiniškai per metus vienas lankytojas perskaito: "+ k);
    }
}