import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int N = sc.nextInt();

        int count = 0;

        System.out.println("Even numbers:");

        for (int i = 2; i <= N; i += 2) {
            System.out.println(i);
            count++;
        }

        System.out.println("Count of even numbers: " + count);

        sc.close();
    }
}