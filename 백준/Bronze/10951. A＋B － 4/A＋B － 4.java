import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt())
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = A + B;
            System.out.println(C);
        }
        sc .close();
    }
}
