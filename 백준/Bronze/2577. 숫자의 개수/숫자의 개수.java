import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        String[] mul = String.valueOf(A * B * C).split("");
        int[] count = new int[10];    // 0~9

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < mul.length; j++)
            {
                if (i == Integer.parseInt(mul[j]))
                    count[i]++;
            }
            System.out.printf("%s\n", count[i]);
        }
    }
}