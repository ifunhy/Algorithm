import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String[] cmd = br.readLine().split(" ");
             switch (cmd[0]) {
                case "push" :
                    queue.add(cmd[1]);
                    break;
                case "pop" :
                    String s = queue.poll();
                    System.out.println(s == null ? -1 : s);
                    break;
                case "size" :
                    System.out.println(queue.size());
                    break;
                case "empty" :
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                case "front" :
                    System.out.println(queue.peek() == null ? -1 : queue.peek());
                    break;
                case "back" :
                    LinkedList<String> q = (LinkedList<String>) queue;
                    System.out.println(q.peekLast() == null ? -1 : q.peekLast());
            }
        }
    }
}