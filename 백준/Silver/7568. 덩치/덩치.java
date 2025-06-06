import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        String[] strArr;

        for (int i = 0; i < N; i++) {
            strArr = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(strArr[0]);
            arr[i][1] = Integer.parseInt(strArr[1]);
        }

        for (int i = 0; i < N; i++) {
            int rank = 1;
            
            for (int j = 0; j < N; j++) {
                if (i == j)
                    continue;
                else if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
                    rank++;
            }
            System.out.print(rank + " ");
        }
    }
}