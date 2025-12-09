import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] shirts = new int[6];

        for (int i = 0; i < 6; i++) {
            shirts[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int TBundle = 0;
        int PBundle = 0;
        int PIndividual = 0;

        for (int i = 0; i < 6; i++) {
            TBundle += (shirts[i] + T - 1) / T;
        }
        System.out.println(TBundle);

        PBundle = N / P;
        PIndividual = N % P;
        System.out.print(PBundle + " " + PIndividual);
    }
}
