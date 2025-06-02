import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder[] arr = new StringBuilder[201];

        for (int i = 0; i <= 200; i++) {
            arr[i] = new StringBuilder();
        }

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];

            arr[age].append(age).append(" ").append(name).append("\n");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= 200; i++) {
            result.append(arr[i]);
        }
        System.out.println(result);
    }
}