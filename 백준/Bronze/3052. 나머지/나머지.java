import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        Arrays.fill(arr, -1);
        int count = 0;
        int j = 0;

        for (int i = 0; i < 10; i++)
        {
            int rem = sc.nextInt() % 42;
            for (j = 0; j < count; j++)
            {
                if (arr[j] == rem)
                    break;
            }
            if (j == count)
            {
                arr[count] = rem;
                count++;
            }
        }
        System.out.println(count);
    }
}