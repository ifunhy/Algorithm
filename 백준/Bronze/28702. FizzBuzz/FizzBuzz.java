import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[3];
        for (int i = 0; i < 3; i++)
            arr[i] = br.readLine();

        int idx = -1;
        int num = 0;

        for (int i = 0; i < 3; i++) {
            if (arr[i].matches("^[0-9]*$")) {
                idx = i;
                num = Integer.parseInt(arr[i]);
                break;
            }
        }

        int next = num + (3 - idx);

        if (next % 3 == 0 && next % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (next % 3 == 0) {
            System.out.println("Fizz");
        } else if (next % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(next);
        }
    }
}