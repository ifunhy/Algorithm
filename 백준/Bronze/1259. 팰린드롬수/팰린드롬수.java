import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String S = br.readLine();
            StringBuilder sb = new StringBuilder(S);
            String reverse = sb.reverse().toString();

            if (S.equals("0")) break;

            if (S.equals(reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}