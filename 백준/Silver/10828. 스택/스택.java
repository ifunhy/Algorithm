import java.io.*;
import java.util.Arrays;

public class Main {
    static class MyStack<E> {
        private E[] elements;
        private int size = 0;
        
        public MyStack(int capacity) {
            elements = (E[]) new Object[capacity];
        }

        public void push(E object) {
            if (size == elements.length) {
                elements = Arrays.copyOf(elements, elements.length * 2);
            }
            elements[size++] = object;
        }

        public E pop() {
            if (size == 0)
                return (null);
            E top = elements[--size];
            elements[size] = null;
            return (top);
        }

        public int size() {
            return (size);
        }

        public int isEmpty() {
            if (size == 0)
                return (1);
            else
                return (0);
        }

        public E top() {
            if (size == 0)
                return (null);
            return (elements[size - 1]);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        MyStack<Integer> stack = new MyStack<>(N);

        for (int i = 0; i < N; i++) {
            String[] cmd = br.readLine().split(" ");
            switch (cmd[0]) {
                case "push" :
                    stack.push(Integer.parseInt(cmd[1]));
                    break;
                case "pop" :
                    Integer popResult = stack.pop();
                    if (popResult == null)
                        System.out.println(-1);
                    else
                        System.out.println(popResult);
                    break;
                case "empty" :
                    System.out.println(stack.isEmpty());
                    break;
                case "size" :
                    int sizeResult = stack.size();
                    System.out.println(sizeResult);
                    break;
                case "top":
                    if (stack.isEmpty() == 1) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.top());
                    }
                    break;

            }
        }
    }
}