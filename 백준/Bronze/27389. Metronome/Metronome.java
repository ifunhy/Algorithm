import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double num = Double.parseDouble(br.readLine());
        Double result = 0.0;

        for (Double i = 0.0; i < num; i++) {
            result += 0.25;
        }
        System.out.println(result);
    }
}