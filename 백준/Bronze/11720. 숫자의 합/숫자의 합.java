import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String str = scanner.next();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            String s = c.toString();
            int a = Integer.parseInt(s);
            sum += a;
        }
        System.out.println(sum);
    }
}
