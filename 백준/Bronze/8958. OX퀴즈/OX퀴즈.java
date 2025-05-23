import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num];

        for (int i = 0; i < num; i++)
            arr[i] = br.readLine();

        for (int i = 0; i < arr.length; i++)
        {
            int count = 0;
            int sum = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O')
                    count++;
                else
                    count = 0;
                sum += count;
                }
            System.out.println(sum);
        }
    }
}