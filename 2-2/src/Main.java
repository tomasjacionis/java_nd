import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int h = sc.nextInt();

        System.out.print("Enter minutes: ");
        int m = sc.nextInt();

        System.out.print("Enter seconds: ");
        int s = sc.nextInt();

        s++;

        if (s == 60) {
            s = 0;
            m++;

            if (m == 60) {
                m = 0;
                h++;

                if (h == 24) {
                    h = 0;
                }
            }
        }

        System.out.println("Time after one second:");
        System.out.println("h = " + h);
        System.out.println("m = " + m);
        System.out.println("s = " + s);

        sc.close();
    }
}