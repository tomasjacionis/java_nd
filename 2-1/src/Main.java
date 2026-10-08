import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int M = sc.nextInt();

        if (M >= 1896 && (M - 1896) % 4 == 0) {
            int edition = (M - 1896) / 4 + 1;
            System.out.println(M + " is an Olympic year.");
            System.out.println("Edition number: " + edition);
        } else {
            System.out.println(M + " is not an Olympic year.");
        }

        sc.close();
    }
}