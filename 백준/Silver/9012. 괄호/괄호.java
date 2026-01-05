import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N  = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            int front = 0;
            int end = 0;

            if ((arr[i].charAt(0) == ')') || arr[i].charAt(arr[i].length() - 1) == '(') {
                bw.write("NO\n");
            } else {
                for (int j = 0; j < arr[i].length(); j++) {
                    char c = arr[i].charAt(j);
                    if (c == '(' && (front >= end)) {
                        front += 1;
                    }
                    if (c == ')' && (front >= end)) {
                        end += 1;
                    }
                }
                if (front == end) {
                    bw.write("YES\n");
                } else {
                    bw.write("NO\n");
                }
            }
        }
        bw.flush();
    }
}
