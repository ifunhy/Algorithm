import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int num;
        for (int i = 0; i < 9; i++)
        {
            String str = br.readLine();
            num = Integer.parseInt(str);
            arr[i] = num;
        }
        int max = arr[0];
        int len = 1;
        for (int i = 1; i < 9; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                len = i + 1;
            }
        }
        System.out.println(max + "\n" + len);
    }
}