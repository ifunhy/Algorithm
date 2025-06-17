import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int bit = 0;
        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String[] split = br.readLine().split(" ");
            String cmd = split[0];

            switch (cmd) {
                case "add" : {
                    int num = Integer.parseInt(split[1]);
                    bit |= 1 << num;
                    break;
                }
                case "remove" : {
                    int num = Integer.parseInt(split[1]);
                    bit &= ~ (1 << num);
                    break;
                }
                case "check" : {
                    int num = Integer.parseInt(split[1]);
                    bw.write(((bit & (1 << num)) != 0 ? "1" : "0") + "\n");
                    break;
                }
                case "toggle" : {
                    int num = Integer.parseInt(split[1]);
                    if ((1 << num & bit) > 0) {
                        bit &= ~(1 << num);
                        break;
                    }
                    else {
                        bit |= (1 << num);
                        break;
                    }
                }
                case "all" : {
                    bit = (1 << 21) - 1;
                    break;
                }
                case "empty" : {
                    bit = 0;
                    break;
                }

            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}